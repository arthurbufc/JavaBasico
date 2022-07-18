package aula5;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    //#region Encapsulamento [Getters e Setters]
    public String getCurso() {
        return curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    //#endregion
    
    //#region
    private double calculaMedia(){

        double media = 0;
        for(int i=0;i<this.notas.length;i++){
            media +=notas[i]; 
        }
        return (media/notas.length);
    }
    
    private boolean verificaAprovacao(double media) {
        if (media >= 7){
            return true;
        }else{
            return false;
        }
    }
    
    public String montaBoletim() {
        String boletim = "Nome do aluno: "+super.getNome()+System.lineSeparator();
        if(this.verificaAprovacao(this.calculaMedia())== false){
            boletim += (System.lineSeparator()+"Devido a política da academia, o resultado está disponível on-line.");

        }else{
            boletim +=(
                "CPF: "+super.getCpf()
                +System.lineSeparator()
                +System.lineSeparator());
                for(int i=0;i<this.notas.length;i++){
                    boletim += (" avaliacao: "+this.notas[i]+" | "+System.lineSeparator());
                }
                boletim += ("Resultado: Aprovad.o"+System.lineSeparator());
                boletim += ("Media final: "+this.calculaMedia()+System.lineSeparator());
        }
        return boletim;
    }
//#endregion
}
