package ru.agapovla.weldshop.service;

import ru.agapovla.weldshop.entity.Weld;

import java.util.List;
import java.util.UUID;

public interface WeldService {
    Weld add(Weld weld);
    Weld getById(UUID id);
    Weld edit(Weld weld);
    void deleteById(UUID id);
    List<Weld> findAll();
}
