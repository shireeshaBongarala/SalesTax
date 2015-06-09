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
        answer =strArray[0]+ " " + strArray[1]+": "+strArray[strArray.length-1];
        return answer;
    }
}
