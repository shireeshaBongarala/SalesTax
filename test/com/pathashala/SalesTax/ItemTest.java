package com.pathashala.SalesTax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemTest {
    @Test
    public void toGetTheTotalCostOfItemIfABook() {
        Item item = new Item("1 book at 12.49");

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 book: 12.49"));
    }

    @Test
    public void toGetTheDifferentTotalCostOfBooks() {
        Item item = new Item("1 book at 12.00");

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 book: 12.00"));

    }
    @Test
    public void toGetTotalCostOfAMusicCD() {
        Item item = new Item("1 music CD at 14.99");

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 music CD: 16.49"));
    }
    @Test
    public void toGetTotalCostOfAChocolateBar() {
        Item item = new Item("1 chocolate bar at 0.85");

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 chocolate bar: 0.85"));
    }
    @Test
    public void toGetTotalCostOfImportedBoxOfChocolates(){
        Item item = new Item("1 imported box of chocolates at 10.00");

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 imported box of chocolates: 10.50"));
    }

}

