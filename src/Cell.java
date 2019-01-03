public class Cell {

    public boolean isItRabbit() {return false;}

    public boolean isItGrass() {return false;}

    public boolean isItBush() {return false;}

    public boolean isItSuperRabbit() {return false;}


    @Override
    public String toString() {
        if (isItRabbit()) {
            return "R";
        } else if (isItSuperRabbit()) {
            return "S";
        } else if (isItGrass()) {
            return "G";
        } else if (isItBush()) {
            return "B";
        } else {
            return " ";
        }
    }
}
