package ru.agapovla.weldshop.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.agapovla.weldshop.entity.Torch;
import ru.agapovla.weldshop.repository.TorchRepository;
import ru.agapovla.weldshop.service.TorchService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TorchServiceImpl implements TorchService {

    private final TorchRepository torchRepository;

    @Override
    public Torch add(Torch torch) {
        return torchRepository.save(torch);
    }

    @Override
    public Torch getById(UUID id) {
        return torchRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Горелка не была найдена в БД!"));
    }

    @Override
    public Torch edit(Torch torch) {
        return torchRepository.save(torch);
    }

    @Override
    public void deleteById(UUID id) {
        torchRepository.deleteById(id);
    }

    @Override
    public List<Torch> findAll() {
        return torchRepository.findAll();
    }
}
