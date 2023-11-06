public class Rektangel extends GeometriFigur{
    private double l, b;

    public Rektangel() {
    }

    public Rektangel(String farve, boolean filled, double l, double b) {
        super(farve, filled);
        this.l = l;
        this.b = b;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getAreal() {
        return l * b;
    }

    public double getOmkreds() {
        return (l + b) * 2;
    }

    @Override
    public String toString() {
        return "Rektangel{" +
                "længde=" + l +
                ", bredde=" + b +
                ", farve='" + farve + '\'' +
                ", filled=" + filled +
                '}';
    }
}
