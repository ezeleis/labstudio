package Classes;

public class Colaborador {
    private String nome;
    private String dataAdmissao;
    private String dataDesligamento;
    private Cargo cargo;
    private double salario;

    public Colaborador(String nome, String dataAdmissao, Cargo cargo, double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.dataDesligamento = null;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public String getDataAdmissao(){
        return dataAdmissao;
    }
    public String getDataDesligamento(){
        return dataDesligamento;
    }
    public double getSalario(){
        return salario;
    }
    public Cargo getCargo() {
        return cargo;
    }
}

