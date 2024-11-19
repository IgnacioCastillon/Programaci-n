public class Circulo extends Punto{
    private float radio;

    public Circulo(Punto p, float radio) {
        super(p.getX(), p.getY());
        this.radio = radio;
    }
    public void centro(Punto p) {
        this.setY(getX());
        this.setY(getY());
    }
    public Punto p(){
        return new Punto(getX(), getY());
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void trasladar(float a,float b) {
        this.setX(this.getX() + a);
        this.setY(this.getY() + b);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}'+super.toString()    ;
    }
}
