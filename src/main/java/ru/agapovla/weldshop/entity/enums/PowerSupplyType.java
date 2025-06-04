package ru.agapovla.weldshop.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PowerSupplyType {
    VOLTAGE220("220"),
    VOLTAGE220_380("220/380"),
    VOLTAGE380("380");

    private final String value;
}
