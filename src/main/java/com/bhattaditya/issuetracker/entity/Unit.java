package com.bhattaditya.issuetracker.entity;

public enum Unit {
    ADMINISTRATION(0),
    CONSIGNMENT(1),
    PAYMENT(2),
    SHIPMENT(3);

    private final int value;

    Unit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
