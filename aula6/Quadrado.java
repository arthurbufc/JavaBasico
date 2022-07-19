package aula6;

public class Quadrado implements FormaGeometrica {

    private int lado;
//#region Getters and Setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
//#endregion

    @Override 
    public int getArea(){
        int area = 0;
        area = lado * lado;
        return area;
    }

    @Override
    public int getPerimetro(){
        int perimetro = 0;
        perimetro = 4*(lado);
        return perimetro;
    }

    @Override
    public String getNomeFigura(){
        return "Quadrado;";

    }
}
