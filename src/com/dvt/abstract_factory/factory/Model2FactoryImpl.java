package com.dvt.abstract_factory.factory;

import com.dvt.abstract_factory.Part;
import com.dvt.abstract_factory.doors.Model2Doors;
import com.dvt.abstract_factory.hood.Model2Hood;
import com.dvt.abstract_factory.wheels.Model2Wheels;

public class Model2FactoryImpl implements StampingEquipmentFactory {
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
        return new Model2Wheels();
    }

    public Part makeDoors() {
        return new Model2Doors();
    }

    public Part makeHood() {
        return new Model2Hood();
    }
}
