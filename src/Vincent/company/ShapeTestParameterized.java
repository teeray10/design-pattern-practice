package Vincent.company;

import Vincent.company.AbtractFactory.AbstractFactory;
import Vincent.company.AbtractFactory.FactoryProducer;
import Vincent.company.AbtractFactory.RoundedShapeFactoryTest;
import Vincent.company.AbtractFactory.Shape;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ShapeTestParameterized {

    public static int couter=0;
    private String shapeExpected;
    private boolean isRounded;
    private String expected;


    public ShapeTestParameterized(String shapeExpected, boolean isRounded, String expected) {
        this.shapeExpected = shapeExpected;
        this.isRounded = isRounded;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        couter++;
        System.out.println("Running test number: "+couter);
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {"Rectangle",false,"Rectangle"},
                {"Square",false,"Square"},
                {"Rectangle",true,"RoundedRectangle"},
                {"Square",true,"RoundedSquare"}
        });
    }
    @org.junit.Test
    public void getShape() {
            AbstractFactory shapeFactory = FactoryProducer.getFactory(isRounded);
            Shape shape = shapeFactory.getShape(shapeExpected);
            assertEquals(expected,shape.actualVale());
    }
}
