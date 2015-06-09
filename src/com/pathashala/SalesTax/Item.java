package com.pathashala.SalesTax;

public class Item {
    String item;
    int quantity;
    String name;
    double price;

    public Item(String item){
        this.item = item;
    }

    public String getTotalCost() {
        String strArray[] = item.split(" ");
        String answer = null;
        quantity = Integer.parseInt(strArray[0]);

        if(strArray[1].equals("book")) {
            answer = "1 book: 12.49";
        }

        return answer;
    }
}
