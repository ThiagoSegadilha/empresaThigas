public class Gerente extends Funcionario{

    private int senha;

    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return super.getSalario() * 0.5;
    }

    public boolean autenticacao(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
