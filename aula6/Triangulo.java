package aula6;

public class Triangulo implements FormaGeometrica {
    private int base;
    private int altura;
    private int lado1;
    private int lado2;
//#region
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
//#endregion

    @Override 
    public int getArea(){
        int area = 0;
        area = (base*altura)/2;
        return area;
    }

    @Override
    public int getPerimetro(){
        int perimetro = 0;
        perimetro = lado1+lado2+base;
        return perimetro;
    }

    @Override
    public String getNomeFigura(){
        return "Triangulo";

    }
}


