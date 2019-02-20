package dev.joseph;

import lombok.Getter;

public enum Discount {

    NONE (1),
    EARLY(.75),
    MIDSEASON(.50),
    ENDOFSEASON(.25);

    @Getter
    private double value;

    Discount(double value) {
        this.value = value;
    }

}
