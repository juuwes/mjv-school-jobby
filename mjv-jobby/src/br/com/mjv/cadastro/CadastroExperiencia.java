package br.com.mjv.cadastro;

import java.util.Date;

public class CadastroExperiencia {
    private Integer id;
    private Double salario;
    private boolean empregoAtual;
    private Date dataContratacao;
    private Date dataDesligamento;

    public CadastroExperiencia(Double salario, boolean empregoAtual) {
        this.salario = salario;
        this.empregoAtual = empregoAtual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Date getDataDesligamento() {
        return dataDesligamento;
    }

    public void setDataDesligamento(Date dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }
}

