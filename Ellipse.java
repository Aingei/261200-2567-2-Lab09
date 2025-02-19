public class Ellipse extends Shape{
    private double semiMajorAxis;  // 'a' - the longest radius
    private double semiMinorAxis;  // 'b' - the shortest radius

    public Ellipse(double major, double minor) {
        this.semiMajorAxis = major;
        this.semiMinorAxis = minor;
    }
    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }
    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }
    // Override the area method from Shape, assuming Shape has this method
    @Override
    public double calculateArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

}
