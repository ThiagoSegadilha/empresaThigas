public class SistemaInterno {

    private int senha = 1234;

    public void autenticacao(Autenticavel conta) {
        boolean autenticou = conta.autenticacao(this.senha);

        if (autenticou) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }

    }
}
