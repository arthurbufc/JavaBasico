package aula2;
import java.util.Random;

public class SaldoBanco {
    public static void main(String [] args) {

        Random randomico = new Random();

        double saldo = 2000;
        double i = 0;
        int t = 0;
        double c = 0;
        double d = 0;
        while (t < 12) {
            t++;
            i = randomico.nextInt(-2000,2000);
            if (i < 0){
                d += i;
            }
            else{
                c += i;
            }
            saldo = saldo + i;
            System.out.println(("Você teve uma movimentação na sua conta de "+i+". Seu saldo atual é: "+saldo));
            System.out.println("------------------------------");
        }
        System.out.println("Seu credito é: "+c+". Seu débito é: "+d+". O saldo final é: "+saldo+".");
    }
}   

