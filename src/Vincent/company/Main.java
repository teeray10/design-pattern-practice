package Vincent.company;

import Vincent.company.AbtractFactory.AbstractFactory;
import Vincent.company.AbtractFactory.FactoryProducer;
import Vincent.company.AbtractFactory.Shape;
import Vincent.company.AdapterPattern.AudioPlayer;
import Vincent.company.BuilderPattern.Meal;
import Vincent.company.BuilderPattern.MealBuilder;
import java.util.logging.Logger;


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
        System.out.println("Veg Burger");
        vegMeal.showItems();
        System.out.println("Total cost: "+vegMeal.getCost());
//---------------------------------------------------------------------------------------------------------
        //Adapter Pattern Implementation
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","rock on.mp3");
        audioPlayer.play("vlc","play hard.vlc");
        audioPlayer.play("mp4","we are the world.mp4");
        audioPlayer.play("avi","hustle.avi");
    }
}
