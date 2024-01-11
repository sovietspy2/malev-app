package com.malev;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {

    public List<Plant> getPlants() {
        return List.of(new Plant("smol plant"));
    }

}
