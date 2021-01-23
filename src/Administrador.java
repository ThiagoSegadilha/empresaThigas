public class Administrador extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Administrador () {
        this.autenticador = new Autenticador();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticacao(int senha) {
        return this.autenticador.autenticacao(senha);
    }

    public double getBonificacao() {
        System.out.println("Bonificacao do Gerente");
        return super.getSalario() * 0.35;
    }
}
