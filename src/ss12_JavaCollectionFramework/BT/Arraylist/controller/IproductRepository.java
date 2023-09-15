package ss12_JavaCollectionFramework.BT.Arraylist.controller;


import ss12_JavaCollectionFramework.BT.Arraylist.model.Product;

import java.util.LinkedList;


public interface IproductRepository {
    public void addProduct(Product product);
    public void editProductById( int id);
    public void deleteProductById(int id );
    public void searchProductByName(String name );
    public void arrangeProductByMoney( );
    LinkedList<Product> getListProduct();
}
