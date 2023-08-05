package homework.zoo;

public class ZooTest {
    public static void main(String[] args) {
        Animal cow = new Cow("Alice Weibel","White");
        Animal animal = new Lamb("Lom","black");
        cow.eat("meat");
        animal.eat("meat");
    }
}
