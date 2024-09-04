package br.com.udemy.dip.model;

public class MySQLProduct implements IDbPrduct{
    public String getProductById(String productIO){
        return "Mysql: Exibindo dados do Produto "+productIO;
    }
}
