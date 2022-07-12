package aula1;

public class ImprimeIdade {
    public static void main(String[] args){
        int idade = 35;
        String nome = "Arthur Vieira";
        double altura =1.73;
        double peso = 86.6;

        double imc = (peso) / (altura * altura);
        System.out.println("Olá Mundo: "+nome);
        if (idade >= 40){
            if (imc < 22) {
                System.out.println("IMC: " +imc+ " sua idade e "+idade+" risco de subnutrição.");
            } else if(imc<= 30){
                System.out.println("IMC: " +imc+ " sua idade e "+idade+" isso ai garoto(a)");
            } 
            else if(imc <= 35){
                System.out.println("IMC: " +imc+ " sua idade e "+idade+" opa pode estar pesado, cuidado.");
            } 
            else {
                System.out.println("IMC: " +imc+ " sua idade e "+idade+" procure um nutricionista");
            }
        }
        else {
            if (imc <= 18){
                System.out.println("Seu IMC é:  "+imc+"."+" Procure um médico para avaliação de subnutrição");
            }
            else if (imc <= 26) {
                System.out.println("Seu IMC é:  "+imc+"."+" Seu indice está controlado e saudável procure um nutricionista.");
            }
            else if (imc <= 32) {
                System.out.println( "Seu IMC é:  "+imc+"."+" Parabéns consulte um médico para medição muscular.");
            }
            else if (imc <= 40) {
                System.out.println("Seu IMC é:  "+imc+"."+" Pré obesidade precisará de acompanhamento nutricional.");
            }
            else{
                System.out.println("Seu IMC é:  "+imc+"."+" Procure um médico endocrinologista com urgência.");
            }
        }
    } 
}
