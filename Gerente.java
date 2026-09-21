public class Gerente extends Funcionario {
    private int tamanhoEquipe;

    public Gerente(String nome, double salario, Departamento departamento, int tamanhoEquipe) {
        super(nome, salario, departamento);
        this.tamanhoEquipe = tamanhoEquipe;
    }

    @Override
    public double calcularBonus() {
        return tamanhoEquipe * 200.0;
    }
}