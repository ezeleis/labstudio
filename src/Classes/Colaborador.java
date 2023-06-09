package Classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Colaborador {
    private String nome;
    private String dataAdmissao;
    private String dataDesligamento;
    private Cargo cargo;
    private double salario;

    private static List<Colaborador> colaboradores = new ArrayList<>();

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
    public void setDataDesligamento(String dataDesligamento) {
        this.dataDesligamento = dataDesligamento;
    }

    public double getSalario(){
        return salario;
    }
    public Cargo getCargo() {
        return cargo;
    }

    public static void adicionarColaborador(String nome, String dataAdmissao, Cargo cargo, double salario) {
        Colaborador colaborador = new Colaborador(nome, dataAdmissao, cargo, salario);
        colaboradores.add(colaborador);
    }

    public static List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public static void exibirColaboradoresAtivos() {
        for (Colaborador colaborador : colaboradores) {
            if (colaborador.getDataDesligamento() == null) {
                System.out.println("Nome: " + colaborador.getNome());
                System.out.println("Data de Admissão: " + colaborador.getDataAdmissao());
                System.out.println("Cargo: " + colaborador.getCargo());
                System.out.println("Salário: " + colaborador.getSalario());
                System.out.println();
            }
        }
    }
    public static void exibirColaboradoresPorCargo(Cargo cargo) {
        for (Colaborador colaborador : colaboradores) {
            if (colaborador.getCargo() == cargo) {
                System.out.println("Nome: " + colaborador.getNome());
                System.out.println("Data de Admissão: " + colaborador.getDataAdmissao());
                System.out.println("Cargo: " + colaborador.getCargo());
                System.out.println("Salário: " + colaborador.getSalario());
                System.out.println();
            }
        }
    }
    public static void desligarColaborador(String nome, String dataDesligamento) {
        Iterator<Colaborador> iterator = colaboradores.iterator();
        while (iterator.hasNext()) {
            Colaborador colaborador = iterator.next();
            if (colaborador.getNome().equals(nome)) {
                colaborador.setDataDesligamento(dataDesligamento);
                iterator.remove();
                System.out.println("Colaborador " + colaborador.getNome() + " desligado com sucesso.");
                return;
            }
        }
        System.out.println("Colaborador não encontrado.");
    }
}

