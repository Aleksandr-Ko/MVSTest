import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

public class JsonSerDes {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Person personSer = new Person("Sasha", 37, Arrays.asList("Tom", "Riul", "Trerg"));

        String json = GSON.toJson(personSer);

        System.out.println(personSer);
        System.out.println(json);

        Person personDes = GSON.fromJson(json, Person.class);

        System.out.println(personDes.getName()+" "+personDes.getAge()+" "+personDes.getArr());
    }
}

