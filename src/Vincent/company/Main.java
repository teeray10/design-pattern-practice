package Vincent.company;

import Vincent.company.AbtractFactory.AbstractFactory;
import Vincent.company.AbtractFactory.FactoryProducer;
import Vincent.company.AbtractFactory.Shape;
import Vincent.company.BuilderPattern.Meal;
import Vincent.company.BuilderPattern.MealBuilder;


public class Main {

    public static void main(String[] args) {

        //Abstract Method Implementation
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape shape = shapeFactory.getShape("Rectangle");
        shape.draw();
//--------------------------------------------------------------------------------------------------------
        //Builder Pattern Implementation
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: "+vegMeal.getCost());
    }
}
