package aula5;

public class principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Professor p1 = new Professor();

        p1.setNome("Reginaldo Pereira");
        p1.setEndereco("Rua das Flores");
        p1.setCpf("333.333.333-00");
        p1.setTelefone("(85) 3289-1924");
        p1.setNomeCurso("Java Spring Web ");
        p1.setSalario(24.20);

        a1.setNome("Murilo Pacheco");
        a1.setEndereco("Rua das Amoreiras");
        a1.setTelefone("(21)99999-6099");
        a1.setCpf("506.632.855-15");
        a1.setCurso("Java Spring Web");
        double[] notas = {8.5,8.5,8.5,10.0,9.5,8.5};
        a1.setNotas(notas);
        a2.setEstagio(true);
        
        a2.setNome("Helena Carlos");
        a2.setEndereco("Rua das Amoreiras");
        a2.setTelefone("(21)99999-6099");
        a2.setCpf("506.632.855-15");
        a2.setCurso("Ciencia de Dados");
        double[] notas2 = {8.5, 8.5, 8.5, 10.0, 9.5, 8.5};
        a2.setNotas(notas2);
        System.out.println(p1.montaHolerite());
        System.out.println(a1.montaBoletim());
        System.out.println(a2.montaBoletim(a2.getEstagio()));
    }
}
