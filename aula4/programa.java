package aula4;

public class programa {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Toyota";
        van.modelo = "Hiace";
        van.capCombustivel = 76;
        van.numPassageiro = 10;
        van.consCombustivel = 10.2;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.capCombustivel = 42;
        fusca.numPassageiro = 4;
        fusca.consCombustivel = 8.6;

        System.out.println("--- Impressao do Objeto ---"); 
        System.out.println(van);
        System.out.println("Modelo: "+van.modelo+" | Autonomia: "+van.calculaAutonomia());
        System.out.println("Eco taxa: "+van.verificarEcoDesempenho());
        if(van.validaEcoDesempenho(105) == true) {
            System.out.println("Carro Eco eficiente.");
        }else{
            System.out.println("Carro não é Eco eficiente.");
        }
        
        System.out.println(fusca);
        System.out.println("Modelo: "+fusca.modelo+" | Autonomia: "+fusca.calculaAutonomia());
        System.out.println("Ecoo taxa: "+fusca.verificarEcoDesempenho());
        if(fusca.validaEcoDesempenho(88) == true) {
            System.out.println("Carro Eco eficiente.");
        }else{
            System.out.println("Carro não é Eco eficiente.");
        }

        System.out.println("---Exercicio de aeronave---");

        Aeronave boing = new Aeronave();
        
        

    }
}
