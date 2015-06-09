package com.pathashala.SalesTax;

import java.util.Arrays;

public class Item {
    String item;
    int quantity;
    String name ="";
    double price;
    double tax;
    double sellingPrice;
    String strArray[];

    public Item(String item) {
        this.strArray = item.split(" ");
        this.item = item;
        this.tax = 0.0;
        for (int i = 1; i < strArray.length - 2; i++)
            this.name += " " + strArray[i];
        this.quantity = Integer.parseInt(strArray[0]);
        this.price = Double.parseDouble(strArray[strArray.length - 1]);

    }

    public double calculatePrice() {

        if(Arrays.asList(strArray).contains("imported")) tax += 0.05;
        if (Arrays.asList(strArray).contains("book")|| Arrays.asList(strArray).contains("chocolate")||Arrays.asList(strArray).contains("chocolates")) {

        } else {
            tax += 0.10;
        }
        sellingPrice = price * (1 + tax);
        return sellingPrice;


    }

    public String displayOutput() {
      String answer = String.valueOf(this.quantity);

        answer += this.name;
        answer += ": ";
        answer += String.format("%.2f", calculatePrice());

        return answer;

    }
}
