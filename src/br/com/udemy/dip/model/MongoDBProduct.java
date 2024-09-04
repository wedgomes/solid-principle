package br.com.udemy.dip.model;

public class MongoDBProduct implements IDbPrduct{
    @Override
    public String getProductById(String productIO) {
        return "MongoDB: Exibindo dados do Produto "+productIO;
    }
}
