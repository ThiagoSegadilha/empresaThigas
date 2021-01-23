public class Administrador extends Funcionario {

    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return super.getSalario() * 0.35;
    }
}
