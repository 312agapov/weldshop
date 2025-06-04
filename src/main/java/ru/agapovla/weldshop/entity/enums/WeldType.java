package ru.agapovla.weldshop.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WeldType {
    TRANSFORMATOR("Трансформаторный"),
    VYPRYAMITEL("Выпрямитель"),
    INVERTOR("Инверторный"),
    POLYAVTOMAT("Полуавтомат");

    private final String value;
}
