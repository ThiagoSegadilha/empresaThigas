public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario) {
        double bonus = funcionario.getBonificacao();
        this.soma += bonus;
    }

    public double getSoma() {
        return this.soma;
    }
}
