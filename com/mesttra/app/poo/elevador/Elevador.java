package com.mesttra.app.poo.elevador;

public class Elevador {
    private int terreo = 0;
    private int andar;
    private int totalAndares;
    private int capacidade;
    private int qtdePessoasPresentes;

    public Elevador(int andar, int totalAndares, int capacidades, int qtdePessoasPresentes) {

        this.setAndar(andar);
        this.setTotalAndares(totalAndares);
        this.setCapacidade(capacidades);
        this.setQtdePessoasPresentes(qtdePessoasPresentes);

    }

    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdePessoasPresentes() {
        return qtdePessoasPresentes;
    }

    public void setQtdePessoasPresentes(int qtdePessoasPresentes) {
        this.qtdePessoasPresentes = qtdePessoasPresentes;
    }

    public void status() {
        System.out.println("O ELEVADOR EST� NO " + this.getAndar() + ".�" + " ANDAR");
        System.out.println("ELEVADOR TEM " + this.getQtdePessoasPresentes() + " PESSOAS");
    }

    public boolean Entra() {
        // s� deve acrescentar se ainda houver espa�o
        if (this.getQtdePessoasPresentes() < this.getCapacidade()) {
            this.setQtdePessoasPresentes(this.qtdePessoasPresentes++);
            return true;
        }
        return false;
    }

    public boolean Sai() {
        // s� deve remover se houver algu�m dentro dele
        if (this.getQtdePessoasPresentes() > 0) {
            this.setQtdePessoasPresentes(this.qtdePessoasPresentes--);
            return true;
        }
        return false;
    }

    public void Sobe(int subir) {
        // n�o deve subir se j� estiver no �ltimo andar

        System.out.println();

        if (andar < totalAndares) {
            while (andar < subir) {
                andar++;
            }

            System.out.println("O ELEVADOR SUBIU PARA O " + andar + ".�" + " ANDAR");

        } else {
            System.out.println("ATEN��O! O ELEVADOR J� EST� NO �LTIMO ANDAR");
        }
    }

    public void Desce(int descer) {
        // n�o deve descer se j� estiver no t�rreo

        System.out.println();

        if (descer > terreo) {
            while (andar > descer) {
                andar--;
                if (andar == descer)
                    System.out.println("O ELEVADOR DESCEU PARA O " + andar + ".�" + " ANDAR");
            }

        } else if (descer == terreo) {
            System.out.println("O ELEVADOR DESCEU PARA O T�RREO");
        }
    }
}
