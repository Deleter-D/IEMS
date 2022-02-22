package edu.whpu.controller;

import edu.whpu.pojo.JsonUtil;
import edu.whpu.pojo.Product;
import edu.whpu.pojo.Sale;
import edu.whpu.service.ProductService;
import edu.whpu.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    SaleService saleService;

    @Autowired
    ProductService productService;

    @RequestMapping("/getAllSale")
    @ResponseBody
    public JsonUtil getAllSale() {
        List<Sale> saleList = saleService.getSaleList();
        JsonUtil jsonUtil = new JsonUtil();
        jsonUtil.setCount((long) saleList.size());
        jsonUtil.setData(saleList);
        return jsonUtil;
    }

    @RequestMapping("/getAllProduct")
    @ResponseBody
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @RequestMapping("/saleThings")
    @ResponseBody
    public boolean saleThings(String pid, String count, String uid) {
        Product productById = productService.getProductById(Integer.parseInt(pid));
        Sale sale = new Sale();
        int mycount = Integer.parseInt(count);
        sale.setCount(mycount);
        sale.setTotalPrice(productById.getPrice() * mycount);
        sale.setSaleDate(new Date());
        sale.setUid(Integer.parseInt(uid));
        sale.setPid(Integer.parseInt(pid));
        int i = saleService.insertSale(sale);
        productById.setQuantity(productById.getQuantity() - mycount);
        productService.updateProduct(productById);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("/getTodaySale")
    @ResponseBody
    public JsonUtil getTodaySale() {
        List<Sale> todaySale = saleService.getTodaySale(new Date());
        JsonUtil jsonUtil = new JsonUtil();
        jsonUtil.setCount((long) todaySale.size());
        jsonUtil.setData(todaySale);
        return jsonUtil;
    }
}
