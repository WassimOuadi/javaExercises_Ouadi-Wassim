package fr.ouadi.myApi.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.ouadi.myApi.model.Animal;

@Service
public class AnimalService {
    private ArrayList<Animal> animal;

    public AnimalService() {
        this.animal = new ArrayList<>();
        animal.add(new Animal(0, null, null, 0));
    }

    
}
