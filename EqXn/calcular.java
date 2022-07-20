package EqXn;

import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Delta d1 = new Delta();
        

        System.out.println("Informe o primeiro termo da equação(a)");
        d1.setA(entrada.nextInt());
        System.out.println("Informe o segundo termo da equação(b)");
        d1.setB(entrada.nextInt());
        System.out.println("Informe o terceiro termo da equação(c)");
        d1.setC(entrada.nextInt());
        System.out.println("Seu valor de delta é: "+d1.calculaDelta());
        double delta = d1.calculaDelta();
        System.out.println(delta);
        if (d1.calculaDelta() <= 0){
            System.out.println("Seu delta é negativo.");
        }else{
            EqXn e1 = new EqXn(d1.getA(),d1.getB(),d1.getC()); // instanciei EqXn aqui para puxar os valores de a,b,c que o usuario entregou para d1.
            System.out.println("Seu xp é: "+e1.calculaXp(delta));
            System.out.println("Seu xn é: "+e1.calculaXn(delta));
        }
    }
}
