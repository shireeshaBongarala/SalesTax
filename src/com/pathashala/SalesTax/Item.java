package com.pathashala.SalesTax;

public class Item {
    String item;
    int quantity;
    String name;
    double price;
    double tax;

    public Item(String item){
        this.item = item;
    }

    public String getTotalCost() {
        String strArray[] = item.split(" ");
        String answer = strArray[0];
        quantity = Integer.parseInt(strArray[0]);

        // answer =strArray[0]+ " " + strArray[1]+": "+strArray[strArray.length-1];
        for(int i =1; i<strArray.length-2; i++ )
            answer += " "+strArray[i];
        answer +=": ";
            if(strArray[1].equals("book")){
            answer += strArray[strArray.length - 1];
             }
            else
            {
                tax = 10;
                price = Double.parseDouble(strArray[strArray.length-1])*(1 + 0.01 * tax);

                answer += String.format("%.2f",price);
            }

        return answer;
    }
}
