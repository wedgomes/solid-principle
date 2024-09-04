package br.com.udemy.lsp;

public class NubankRewards implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        //validações
        System.out.println("Limite OK, Rewards OK!");
    }

    @Override
    public void collectionPayment() {
        System.out.println("Pagamento Realizado com sucesso!");
        System.out.println("Pontuação creditada no Program Rewards");
    }
}
