public abstract class GeometriFigur {
    protected String farve;
    protected boolean filled;

    public GeometriFigur() {
    }

    public GeometriFigur(String farve, boolean filled) {
        this.farve = farve;
        this.filled = filled;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getAreal();

    @Override
    public String toString() {
        return "GeometriFigur{" +
                "farve='" + farve + '\'' +
                ", filled=" + filled +
                '}';
    }
}
