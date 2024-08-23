package com.example.thimodule.repository;

import com.example.thimodule.dto.PhongTroDto;
import com.example.thimodule.model.PhongTro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhongTroRepository implements IPhongTroRepository{
    private static final String GET_ALL= "select * from phongtro;";
    private static final String GET_ALL_DTO = "select phongtro.id, phongtro.name, phoneNumber, startDate,description, paymenttype.thanhtoan as paymenttype from phongtro left join paymenttype on paymenttype.id = phongtro.thanhtoan_id;";
    private static final String SAVE = "insert into phongtro (name, phoneNumber,startDate, description, thanhtoan_id) values (?, ?, ?, ?, ?);";
    private static final String DELETE_BY_ID = "delete from phongtro where id = ?;";
    private static final String FIND_BY_ID = "select * from phongtro where id = ?;";
    private static final String SEARCH_DTO = "select phongtro.id , phongtro.name, phoneNumber,startDate, description, paymenttype.thanhtoan as paymenttype from phongtro join paymenttype on paymenttype.id = phongtro.thanhtoan_id where phongtro.name like concat ('%', ?, '%') and paymenttype.id = ?;";
    @Override
    public List<PhongTro> findAll() {
        List<PhongTro> phongTroList = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String startDate = resultSet.getString("startDate");
                String description = resultSet.getString("description");
                int PaymentType = resultSet.getInt("paymenttype");
                phongTroList.add(new PhongTro(id,name, phoneNumber, startDate, description, PaymentType));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return phongTroList;
    }

    @Override
    public List<PhongTroDto> findAllDto() {
        List<PhongTroDto> phongTroList = new ArrayList<>();
        Connection  connection = null;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_DTO);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String startDate = resultSet.getString("startDate");
                String description = resultSet.getString("description");
                String PaymentType = resultSet.getString("paymenttype");
                phongTroList.add(new PhongTroDto(id, name, phoneNumber, startDate, description, PaymentType));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return phongTroList;
    }

    @Override
    public boolean add(PhongTro phongTro) {
        Connection connection = null;
        int rowEffected = 0;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE);
            preparedStatement.setString(1, phongTro.getName());
            preparedStatement.setString(2, phongTro.getPhoneNumber());
            preparedStatement.setString(3, phongTro.getStartDate());
            preparedStatement.setString(4, phongTro.getDescription());
            preparedStatement.setInt(5, phongTro.getPaymentType());
            rowEffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return rowEffected >0;
    }

    @Override
    public boolean deleteById(int id) {
        Connection connection = null;
        int rowEffected = 0;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1, id);
            rowEffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return rowEffected > 0;
    }

    @Override
    public PhongTro findById(int id) {
        PhongTro phongTro = null;
        Connection connection = null;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String startDate = resultSet.getString("startDate");
                String description = resultSet.getString("description");
                int thanhtoan = resultSet.getInt("paymenttype");
                phongTro = new PhongTro(id, name, phoneNumber, startDate, description, thanhtoan);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return phongTro;
    }


    @Override
    public List<PhongTroDto> search(String name, int thanhtoan) {
        List<PhongTroDto> foundPhongTros = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_DTO);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2,thanhtoan);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String foundName = resultSet.getString("name");
               String phoneNumber = resultSet.getString("phoneNumber");
               String startDate = resultSet.getString("startDate");
                String description = resultSet.getString("description");
                String foundThanhToan = resultSet.getString("paymenttype");
                foundPhongTros.add(new PhongTroDto(id, foundName, phoneNumber, startDate, description, foundThanhToan));

            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return foundPhongTros;
    }
}
