package homework.zoo;

import java.util.Objects;

public class Cow extends Herbivore{
    @Override
    public void voice() {

    }

    public Cow(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat(String food) {
        if(Objects.equals(food, "meat")){
            System.out.println("я такое не ем");
        }

    }
}
