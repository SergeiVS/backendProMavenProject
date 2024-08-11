package org.annotationConfig;

import org.springframework.stereotype.Component;

@Component("parrot")
public class ParrotAnnConfig {
    private String name= "Kesha";

    public ParrotAnnConfig() {
        System.out.println("Start ParrotAnnConfig constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParrotAnnConfig{" +
                "name='" + name + '\'' +
                '}';
    }
}
