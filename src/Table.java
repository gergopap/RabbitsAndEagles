import java.util.ArrayList;
import java.util.List;

public class Table {
    private final int size;
    private Cell matrix[][];

    public Table(int size) {
        this.size = size;
        matrix = new Cell[size][size];
        rabbitListFiller();
        eagleListFiller();
        superRabbitListFiller();
        generateGrass(20);
        generateBush(20);
        generateRabbits();
        generateSuperRabbits();
        fillMap();
    }

    List<Rabbit> rabbitList = new ArrayList<>();
    List<Eagle> eagleList = new ArrayList<>();
    List<SuperRabbit> superRabbitList = new ArrayList<>();


    private void rabbitListFiller () {

        for (int i = 0; i < 5; i++) {
            Rabbit rabbit = new Rabbit(1, 5);
            rabbitList.add(rabbit);
        }
    }


    private void eagleListFiller () {
        for (int i = 0; i < 5; i++) {
            Eagle eagle = new Eagle(1, 5);
            eagleList.add(eagle);
        }
    }

    private void superRabbitListFiller () {
        for (int i = 0; i < 5; i++) {
            SuperRabbit superRabbit = new SuperRabbit(1, 3);
            superRabbitList.add(superRabbit);
        }
    }



    private void generateGrass(int grassPiece) {
        int index1;
        int index2;

        for (int i = 0; i < grassPiece; ++i) {
            do {
                index1 = (int) (Math.random() * size);
                index2 = (int) (Math.random() * size);

            } while (matrix[index1][index2] != null);
            matrix[index1][index2] = new Grass();
        }
    }

    private void generateBush(int bushPiece) {
        int index1;
        int index2;

        for (int i = 0; i < bushPiece; ++i) {
            do {
                index1 = (int) (Math.random() * size);
                index2 = (int) (Math.random() * size);

            } while (matrix[index1][index2] != null);
            matrix[index1][index2] = new Bush();
        }
    }

    private void generateRabbits() {
        int index1;
        int index2;

        for (int i = 0; i < rabbitList.size(); ++i) {
            do {
                index1 = (int) (Math.random() * size);
                index2 = (int) (Math.random() * size);

            } while (matrix[index1][index2] != null);
            for (int j = 0; j < rabbitList.size(); ++j) {
                matrix[index1][index2] = rabbitList.get(j);
            }
        }
    }

    private void generateSuperRabbits() {
        int index1;
        int index2;

        for (int i = 0; i < superRabbitList.size(); ++i) {
            do {
                index1 = (int) (Math.random() * size);
                index2 = (int) (Math.random() * size);

            } while (matrix[index1][index2] != null);
            for (int j = 0; j < superRabbitList.size(); ++j) {
                matrix[index1][index2] = superRabbitList.get(j);
            }

            //matrix[index1][index2] = new SuperRabbit(1,3);
        }
    }

    private void fillMap() {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = new Cell();
                }
            }
        }
    }

    public Cell getCell(int i, int j) { return matrix[i][j]; }

    public int getSize() {
        return size;
    }




    @Override
    public String toString() {
        String cellValue = "";
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                cellValue += ' ' + matrix[i][j].toString();
            }
            cellValue += "\n";
        }
        return cellValue;
    }
}
