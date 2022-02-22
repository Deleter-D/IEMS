package edu.whpu.dao;

import edu.whpu.pojo.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAllProduct();

    Product getProductById(int pid);

    List<String> getProductAddress();

    int insertProduct(Product product);

    int deleteProduct(int pid);

    int updateProduct(Product product);

    List<Product> getProductByName(String productName);
}
