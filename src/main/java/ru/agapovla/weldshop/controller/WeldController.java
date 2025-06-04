package ru.agapovla.weldshop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.agapovla.weldshop.entity.Weld;
import ru.agapovla.weldshop.impl.WeldServiceImpl;

import java.util.UUID;

@RestController
@RequestMapping("/api/welds")
@RequiredArgsConstructor
public class WeldController {

    private final WeldServiceImpl weldService;

    @PostMapping
    public ResponseEntity<?> addWeld(@RequestBody Weld weld) {
        return ResponseEntity.ok(weldService.add(weld));
    }

    @GetMapping
    public ResponseEntity<?> getWeld() {
        return ResponseEntity.ok(weldService.findAll());
    }

    @GetMapping(path = "/{weldId}")
    public ResponseEntity<?> getWeldById(@PathVariable("weldId") UUID weldId) {
        return ResponseEntity.ok(weldService.getById(weldId));
    }

    @PutMapping
    public ResponseEntity<?> editWeld(@RequestBody Weld weld) {
        return ResponseEntity.ok(weldService.edit(weld));
    }

    @DeleteMapping(path = "/{weldId}")
    public ResponseEntity<?> deleteWeldById(@PathVariable("weldId") UUID weldId) {
        weldService.deleteById(weldId);
        return ResponseEntity.ok().build();
    }
}
