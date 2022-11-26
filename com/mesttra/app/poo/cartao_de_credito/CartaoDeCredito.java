package com.mesttra.app.poo.cartao_de_credito;

public class CartaoDeCredito {
    double limite;
    double saldo;
    double valorDaCompra;
    String nomeDoCliente;

    public CartaoDeCredito(double limite, double saldo, double valorDaCompra, String nomeDoCliente) {
        this.limite = limite;
        this.saldo = saldo;
        this.valorDaCompra = valorDaCompra;
        this.nomeDoCliente = nomeDoCliente;
    }

    public void aumentaLimite(double aumento) {
        this.limite += aumento;
    }

    public void diminuiLimite(double diminuicao) {
        this.limite -= diminuicao;
    }

    public void realizaCompra() {
        // não deve permitir uma compra caso o limite tenha sido atingido
        if (valorDaCompra > limite) {
            System.out.println("ATENÇÃO!" + this.nomeDoCliente + " A COMPRA NÃO PODE SER PROCESSADA, LIMITE ATINGIDO");
        } else {
            this.limite -= valorDaCompra;
            System.out.println("COMPRA REALIZADA");
        }
    }

    public void imprimeFatura() {
        // imprime na tela o valor da fatura.
        System.out.println("SALDO: R$" + this.saldo);
        System.out.println("TOTAL A PAGAR: R$" + this.valorDaCompra);
        System.out.println("PAGAMENTO REALIZADO");
        System.out.println("SALDO ATUAL: R$" + (this.saldo - this.valorDaCompra));
    }
}
