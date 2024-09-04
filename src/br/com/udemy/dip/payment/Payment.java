package br.com.udemy.dip.payment;

import br.com.udemy.dip.factory.DbProductFactory;
import br.com.udemy.dip.model.Db;
import br.com.udemy.dip.model.IDbPrduct;
import br.com.udemy.dip.model.MySQLProduct;

public class Payment {
    public void pay(String productID){
//        MySQLProduct dbProduct = new MySQLProduct();

        IDbPrduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
