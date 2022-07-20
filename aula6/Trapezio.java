package aula6;

public class Trapezio implements FormaGeometrica {
    private int baseMa;
    private int baseMe;
    private int altura;
    private int lado1;
    private int lado2;

//#region Getters and Setters
    public int getBaseMa() {
        return baseMa;
    }
    public void setBaseMa(int baseMa) {
        this.baseMa = baseMa;
    }
    public int getBaseMe() {
        return baseMe;
    }
    public void setBaseMe(int baseMe) {
        this.baseMe = baseMe;
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
        area = ((baseMa+baseMe)*altura)/2;
        return area;
    }

    @Override
    public int getPerimetro(){
        int perimetro = 0;
        perimetro = lado1+lado2+baseMa+baseMe;
        return perimetro;
    }

    @Override
    public String getNomeFigura(){
        return "Trapezio";
    }
}
