package ru.agapovla.weldshop.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.agapovla.weldshop.entity.Weld;
import ru.agapovla.weldshop.repository.WeldRepository;
import ru.agapovla.weldshop.service.WeldService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WeldServiceImpl implements WeldService {

    private final WeldRepository weldRepository;

    @Override
    public Weld add(Weld weld) {
        return weldRepository.save(weld);
    }

    @Override
    public Weld getById(UUID id) {
        return weldRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Аппарат не был найден в БД!"));
    }

    @Override
    public Weld edit(Weld weld) {
        return weldRepository.save(weld);
    }

    @Override
    public void deleteById(UUID id) {
        weldRepository.deleteById(id);
    }

    @Override
    public List<Weld> findAll() {
        return weldRepository.findAll();
    }
}
