import br.com.mjv.cadastro.*;
import br.com.mjv.csv.GeradorDeCSV;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Cadastro candidato = new Cadastro("Juliana", "000.000.000-00",
                LocalDate.parse("1996-05-30"), 99999999999999L,
                "juliana@gmail.com", Sexo.FEMININO);
        Endereco endereco = new Endereco("Rua Caiapós", "380", "apto 18", "Vila Tupi");
        candidato.setEndereco(endereco);
        Cidade cidade = new Cidade("Praia Grande", "São Paulo");
        candidato.setCidade(cidade);
        Celular celular = new Celular(999999999L, true);
        candidato.setCelular(celular);
        Profissao profissao = new Profissao("Analista de Sistemas");
        candidato.setProfissao(profissao);
        Empresa empresa = new Empresa("Associação de Assistência a Saúde");
        candidato.setEmpresa(empresa);
        CadastroExperiencia experiencia = new CadastroExperiencia(580.00, false);
        PretensaoSalarial pretensao = new PretensaoSalarial(400.00, 1000.00);

        List habilidades = new ArrayList();
        habilidades.add("Java");
        habilidades.add("Python");
        candidato.setHabilidades(new ArrayList<>(habilidades));

        GeradorDeCSV geradorDeCSV = new GeradorDeCSV(candidato, endereco, cidade, celular, profissao, empresa, experiencia, pretensao);
        geradorDeCSV.gerarCSV();
    }
}

