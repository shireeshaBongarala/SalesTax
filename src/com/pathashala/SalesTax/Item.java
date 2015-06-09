package com.pathashala.SalesTax;

public class Item {
    String item;
    int quantity;
    String name;
    double price;
    double tax;

    public Item(String item) {
        this.item = item;
    }

    public String calculatePrice() {
        String strArray[] = item.split(" ");

        quantity = Integer.parseInt(strArray[0]);


        if (strArray[1].equals("book")|| strArray[1].equals("chocolate")) {
            tax = 0;
        } else {

            tax = 10;

        }
        price = Double.parseDouble(strArray[strArray.length - 1]) * (1 + 0.01 * tax);
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
