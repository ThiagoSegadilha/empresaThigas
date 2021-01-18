public class TestaProjeto {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Thiago");
        gerente.setCpf("0123456789");
        gerente.setSalario(3500.79);
        gerente.setSenha(123);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.autenticacao(123));
        System.out.println(gerente.getBonificacao());
    }
}
