public class Penguin extends Bird implements Flyable {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }

    public void move(){
        System.out.println("Penguin moving!");
    }

}