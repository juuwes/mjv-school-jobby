package br.com.mjv.cadastro;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Cadastro {
    private Integer id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Long telefone;
    private String email;
    List<String> habilidades;
    private Enum sexo;
    private Endereco endereco;
    private Cidade cidade;
    private Celular celular;
    private Profissao profissao;
    private Empresa empresa;
    private CadastroExperiencia experiencia;
    private PretensaoSalarial pretensao;

    public Cadastro(String nome, String cpf, LocalDate dataNascimento, Long telefone, String email, Enum sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Enum getSexo() {
        return sexo;
    }

    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public CadastroExperiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(CadastroExperiencia experiencia) {
        this.experiencia = experiencia;
    }

    public PretensaoSalarial getPretensao() {
        return pretensao;
    }

    public void setPretensao(PretensaoSalarial pretensao) {
        this.pretensao = pretensao;
    }
}



