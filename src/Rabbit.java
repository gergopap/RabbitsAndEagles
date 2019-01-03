public class Rabbit extends Cell implements Birth, Death{

    private int age;
    private int energy;

    Rabbit(int age, int energy) {
        this.age = age;
        this.energy = energy;
    }


    public boolean isItRabbit() {
        return true;
    }

    @Override
    public void birth() {
    }

    @Override
    public void death() {


    }
}
