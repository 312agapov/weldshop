package ru.agapovla.weldshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import ru.agapovla.weldshop.entity.enums.ConnectorType;
import ru.agapovla.weldshop.entity.enums.WeldWorkType;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Torch {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Integer length;
    private WeldWorkType torchType;
    private ConnectorType connectorType;

}
