package org.javaConfig.javaConfig;

public class Cat {
    private String name= "Barsik";

    public Cat() {
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
