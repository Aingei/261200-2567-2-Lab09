public class Eagle extends Bird implements Flyable {
    public void move(){
        System.out.println("Eagle moving!");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flying");
    }
}
