public class SuperRabbit extends Cell implements Birth, Death{

    private int age;
    private int energy;

    SuperRabbit(int age, int energy) {
        this.age = age;
        this.energy = energy;
    }


    public boolean isItSuperRabbit() {
        return true;
    }

    @Override
    public void birth() {

    }

    @Override
    public void death() {

    }
}
