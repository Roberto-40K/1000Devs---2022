package com.mesttra.app.poo.televisao;

public class Controle {
    private int volumeMaximo;
    private Televisao televisao;

    public Controle(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
        this.televisao = new Televisao(0, 0);
    }

    public int diminuiVolume() {
        this.televisao.setVolumeAtual(this.televisao.getVolumeAtual() - 1);
        return this.televisao.getVolumeAtual();
    }

    public int aumentaVoluma() {
        int volumeAtual = this.televisao.getVolumeAtual();
        if (volumeAtual < volumeMaximo) {
            this.televisao.setVolumeAtual(volumeAtual + 1);
        }
        return this.televisao.getVolumeAtual();
    }

    public int aumentaCanal() {
        this.televisao.setCanalAtual(this.televisao.getCanaAtual() + 1);
        return this.televisao.getCanaAtual();
    }

    public int diminuiCanal() {
        this.televisao.setCanalAtual(this.televisao.getCanaAtual() - 1);
        return this.televisao.getCanaAtual();
    }

    public int trocarCanal(int canalNovo) {
        this.televisao.setCanalAtual(canalNovo);
        return this.televisao.getCanaAtual();
    }

    public void consultaValores() {
        System.out.println("CANAL ATUAL: " + this.televisao.getCanaAtual());
        System.out.println("VOLUME ATUAL: " + this.televisao.getVolumeAtual());
    }
}
