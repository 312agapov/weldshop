package ru.agapovla.weldshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.agapovla.weldshop.entity.Torch;

import java.util.UUID;

@Repository
public interface TorchRepository extends JpaRepository<Torch, UUID> {
}
