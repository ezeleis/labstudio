package Classes;
public class Cargo {
    private String descricao;
    private double salarioBase;
    private Nivel nivel;

    public Cargo(String descricao, double salarioBase, Nivel nivel) {
        this.descricao = descricao;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
    }
    public String getDescricao() {
        return descricao;
    }
};
