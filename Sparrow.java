public class Sparrow extends Bird implements Flyable {
    public void move(){
        System.out.println("Sparrow moving!");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

}
