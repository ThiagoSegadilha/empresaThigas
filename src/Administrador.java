public class Administrador extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return super.getSalario() * 0.35;
    }

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
}
