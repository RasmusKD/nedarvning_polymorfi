public class Cirkel extends GeometriFigur {
    private double radius;

    public Cirkel() {
    }

    public Cirkel(String farve, boolean filled, double radius) {
        super(farve, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getAreal() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getOmkreds() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cirkel{" +
                "radius=" + radius +
                ", farve='" + farve + '\'' +
                ", filled=" + filled +
                '}';
    }
}
