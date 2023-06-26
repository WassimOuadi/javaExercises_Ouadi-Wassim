package fr.ouadi.myApi.model;

public class Animal {
    private int id;
    private String name;
    private String type;
    private int weight;

    
    
    public Animal(int id, String name, String type, int weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weight = weight;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    
}
