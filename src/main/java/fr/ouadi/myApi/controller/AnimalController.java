package fr.ouadi.myApi.controller;

import fr.ouadi.myApi.service.AnimalService;

public class AnimalController {
    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    
}
