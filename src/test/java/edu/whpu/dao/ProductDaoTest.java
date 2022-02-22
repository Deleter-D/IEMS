package edu.whpu.dao;

import edu.whpu.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProductDaoTest {

    @Autowired
    ProductDao productDao;

    @Test
    public void getAllProductTest() {
        List<Product> productList = productDao.getAllProduct();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Test
    public void insertProductTest() {
        Product product = new Product("锅巴", 3, 350, "太原");
        int i = productDao.insertProduct(product);
        System.out.println(i);
    }

    @Test
    public void deleteProductTest() {
        int i = productDao.deleteProduct(5);
        System.out.println(i);
    }

    @Test
    public void updateProductTest() {
        Product product = productDao.getProductById(6);
        product.setQuantity(650);
        int i = productDao.updateProduct(product);
        System.out.println(i);
    }

    @Test
    public void getProductByNameTest() {
        List<Product> list = productDao.getProductByName("火");
        for (Product product : list) {
            System.out.println(product);
        }
    }

    @Test
    public void getProductAddressTest() {
        List productAddress = productDao.getProductAddress();
        System.out.println(productAddress);
    }
}
