package ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Repository;

import ss12_JavaCollectionFramework.BT.Arraylist.model.Product;

public interface ProductInterface {
    public void addProduct(Product product);
    public void deleteProductById();
    public void editProductById( int editid);
    public void displayProduct();
}
