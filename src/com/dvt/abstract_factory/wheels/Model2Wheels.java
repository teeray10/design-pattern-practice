package com.dvt.abstract_factory.wheels;

import com.dvt.abstract_factory.Part;

public class Model2Wheels implements Part {
    @Override
    public void stamp() {
        System.out.println("Model 2 wheels stamped");
    }
}
