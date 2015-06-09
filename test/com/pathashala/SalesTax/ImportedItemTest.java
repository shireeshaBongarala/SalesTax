package com.pathashala.SalesTax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ImportedItemTest {
    @Test
    public void checkTaxOfImportedItem(){
        ImportedItem importedItem = new ImportedItem("1 imported box of chocolates at 10.00");
        double actualTax = importedItem.getTax();

        assertThat(actualTax,is(0.05));
    }

}
