package com.dvt.abstract_factory.factory;

import com.dvt.abstract_factory.Part;

public interface StampingEquipmentFactory {
    Part stampPart(String partType);
}
