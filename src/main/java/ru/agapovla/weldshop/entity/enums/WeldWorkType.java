package ru.agapovla.weldshop.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WeldWorkType {
    TIG("Аргонодуговая"),
    GAS("Газовая"),
    SPOT("Точечная"),
    MAG("Полуавтоматическая в газовой среде"),
    MMA("Ручная дуговая"),
    MIG("Полуавтоматическая в газовой среде"),
    MIG_MAG("Полуавтоматическая в газовой среде");

    private final String value;
}
