package aula1;

public class AvaliaAluno {
    public static void main(String[] args) {
        String aluno = "Lucas Bastos";
        double nota1 = 8.6;
        double nota2 = 5.2;
        double nota3 = 7.1;
        double media = 0;
        double fator1 = 0.6;
        double fator2 = 0.2;
        boolean skl = false;
        /*Se o aluno for estagiario, soma das notas tem maior fator a n1, caso não,
        o maior fataor será estagio n3. Para o aluno ser aprovado ele precisa somar 7.
        * 
         */
        if (skl = false) {
            media = ((nota1+(nota1*fator2)) + nota2 + nota3)/3;
            if (media >= 7){
                System.out.println("Aluno aprovado com média: "+media);
            }
            else{
                System.out.println("Aluno reprovado com média: "+media);
            }
        }
        else{
            media = ((nota1+(nota1*fator1)) + nota2 + nota3)/3;
            if (media >= 7){
                System.out.println("Aluno aprovado com média: "+media);
            }
            else{
                System.out.println("Aluno reprovado com média: "+media);
            }
        }
    }
}
