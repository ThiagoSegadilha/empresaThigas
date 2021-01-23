public class TestaProjeto {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Thiago");
        gerente.setCpf("0123456789");
        gerente.setSalario(3500.79);
        gerente.setSenha(1234);

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salario: " + gerente.getSalario());

        SistemaInterno si = new SistemaInterno();
        si.autenticacao(gerente);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(gerente);

        System.out.println(controle.getSoma());

        EditorDeVideo editor = new EditorDeVideo();

        editor.setSalario(2000.00);

        controle.registra(editor);

        System.out.println(controle.getSoma());
    }
}
