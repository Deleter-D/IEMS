package edu.whpu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    private int sid;
    private int count;
    private double totalPrice;
    private Date saleDate;
    private int uid;
    private int pid;
    private String realName;
    private String productName;

    public Sale(int count, double totalPrice, Date saleDate, int uid, int pid) {
        this.count = count;
        this.totalPrice = totalPrice;
        this.saleDate = saleDate;
        this.uid = uid;
        this.pid = pid;
    }
}
