public class Gerente extends FuncionarioAutenticavel{

    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return super.getSalario() * 0.5;
    }
}
