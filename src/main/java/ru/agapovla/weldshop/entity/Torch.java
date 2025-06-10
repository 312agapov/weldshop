package ru.agapovla.weldshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.agapovla.weldshop.entity.enums.ConnectorType;
import ru.agapovla.weldshop.entity.enums.WeldWorkType;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "torches")
public class Torch {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Integer length;
    private Integer price;

    @Enumerated(EnumType.STRING)
    private WeldWorkType torchType;
    @Enumerated(EnumType.STRING)
    private ConnectorType connectorType;
}
