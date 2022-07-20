package aula6;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Quadrado q1 = new Quadrado();
        Triangulo t1 = new Triangulo();
        Trapezio tr1 = new Trapezio();
        System.out.println("Digite o tipo de forma geometrica:");
        String opcao = entrada.next();
        switch(opcao){
            case ("quadrado"):{
                System.out.println(q1.getNomeFigura());
                System.out.println("Informe o lado da figura.");
                q1.setLado(entrada.nextInt());
                System.out.println("Area: "+q1.getArea());
                System.out.println("Perimetro: "+q1.getPerimetro());
            }
            case ("triangulo"):{
                System.out.println(t1.getNomeFigura());
                System.out.println("Informe a base da figura.");
                t1.setBase(entrada.nextInt());
                System.out.println("Informe a altura da figura.");
                t1.setAltura(entrada.nextInt());
                System.out.println("Informe a lado1 da figura.");
                t1.setLado1(entrada.nextInt());
                System.out.println("Informe a lado2 da figura.");
                t1.setLado2(entrada.nextInt());
                System.out.println("Area: "+t1.getArea());
                System.out.println("Perimetro: "+t1.getPerimetro());
            }
            case ("trapezio"):{
                System.out.println(tr1.getNomeFigura());
                System.out.println("Informe a base maior da figura.");
                tr1.setBaseMa(entrada.nextInt());
                System.out.println("Informe a base menor da figura.");
                tr1.setBaseMe(entrada.nextInt());
                System.out.println("Informe a altura da figura.");
                tr1.setAltura(entrada.nextInt());
                System.out.println("Informe o lado1 da figura.");
                tr1.setLado1(entrada.nextInt());
                System.out.println("Informe o lado2 da figura.");
                tr1.setLado2(entrada.nextInt());
                System.out.println("Area: "+tr1.getArea());
                System.out.println("Perimetro: "+tr1.getPerimetro());
            }
        }
    }
}
