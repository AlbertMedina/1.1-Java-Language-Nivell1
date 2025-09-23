package Level3;

import java.util.ArrayList;
import java.util.List;

public class Copywriter {

    private String name;
    private final String dni;
    private static int salary = 1500;
    private List<News> news;

    public Copywriter(String name, String dni) {
        this.name = name;
        this.dni = dni;
        news = new ArrayList<>();
    }
}
