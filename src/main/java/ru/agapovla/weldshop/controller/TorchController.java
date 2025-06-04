package ru.agapovla.weldshop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.agapovla.weldshop.entity.Torch;
import ru.agapovla.weldshop.impl.TorchServiceImpl;

import java.util.UUID;

@RestController
@RequestMapping("/api/torches")
@RequiredArgsConstructor
public class TorchController {

    private final TorchServiceImpl torchService;

    @PostMapping
    public ResponseEntity<?> addTorch(@RequestBody Torch torch) {
        return ResponseEntity.ok(torchService.add(torch));
    }

    @GetMapping
    public ResponseEntity<?> getTorch() {
        return ResponseEntity.ok(torchService.findAll());
    }

    @GetMapping(path = "/{torchId}")
    public ResponseEntity<?> getTorchById(@PathVariable("torchId") UUID torchId) {
        return ResponseEntity.ok(torchService.getById(torchId));
    }

    @PutMapping
    public ResponseEntity<?> editTorch(@RequestBody Torch torch) {
        return ResponseEntity.ok(torchService.edit(torch));
    }

    @DeleteMapping(path = "/{torchId}")
    public ResponseEntity<?> deleteTorchById(@PathVariable("torchId") UUID torchId) {
        torchService.deleteById(torchId);
        return ResponseEntity.ok().build();
    }
}
