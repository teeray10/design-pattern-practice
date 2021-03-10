package com.dvt.abstract_factory.factory;

import com.dvt.abstract_factory.Part;
import com.dvt.abstract_factory.doors.Model1Doors;
import com.dvt.abstract_factory.hood.Model1Hood;
import com.dvt.abstract_factory.wheels.Model1Wheels;

public class Model1FactoryImpl implements StampingEquipmentFactory {

    @Override
    public Part stampPart(String partType) {
        return switch (partType) {
            case "WHEELS" -> makeWheels();
            case "DOORS" -> makeDoors();
            case "HOOD" -> makeHood();
            default -> null;
        };
    }

    public Part makeWheels() {
        return new Model1Wheels();
    }

    public Part makeDoors() {
        return new Model1Doors();
    }

    public Part makeHood() {
        return new Model1Hood();
    }
}
