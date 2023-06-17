package br.com.mjv.cadastro;

public class Celular {
    private Long numero;
    private boolean whatsapp;

    public Celular(Long numero, boolean whatsapp) {
        this.numero = numero;
        this.whatsapp = whatsapp;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }
}
