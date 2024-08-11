package org.annotationConfig;

import org.springframework.stereotype.Component;

@Component("dog")
public class DogAnnConfig {
    private String name= "Barbos";

    public DogAnnConfig() {
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
