import Classes.Cargo;
import Classes.Colaborador;
import Classes.Nivel;

public class Main {
    public static void main(String[] args) {
        // Criar cargo
        Cargo desenvolvedor = new Cargo("Desenvolvedor", 5000.00, Nivel.JUNIOR);
        Cargo analista = new Cargo("Analista", 6000.00, Nivel.PLENO);
        Cargo tester = new Cargo("Tester", 4500.00, Nivel.JUNIOR);

        // Adicionar colaboradores
        Colaborador.adicionarColaborador("João Silva", "01/01/2022", desenvolvedor, 5000.00);
        Colaborador.adicionarColaborador("Maria Santos", "15/02/2023", analista, 6000.00);
        Colaborador.adicionarColaborador("Pedro Oliveira", "10/03/2023", tester, 4500.00);

        // Exibir colaboradores ativos
        System.out.println("Colaboradores ativos:");
        Colaborador.exibirColaboradoresAtivos();
        System.out.println();

        // Exibir colaboradores por cargo
        System.out.println("Colaboradores por cargo (desenvolvedor):");
        Colaborador.exibirColaboradoresPorCargo(desenvolvedor);
        System.out.println();

        // Desligar colaborador
        Colaborador.desligarColaborador("Maria Santos", "30/04/2023");
        System.out.println();

        // Promover colaborador
        Colaborador.promoverColaborador("João Silva", analista);
        System.out.println();

        // Listar colaboradores por salário decrescente
        System.out.println("Colaboradores por salário decrescente:");
        Colaborador.listarColaboradoresPorSalarioDecrescente();
    }
}
