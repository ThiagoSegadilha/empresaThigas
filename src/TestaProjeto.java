public class TestaProjeto {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Thiago");
        funcionario.setCpf("0123456789");
        funcionario.setSalario(1500.79);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
    }
}
