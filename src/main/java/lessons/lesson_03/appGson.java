package lessons.lesson_03;

import com.google.gson.Gson;

public class appGson {
    public static void main(String[] args) {


        Person person = new Person("James", "Bond", 45);
        Gson gson = new Gson();


        String json = gson.toJson(person);

        System.out.println("JSON: " + json);
    }
}
