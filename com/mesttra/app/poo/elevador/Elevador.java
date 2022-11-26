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
        System.out.println("O ELEVADOR ESTÁ NO " + this.getAndar() + ".°" + " ANDAR");
        System.out.println("ELEVADOR TEM " + this.getQtdePessoasPresentes() + " PESSOAS");
    }

    public boolean Entra() {
        // só deve acrescentar se ainda houver espaço
        if (this.getQtdePessoasPresentes() < this.getCapacidade()) {
            this.setQtdePessoasPresentes(this.qtdePessoasPresentes++);
            return true;
        }
        return false;
    }

    public boolean Sai() {
        // só deve remover se houver alguém dentro dele
        if (this.getQtdePessoasPresentes() > 0) {
            this.setQtdePessoasPresentes(this.qtdePessoasPresentes--);
            return true;
        }
        return false;
    }

    public void Sobe(int subir) {
        // não deve subir se já estiver no último andar

        System.out.println();

        if (andar < totalAndares) {
            while (andar < subir) {
                andar++;
            }

            System.out.println("O ELEVADOR SUBIU PARA O " + andar + ".°" + " ANDAR");

        } else {
            System.out.println("ATENÇÃO! O ELEVADOR JÁ ESTÁ NO ÚLTIMO ANDAR");
        }
    }

    public void Desce(int descer) {
        // não deve descer se já estiver no térreo

        System.out.println();

        if (descer > terreo) {
            while (andar > descer) {
                andar--;
                if (andar == descer)
                    System.out.println("O ELEVADOR DESCEU PARA O " + andar + ".°" + " ANDAR");
            }

        } else if (descer == terreo) {
            System.out.println("O ELEVADOR DESCEU PARA O TÉRREO");
        }
    }
}
