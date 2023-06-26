package fr.ouadi.myApi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import fr.ouadi.myApi.model.Animal;
import fr.ouadi.myApi.model.User;
import fr.ouadi.myApi.service.AnimalService;

public class AnimalController {
    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animal")
    public Animal getAnimal(@RequestParam int id){
        Animal animal = animalService.getAnimal(id);
        return animal;
    } 

    @PostMapping("/animal")
    public Animal createAnimal(@RequestBody AnimalRequest body){
        
        String name = body.getName();
        String type = body.getType();
        int weight = body.getWeight();
        Animal animal = animalService.createAnimal(name, type, weight);
        return animal;
    }

    @PutMapping("/animal")
    public Animal updateAnimal(@RequestParam int id, @RequestBody AnimalRequest body){
        Animal animal = animalService.updateAnimal(id, body.getName(), body.getType(), body.getWeight());
        return animal;
    }

    @DeleteMapping("/animal")
   public Animal deleteAnimal(@RequestParam int id) {
        Animal animal = animalService.deleteAnimal(id);
        return animal;
    }
}

