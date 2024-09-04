package br.com.udemy.lsp;

abstract public class NubankCard implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        //Validação básica
    }

    @Override
    public void collectionPayment() {
        System.out.println("Pagamento Realizado!");
    }
}
