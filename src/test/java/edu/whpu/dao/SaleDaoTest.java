package edu.whpu.dao;

import edu.whpu.pojo.Sale;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SaleDaoTest {

    @Autowired
    SaleDao saleDao;

    @Test
    public void getAllSaleTest() {
        List<Sale> saleList = saleDao.getAllSale();
        for (Sale sale : saleList) {
            System.out.println(sale);
        }
    }

    @Test
    public void insertSaleTest() {
        Sale sale = new Sale(3, 4.5, new Date(), 1, 3);
        int i = saleDao.insertSale(sale);
        System.out.println(i);
    }

    @Test
    public void deleteSaleTest() {
        int i = saleDao.deleteSale(3);
        System.out.println(i);
    }

    @Test
    public void updateSaleTest() {
        Sale sale = saleDao.getSaleById(4);
        sale.setCount(4);
        sale.setTotalPrice(6);
        int i = saleDao.updateSale(sale);
        System.out.println(i);
    }

    @Test
    public void getSaleListTest() {
        List<Sale> saleList = saleDao.getSaleList();
        for (Sale sale : saleList) {
            System.out.println(sale);
        }
    }

    @Test
    public void getTodaySaleTest() {
        List<Sale> saleList = saleDao.getTodaySale("2021-07-03");
        for (Sale sale : saleList) {
            System.out.println(sale);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }
}
