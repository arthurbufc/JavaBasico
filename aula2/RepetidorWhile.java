package aula2;
import java.util.Random;

public class RepetidorWhile {
    public static void main(String[] args) {

        Random randomico = new Random();

        int c = 0;
        double i = 0;
        double t = 0;
        double p = 0;
        
        while (c < 15) {
            t++;
            i=randomico.nextInt(120);

            if ((i % 7 == 0 || i % 12 == 0) && i != 0) {
                c++;
                p = c/t;
                System.out.println("Sorteio: "+i+", é múltiplo de 7 e 12.");
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Ao sortear:"+t+" foram encontrados: "+c+". E o percentual foi: "+p+".");
    }
}
