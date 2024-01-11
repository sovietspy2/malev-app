package com.malev;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PlantController implements PlantApi {

    private final PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }
    @Override
    @GetMapping("/plant")
    public ResponseEntity<List<Plant>> getAll() {
        return ResponseEntity.ok(plantService.getPlants());
    }
}
