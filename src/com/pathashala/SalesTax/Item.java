package com.pathashala.SalesTax;

import java.util.Arrays;

public class Item {
    String item;
    int quantity;
    String name;
    double price;
    double tax;

    public Item(String item) {
        this.item = item;
        this.tax = 0.0;
    }

    public String calculatePrice() {
        String strArray[] = item.split(" ");

        quantity = Integer.parseInt(strArray[0]);


        if(Arrays.asList(strArray).contains("imported")) tax += 0.05;
        if (Arrays.asList(strArray).contains("book")|| Arrays.asList(strArray).contains("chocolate")||Arrays.asList(strArray).contains("chocolates")) {

        } else {
            tax += 0.10;
        }
        price = Double.parseDouble(strArray[strArray.length - 1]) * (1 + tax);
        return String.format("%.2f", price);


    }

    public String displayOutput() {
        String strArray[] = item.split(" ");
        String answer = strArray[0];

        for (int i = 1; i < strArray.length - 2; i++)
            answer += " " + strArray[i];
        answer += ": ";
        answer += calculatePrice();

        return answer;

    }
}
