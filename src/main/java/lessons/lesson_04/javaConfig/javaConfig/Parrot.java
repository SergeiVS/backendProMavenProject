package org.javaConfig.javaConfig;

public class Parrot {
    private String name= "Kesha";

    public Parrot() {
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
