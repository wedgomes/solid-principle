package br.com.udemy.lsp;

public class CreditCard extends NubankCard{
    @Override
    public void validate() throws Exception {
        //Validação do cartão de crédito
        System.out.printf("Validando Limite");
        System.out.println("Limite Ok");
    }
}
