public class EditorDeVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Bonificacao do Editor de Video");
        return super.getSalario() * 0.2;
    }
}
