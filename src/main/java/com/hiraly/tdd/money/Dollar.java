package com.hiraly.tdd.money;

class Dollar {
    int amount;
    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount = amount * 2;
    }
}
