package br.com.mjv.csv;

import br.com.mjv.cadastro.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeradorDeCSV {

    private Cadastro cadastro;
    private Endereco endereco;
    private Cidade cidade;
    private Celular celular;
    private Profissao profissao;
    private Empresa empresa;
    private CadastroExperiencia experiencia;
    private PretensaoSalarial pretensao;

    public GeradorDeCSV(Cadastro cadastro, Endereco endereco, Cidade cidade, Celular celular, Profissao profissao, Empresa empresa, CadastroExperiencia experiencia, PretensaoSalarial pretensao) {
        this.cadastro = cadastro;
        this.endereco = endereco;
        this.cidade = cidade;
        this.celular = celular;
        this.profissao = profissao;
        this.empresa = empresa;
        this.experiencia = experiencia;
        this.pretensao = pretensao;
    }

    public void gerarCSV() {

        StringBuilder arquivoCSV = new StringBuilder();
        arquivoCSV.append("NOME | ");
        arquivoCSV.append("CPF | ");
        arquivoCSV.append("DATA NASC. | ");
        arquivoCSV.append("SEXO | ");
        arquivoCSV.append("LOGADOURO | ");
        arquivoCSV.append("NUMERO | ");
        arquivoCSV.append("COMPLEMENTO | ");
        arquivoCSV.append("BAIRRO | ");
        arquivoCSV.append("CIDADE | ");
        arquivoCSV.append("ESTADO | ");
        arquivoCSV.append("E-MAIL | ");
        arquivoCSV.append("TELEFONE | ");
        arquivoCSV.append("CELULAR | ");
        arquivoCSV.append("WHATSAPP | ");
        arquivoCSV.append("PROFISSAO | ");
        arquivoCSV.append("EMPRESA | ");
        arquivoCSV.append("SALARIO | ");
        arquivoCSV.append("EMPREGO ATUAL | ");
        arquivoCSV.append("PRETENSÃO SALARIAL MINIMA | ");
        arquivoCSV.append("PRETENSÃO SALARIAL MAXIMA | ");
        arquivoCSV.append("HABILIDADES").append("\n");
        arquivoCSV.append(cadastro.getNome()).append(";");
        arquivoCSV.append(cadastro.getCpf()).append(";");
        arquivoCSV.append(cadastro.getDataNascimento()).append(";");
        arquivoCSV.append(cadastro.getSexo()).append(";");
        arquivoCSV.append(endereco.getLogadouro()).append(";");
        arquivoCSV.append(endereco.getNumero()).append(";");
        arquivoCSV.append(endereco.getComplemento()).append(";");
        arquivoCSV.append(endereco.getBairro()).append(";");
        arquivoCSV.append(cidade.getNome()).append(";");
        arquivoCSV.append(cidade.getEstado()).append(";");
        arquivoCSV.append(cadastro.getEmail()).append(";");
        arquivoCSV.append(cadastro.getTelefone()).append(";");
        arquivoCSV.append(celular.getNumero()).append(";");
        arquivoCSV.append(celular.isWhatsapp()).append(";");
        arquivoCSV.append(profissao.getNome()).append(";");
        arquivoCSV.append((empresa.getNome())).append(";");
        arquivoCSV.append(experiencia.getSalario()).append(";");
        arquivoCSV.append(experiencia.isEmpregoAtual()).append(";");
        arquivoCSV.append(pretensao.getValorMinimo()).append(";");
        arquivoCSV.append(pretensao.getValorMaximo()).append(";");
        arquivoCSV.append(cadastro.getHabilidades()).append(";");

        String caminhoDiretorio = "C:\\jobby\\files";
        Path caminhoArquivo = Paths.get(caminhoDiretorio + "\\cadastro.csv");
        try {
            Files.write(caminhoArquivo, arquivoCSV.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.err.println("Erro encontrado!" + e);
        }


    }
}

