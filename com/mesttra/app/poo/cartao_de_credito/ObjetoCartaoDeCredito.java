package com.mesttra.app.poo.cartao_de_credito;

public class ObjetoCartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito C1 = new CartaoDeCredito(1600, 1500, 690, "José Alencar");
        C1.aumentaLimite(400);
        C1.realizaCompra();
        C1.imprimeFatura();
    }
}
