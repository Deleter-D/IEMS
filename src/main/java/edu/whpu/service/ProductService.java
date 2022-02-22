package edu.whpu.service;

import edu.whpu.dao.ProductDao;
import edu.whpu.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }

    public List<Product> getProductByName(String productName) {
        return productDao.getProductByName(productName);
    }

    public Product getProductById(int pid) {
        return productDao.getProductById(pid);
    }

    public List<String> getProductAddress() {
        return productDao.getProductAddress();
    }

    public int updateProduct(Product product) {
        return productDao.updateProduct(product);
    }
}
