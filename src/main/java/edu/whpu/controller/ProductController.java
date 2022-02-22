package edu.whpu.controller;

import edu.whpu.pojo.JsonUtil;
import edu.whpu.pojo.Product;
import edu.whpu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/getAllProduct")
    @ResponseBody
    public JsonUtil getAllProduct() {
        List<Product> productList = productService.getAllProduct();
        JsonUtil jsonUtil = new JsonUtil();
        jsonUtil.setCount((long) productList.size());
        jsonUtil.setData(productList);
//        System.out.println(jsonUtil);
        return jsonUtil;
    }

    @RequestMapping("/getProductByName")
    @ResponseBody
    public JsonUtil getProductByName(String productName) {
        List<Product> productList = productService.getProductByName(productName);
        JsonUtil jsonUtil = new JsonUtil();
        jsonUtil.setCount((long) productList.size());
        jsonUtil.setData(productList);
        return jsonUtil;
    }

    @RequestMapping("/getAddress")
    @ResponseBody
    public List<String> getProductAddress() {
        return productService.getProductAddress();
    }
}
