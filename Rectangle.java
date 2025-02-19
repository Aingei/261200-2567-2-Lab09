public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getHeight() {
//        return height;
//    }


}
