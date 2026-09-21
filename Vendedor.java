public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salario, Departamento departamento, double totalVendas) {
        super(nome, salario, departamento);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus() {
        return totalVendas * 0.10;
    }
}