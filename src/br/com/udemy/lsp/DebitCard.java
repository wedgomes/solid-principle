package br.com.udemy.lsp;

public class DebitCard extends NubankCard{
    @Override
    public void validate() throws Exception {
        //Validação do cartão de débito
        System.out.println("Verificando saldo");
        System.out.println("Saldo disponivel");
    }
}
