package ru.agapovla.weldshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.agapovla.weldshop.entity.Weld;

import java.util.UUID;

@Repository
public interface WeldRepository extends JpaRepository<Weld, UUID> {
}
