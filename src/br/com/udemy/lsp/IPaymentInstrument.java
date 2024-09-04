package br.com.udemy.lsp;

public interface IPaymentInstrument {
    void validate() throws Exception;
    void collectionPayment();
}
