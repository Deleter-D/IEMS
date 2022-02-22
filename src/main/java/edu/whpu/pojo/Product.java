package edu.whpu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int pid;
    private String productName;
    private double price;
    private int quantity;
    private String address;

    public Product(String productName, double price, int quantity, String address) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.address = address;
    }
}
