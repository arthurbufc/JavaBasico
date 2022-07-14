package aula3;

import java.util.Random;

public class Vetores {
    public static void main(String[] args) {
        java.util.Random a = new Random();
        
        double[] valores = {
            a.nextInt(30),
            a.nextInt(70),
            a.nextInt(90),
            a.nextInt(110),
            a.nextInt(130),
            a.nextInt(240),
            a.nextInt(240)
        };

        double[] comparadores = {
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10),
            a.nextInt(10)
        };

        for (int i=0; i<valores.length; i++){
            if (valores.length == comparadores.length){
                if ( valores[i] % comparadores[i] == 0){
                    System.out.println("O numero valores: "+valores[i]+" é multiplo de "+comparadores[i]+".");
                }
                else{
                    System.out.println("O numero valores: "+valores[i]+" não é multiplo de "+comparadores[i]+".");
                }
            }
            else{
                System.out.println("Vetores de tamanho diferente.");
            }
        }
    }
}
