package edu.whpu.dao;

import edu.whpu.pojo.Sale;

import java.util.List;

public interface SaleDao {
    List<Sale> getAllSale();

    Sale getSaleById(int sid);

    int insertSale(Sale sale);

    int deleteSale(int sid);

    int updateSale(Sale sale);

    List<Sale> getSaleList();

    List<Sale> getTodaySale(String today);
}
