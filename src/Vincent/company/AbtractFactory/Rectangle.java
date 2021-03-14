package Vincent.company.AbtractFactory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    @Override
    public String actualVale() {
        return "Rectangle";
    }
}
