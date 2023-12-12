package Study.Architecture.Seminars.Seminar_05;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

public class UserModel implements Entity {
    private static int counter = 10000;
    private int id;

    @Getter
    private Collection<Texture> textures = new ArrayList<>();

    {
        id = ++counter;
    }

    @Setter
    private String name;

    @Setter
    private String size;

    @Setter
    private String type;

    public UserModel(String name, String size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Model #%s, %s, %s, %s", id, name, size, type);
    }
}
