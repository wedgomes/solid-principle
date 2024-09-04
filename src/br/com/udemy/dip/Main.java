package br.com.udemy.dip;

import br.com.udemy.dip.payment.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.pay("250");
    }
}
