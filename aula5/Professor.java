package aula5;

import java.lang.Math;

public class Professor  extends Pessoa {
    private double salario;
    private String nomeCurso;
    //#region Encapsulamento
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    //#endregion

    //#region Regras
    private double calculaSalario(){
        return Math.round((this.salario * 44) * 4.5);
    }
    public String montaHolerite(){
        String holerite;
        holerite = ("Nome do Professor: "+super.getNome() + System.lineSeparator());
        holerite += ("| CPF: "+ super.getCpf() + System.lineSeparator());
        holerite += ("| Valor salario: "+ this.calculaSalario() + System.lineSeparator());
        holerite += ("| Valor hora: "+ this.getSalario() + System.lineSeparator());
        holerite += ("| Curso referente: "+ this.getNomeCurso() + System.lineSeparator());
        return holerite;
    }
    //#endregion
}
