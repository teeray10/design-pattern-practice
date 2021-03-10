package com.dvt.abstract_factory.models;

import com.dvt.abstract_factory.Part;
import com.dvt.abstract_factory.PartType;

public interface StampingEquipment {
    Part stampPart(PartType partType);
}
