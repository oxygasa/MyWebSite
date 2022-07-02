package app.model;

import app.entities.InputValues;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    //Хочу добавляемых пользователей отображать в виде списка.
    //Хочу отделить представление от бизнес логики (MVC)
    private List<InputValues> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(InputValues inputValues) {
        model.add(inputValues);
    }

    public List<String> list() {
        return model.stream()
                .map(InputValues::getValue)
                .collect(Collectors.toList());
    }
}
