import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       /* List<Rabbit> rabbitList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Rabbit rabbit = new Rabbit(1, 5);
            rabbitList.add(rabbit);
        }

        List<Eagle> eagleList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Eagle eagle = new Eagle(1, 5);
            eagleList.add(eagle);
        }

        List<SuperRabbit> superRabbitList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            SuperRabbit superRabbit = new SuperRabbit(1, 3);
            superRabbitList.add(superRabbit);
        }*/

        Table nyulakEsSasok = new Table(8);
        System.out.print(nyulakEsSasok);


        EventQueue.invokeLater(()-> {
            GUI nyulEsSasGUI = new GUI();
            nyulEsSasGUI.setVisible(true);
        });


    }
}
