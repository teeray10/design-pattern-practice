package com.dvt.abstract_factory.models;

import com.dvt.abstract_factory.Part;
import com.dvt.abstract_factory.PartType;

public class Model2 implements StampingEquipment {
    @Override
    public Part stampPart(PartType partType) {
        return null;
    }
}
