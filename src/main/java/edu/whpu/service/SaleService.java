package edu.whpu.service;

import edu.whpu.dao.SaleDao;
import edu.whpu.pojo.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    SaleDao saleDao;

    public List<Sale> getSaleList() {
        return saleDao.getSaleList();
    }

    public int insertSale(Sale sale) {
        return saleDao.insertSale(sale);
    }

    public List<Sale> getTodaySale(Date today) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formatToday = simpleDateFormat.format(today);
        return saleDao.getTodaySale(formatToday);
    }
}
