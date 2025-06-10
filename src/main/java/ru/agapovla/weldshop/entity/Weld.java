package ru.agapovla.weldshop.entity;

import jakarta.persistence.*;
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
@Table(name = "welds")
public class Weld {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String description;
    private Integer price;

    private Integer minAmperage;
    private Integer maxAmperage;

    @Enumerated(EnumType.STRING)
    private PowerSupplyType powerSupplyType;
    @Enumerated(EnumType.STRING)
    private WeldType weldType;
    @Enumerated(EnumType.STRING)
    private Set<WeldWorkType> weldWorkType;

}
