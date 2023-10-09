package ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Repository;



import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Model.Product;

import java.util.List;

public interface ProductInterface {
    public void addProduct(Product product);
    public void deleteProductById(int id );
    public void edit(int id , Product newProduct);
    public Product editProductById(int id);
    List<Product> getListProduct();
    List<Product> searchProductByName(String searchname);
}
