package ru.agapovla.weldshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import ru.agapovla.weldshop.entity.enums.PowerSupplyType;
import ru.agapovla.weldshop.entity.enums.WeldType;
import ru.agapovla.weldshop.entity.enums.WeldWorkType;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Weld {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String description;
    private Integer price;

    private Integer minAmperage;
    private Integer maxAmperage;
    private PowerSupplyType powerSupplyType;
    private WeldType weldType;
    private Set<WeldWorkType> weldWorkType;

}
