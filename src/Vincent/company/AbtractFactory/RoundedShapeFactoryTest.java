package Vincent.company.AbtractFactory;

import static org.junit.Assert.*;

public class RoundedShapeFactoryTest {

    @org.junit.Test
    public void getShape() {
        boolean isRounded = false;
        if (isRounded){
            AbstractFactory shapeFactory = FactoryProducer.getFactory(isRounded);
            Shape shape = shapeFactory.getShape("Rectangle");
            assertEquals("RoundedRectangle",shape.actualVale());
        }
        else {
            AbstractFactory shapeFactory = FactoryProducer.getFactory(!!isRounded);
            Shape shape = shapeFactory.getShape("Rectangle");
            assertEquals("Rectangle",shape.actualVale());
        }

    }

}