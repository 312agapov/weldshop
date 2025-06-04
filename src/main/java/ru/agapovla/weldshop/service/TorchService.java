package ru.agapovla.weldshop.service;

import ru.agapovla.weldshop.entity.Torch;

import java.util.List;
import java.util.UUID;

public interface TorchService {
    Torch add(Torch torch);
    Torch getById(UUID id);
    Torch edit(Torch torch);
    void deleteById(UUID id);
    List<Torch> findAll();
}
