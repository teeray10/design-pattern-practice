package com.dvt.abstract_factory;

import com.dvt.abstract_factory.factory.FactoryProducer;
import com.dvt.abstract_factory.factory.StampingEquipmentFactory;

public class Client {

    public static void main(String[] args) {
        StampingEquipmentFactory model1Factory = FactoryProducer.getFactory("MODEL1");
        Part wheels = model1Factory.stampPart("WHEELS");
        wheels.stamp();

        Part hood = model1Factory.stampPart("HOOD");
        hood.stamp();

        Part doors = model1Factory.stampPart("DOORS");
        doors.stamp();

        StampingEquipmentFactory model2Factory = FactoryProducer.getFactory("MODEL2");
        Part wheels2 = model2Factory.stampPart("WHEELS");
        wheels2.stamp();

        Part hood2 = model2Factory.stampPart("HOOD");
        hood2.stamp();

        Part doors2 = model2Factory.stampPart("DOORS");
        doors2.stamp();
    }
}
