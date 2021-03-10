package com.dvt.abstract_factory.factory;

public class FactoryProducer {
    public static StampingEquipmentFactory getFactory(String factoryType) {
        return switch (factoryType) {
            case "MODEL1" -> new Model1FactoryImpl();
            case "MODEL2" -> new Model2FactoryImpl();
            default -> null;
        };
    }
}
