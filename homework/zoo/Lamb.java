package homework.zoo;

import java.util.Objects;

public class Lamb extends Herbivore{
    @Override
    public void voice() {

    }

    public Lamb(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat(String food) {
        if(Objects.equals(food, "meat")){
            System.out.println("я такое не ем");
        }

    }
}
