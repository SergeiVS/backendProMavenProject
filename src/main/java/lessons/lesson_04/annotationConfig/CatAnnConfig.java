package org.annotationConfig;

import org.springframework.stereotype.Component;

@Component
public class CatAnnConfig {
    private String name= "Barsik";

    public CatAnnConfig() {
        System.out.println("Start CatAnnConfig constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CatAnnConfig{" +
                "name='" + name + '\'' +
                '}';
    }
}
