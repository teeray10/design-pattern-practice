package Vincent.company.AbtractFactory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square");
    }

    @Override
    public String actualVale() {
        return null;
    }
}
