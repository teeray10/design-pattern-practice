package com.dvt.abstract_factory.models;

import com.dvt.abstract_factory.Part;
import com.dvt.abstract_factory.PartType;
import com.dvt.abstract_factory.doors.Doors;
import com.dvt.abstract_factory.doors.Model1Doors;
import com.dvt.abstract_factory.hood.Hood;
import com.dvt.abstract_factory.hood.Model1Hood;
import com.dvt.abstract_factory.wheels.Model1Wheels;
import com.dvt.abstract_factory.wheels.Wheels;

public class Model1 implements StampingEquipment {

    @Override
    public Part stampPart(PartType partType) {
        return switch (partType) {
            case WHEELS -> makeWheels();
            case DOORS -> makeDoors();
            case HOOD -> makeHood();
            default -> null;
        };
    }

    public Wheels makeWheels() {
        return new Model1Wheels();
    }

    public Doors makeDoors() {
        return new Model1Doors();
    }

    public Hood makeHood() {
        return new Model1Hood();
    }
}
