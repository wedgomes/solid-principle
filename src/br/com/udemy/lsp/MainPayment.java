package br.com.udemy.lsp;

// Liskoy Substitution Principle - Principio da Substituição de Liskoy

public class MainPayment {
    public static void main(String[] args) throws Exception {
//        CreditCard card = new CreditCard();
//        DebitCard card = new DebitCard();
        NubankRewards card = new NubankRewards();

        card.validate();
        card.collectionPayment();
    }
}
