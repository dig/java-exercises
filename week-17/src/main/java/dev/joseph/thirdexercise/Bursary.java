package dev.joseph.thirdexercise;

import lombok.Getter;

public enum Bursary {

    NONE (0),
    ACADEMIC (100),
    TRANSPORT (50),
    LIVING (100),
    EMERGENCY (500);

    @Getter
    private int amount;

    Bursary(int amount) {
        this.amount = amount;
    }
}
