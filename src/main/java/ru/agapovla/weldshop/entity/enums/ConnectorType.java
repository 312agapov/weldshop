package ru.agapovla.weldshop.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConnectorType {
    EURO("Евро-разъем"),
    OTHER("Другой тип");

    private final String value;
}
