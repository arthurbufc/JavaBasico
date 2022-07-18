package aula4;

public class Aeronave {
/*
 * Criar uma classe chamada Aeronave: 
 * [tripulacao, combustivel, consumo, passageiros, passagem, tanque]
 * Criar os métodos da classe Aeronave:
 * 1. calcular a autonomia da Aeronave.
 * 2. calcular o indice por passageiro.
 * 3. Media de valor por autonomia de voo.
 * Depois usar a classe programa para mostrar estes dados em
 * 4 objetos e seu local fisico de armazenamento.
 */

    int tripulacao;
    double combustivel;
    double consumo;
    double passageiros;
    double passagem;
    double tanque;

    public double autonomia(){
        return Math.round((this.tanque * this.consumo));

    }

    public double EcoDesempenho(){
        double eco = this.autonomia()/this.passageiros;
        return Math.round(eco);
    }

    public boolean validaEcoDesempenho(double indice){
        if(this.EcoDesempenho()>indice){
            return true;
        }
        else{
            return false;
        }
    }
    
}
