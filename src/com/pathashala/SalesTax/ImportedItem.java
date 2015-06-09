package com.pathashala.SalesTax;

public class ImportedItem extends Item{
    public ImportedItem(String item) {
        super(item);
        this.tax = 0.05;
    }


    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
