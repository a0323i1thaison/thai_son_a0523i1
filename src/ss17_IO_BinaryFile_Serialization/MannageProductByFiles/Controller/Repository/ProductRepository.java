package ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Controller.Repository;

import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Model.Product;
import ss17_IO_BinaryFile_Serialization.MannageProductByFiles.Util.ReadingWritingFile;


import java.util.ArrayList;
import java.util.List;


public class ProductRepository implements ProductInterface{
    private final String PATH_PRODUCT = "D:\\codegym\\module2\\module2_a0523i1\\src\\ss17_IO_BinaryFile_Serialization\\MannageProductByFiles\\Data\\product.CSV";



    @Override
    public void addProduct(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getToCSV());
        ReadingWritingFile.writingToCSV(PATH_PRODUCT,stringList,true);
    }

    @Override
    public void deleteProductById(int id) {
        List<Product> productList = getListProduct();
        for (int i = 0 ; i <productList.size() ; i++) {
            if (productList.get(i).getId()==id){
                productList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Product product: productList) {
            stringList.add(product.getToCSV());
        }
        ReadingWritingFile.writingToCSV(PATH_PRODUCT,stringList,false);


    }

    @Override
    public void edit(int id, Product newProduct) {
        boolean check = false ;
         List <Product> productList = getListProduct();
         for( int i = 0 ; i < productList.size() ; i++){
             if( productList.get(i).getId()==id){
                 productList.get(i).setName(newProduct.getName());
                 check = true ;
                 break;
             }
         }
         if ( check ){
             List<String> stringList = new ArrayList<>();
             for ( Product product : productList){
                 stringList.add(product.getToCSV());
             }
             ReadingWritingFile.writingToCSV(PATH_PRODUCT,stringList,false);
         }else{
             System.out.println("không tìm thấy id");
         }

    }

    @Override
    public Product editProductById(int id) {
        List<Product> productList = getListProduct();
        for( int i = 0 ; i < productList.size(); i++){
            if ( productList.get(i).getId()==id){
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Product> getListProduct() {
        List<Product> productList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadingWritingFile.readingCSV(PATH_PRODUCT);
        // chuyển thành list
        String[] arr = null ;
        for (String string: stringList) {
            arr = string.split(",");
            Product product = new Product(Integer.parseInt(arr[0]),arr[1],arr[2], Integer.parseInt(arr[3]),arr[4]);
            productList.add(product);
        }
        return productList;
    }

    @Override
    public List<Product> searchProductByName(String searchName) {
        List<Product> productList = getListProduct();
        List<Product> searchList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(searchName)){
                searchList.add(productList.get(i));
            }
        }
        return searchList;
    }
}
