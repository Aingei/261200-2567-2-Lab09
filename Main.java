public class Main {
    public static void main(String[] args) {


        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        Shape circle = new Circle(4);
        System.out.println("Area of the circle: " + circle.calculateArea());
        Shape ellipse = new Ellipse(5, 3);
        System.out.println("Area of the ellipse: " + ellipse.calculateArea());
//
//

        Sparrow sparrow = new Sparrow(); // สร้างอ็อบเจกต์ Sparrow
        sparrow.move(); // เรียกใช้ move() จาก Moveable
        sparrow.fly();  // เรียกใช้ fly() จาก Flyable

        Penguin penguin = new Penguin(); // สร้างอ็อบเจกต์ Sparrow
        penguin.move(); // เรียกใช้ move() จาก Moveable
//        penguin.fly();  // เรียกใช้ fly() จาก Flyable\

        Ostrich ostrich = new Ostrich();
        ostrich.move();

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.move();

        Order order = new Order("1234");
        OrderProcessor emailOrderProcessor = new OrderProcessor(new EmailNotifier());
        emailOrderProcessor.processOrder(order);


    }
}