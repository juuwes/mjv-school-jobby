package br.com.mjv.cadastro;

public class PretensaoSalarial {
    private Double valorMinimo;
    private Double valorMaximo;

    public PretensaoSalarial(Double valorMinimo, Double valorMaximo) {
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
    }

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public Double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(Double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
}
