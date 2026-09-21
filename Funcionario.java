public class Funcionario {
    private String nome;
    private double salario;
    private Departamento departamento;

    public Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return 0;
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }
    public Departamento getDepartamento() { return departamento; }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return nome + " - R$" + salario + " - " + departamento.toString();
    }
}