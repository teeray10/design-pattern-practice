package com.dvt;

import com.dvt.abstract_factory.Part;
import com.dvt.abstract_factory.factory.FactoryProducer;
import com.dvt.abstract_factory.factory.StampingEquipmentFactory;

public class Main {

    public static void main(String[] args) {
        StampingEquipmentFactory abstractFactory = FactoryProducer.getFactory("MODEL1");
        Part model1Wheels = abstractFactory.stampPart("WHEELS");
        System.out.println(model1Wheels);
    }
}
