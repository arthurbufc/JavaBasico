package EqXn;

public class Delta extends Equacao {
    private double delta;

//#region
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
//#endregion
    

    public double calculaDelta(){
        delta = (getB()*getB()) - 4 * getA() * getC();
        return delta;
    }
}