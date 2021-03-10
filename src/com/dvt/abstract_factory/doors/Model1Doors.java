package com.dvt.abstract_factory.doors;

import com.dvt.abstract_factory.Part;

public class Model1Doors implements Part {
    @Override
    public void stamp() {
        System.out.println("Model 1 doors stamped");
    }
}
