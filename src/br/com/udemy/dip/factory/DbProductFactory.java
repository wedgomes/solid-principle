package br.com.udemy.dip.factory;

import br.com.udemy.dip.model.Db;
import br.com.udemy.dip.model.IDbPrduct;
import br.com.udemy.dip.model.MongoDBProduct;
import br.com.udemy.dip.model.MySQLProduct;

public class DbProductFactory {
    public static IDbPrduct create(Db type){
        if(type == Db.MYSQL){
            return new MySQLProduct();
        }else {
            return new MongoDBProduct();
        }

    }
}
