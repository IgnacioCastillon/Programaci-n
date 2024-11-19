public class Cilindro extends Circulo{
    private float altura;

    public Cilindro(Circulo b, float altura) {
        super(b.p(), b.getRadio());
        this.altura = altura;
    }


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public Circulo base(){
        return new Circulo(super.p(),getRadio());
    }
    public void trasladar(float a,float b) {
        this.setX(this.getX() + a);
        this.setY(this.getY() + b);
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}'+super.toString();
    }
}
