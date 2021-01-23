public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticacao(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return super.getSalario() * 0.5;
    }
}
