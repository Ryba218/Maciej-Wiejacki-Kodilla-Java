package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Car");
        Item item = new Item(product,new BigDecimal(50000),5);
        Invoice invoice = new Invoice("F_RA 1500100900/2020");

        product.getItems().add(item);
        item.setProduct(product);
        invoice.getItems().add(item);
        item.setInvoice(invoice);

        //When
        productDao.save(product);
        int productId = product.getId();

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        itemDao.save(item);
        int itemId = item.getId();

        //Then
        Assert.assertNotEquals(0,productId);
        Assert.assertNotEquals(0,invoiceId);
        Assert.assertNotEquals(0,itemId);

        //CleanUp
        try {
            productDao.deleteById(productId);
            invoiceDao.deleteById(invoiceId);
            itemDao.deleteById(itemId);
        } catch (Exception e) {

        }

    }
}
