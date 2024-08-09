package com.example.productthi.repository;

import com.example.productthi.dto.ProductDto;
import com.example.productthi.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static final String GET_ALL = "select * from product;";
    private static final String GET_ALL_DTO = "select product.id, product.name, price, quantity, color,  description, category.danhmuc as category from product join category on category.id = product.category_id;";
    private static final String SAVE = "insert into product (name, price, quantity, color, description, category_id) values (?, ?, ?, ?, ?, ?);";
    private static final String DELETE_BY_ID = "delete from product where id = ?;";
    private static final String FIND_BY_ID = "select * from product where id = ?;";
    private static final String UPDATE = "update product set name = ?, price = ?, quantity = ?, color = ?, description = ?, category_id = ? where id = ?;";
    private static final String SEARCH_DTO = "select product.id, product.name, price, quantity, color , description , category.danhmuc as category from product join category on category.id = product.category_id where product.name like concat ('%', ?, '%') and category.id = ?;";

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
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
                float price = resultSet.getFloat("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                int category = resultSet.getInt("category");
                productList.add(new Product(id,name, price, quantity, color, description, category));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public List<ProductDto> findAllDto() {
        List<ProductDto> productList = new ArrayList<>();
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
                float price = resultSet.getFloat("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                String category = resultSet.getString("category");
                productList.add(new ProductDto(id, name, price, quantity, color, description, category));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public boolean add(Product product) {
        Connection connection = null;
        int rowEffected = 0;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setFloat(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescription());
            preparedStatement.setInt(6, product.getCategory());
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
    public Product findById(int id) {
        Product product = null;
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
                float price = resultSet.getFloat("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                int category = resultSet.getInt("category_id");
                product = new Product(id, name, price,quantity, color, description, category);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public boolean update(Product product) {
        int updateId = product.getId();
        Connection connection = null;
        int rowEffected = 0;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setFloat(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescription());
            preparedStatement.setInt(6, product.getCategory());
            preparedStatement.setInt(7, updateId);
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
        return rowEffected >0;
    }

    @Override
    public List<ProductDto> search(String name, int category) {
        List<ProductDto> foundProducts = new ArrayList<>();
        Connection connection = null;
        try {
            connection = DBConnect.getConnectDB();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_DTO);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2,category);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String foundName = resultSet.getString("name");
                float price = resultSet.getFloat("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                String foundCategory = resultSet.getString("category");
                foundProducts.add(new ProductDto(id, foundName, price,quantity, color, description, foundCategory));

            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return foundProducts;
    }
}
