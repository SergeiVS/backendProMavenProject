package org.javaConfig.javaConfig;

public class Dog {
    private String name= "Barbos";

    public Dog() {
        System.out.println("Start DogAnnConfig constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DogAnnConfig{" +
                "name='" + name + '\'' +
                '}';
    }
}
