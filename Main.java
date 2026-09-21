public class Main {
    public static void main(String[] args) {
        Departamento vendas = new Departamento("Vendas", "VND");
        Departamento gestao = new Departamento("Gestão", "GST");

        Funcionario f1 = new Vendedor("Carlos", 2500, vendas, 3500);
        Funcionario f2 = new Gerente("Ana", 4000, gestao, 5);

        System.out.println("Bônus de " + f1.getNome() + " (Vendedor): " + f1.calcularBonus());
        System.out.println("Bônus de " + f2.getNome() + " (Gerente): " + f2.calcularBonus());
    }
}