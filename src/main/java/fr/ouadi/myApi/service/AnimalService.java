package fr.ouadi.myApi.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import fr.ouadi.myApi.model.Animal;

@Service
public class AnimalService {
    private ArrayList<Animal> animals;

    public AnimalService() {
        this.animals = new ArrayList<>();
        animals.add(new Animal(1, "chien", "mammifère", 13));
    }

    public Animal getAnimal(int id){
        for (Animal animal : animals) {
            if(animal.getId() == id){
                return animal;
            }
        }
        return null;
    }

    public Animal createAnimal(String name, String type, int weight){
        Animal animal = new Animal(this.animals.size() + 1, name, type, weight);
        this.animals.add(animal);
        return animal;
    }
    
}
