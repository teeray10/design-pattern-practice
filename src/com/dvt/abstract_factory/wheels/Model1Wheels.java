package com.dvt.abstract_factory.wheels;

import com.dvt.abstract_factory.Part;

public class Model1Wheels implements Part {
    @Override
    public void stamp() {
        System.out.println("Model 1 wheels stamped");
    }
}
