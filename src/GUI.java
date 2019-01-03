import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private Table table;
    private JButton[][] btns;

    public GUI() {
        setTitle("Nyulak és sasok");
        setSize(700, 725);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel root = new JPanel();
        root.setLayout(null);
        add(root);


        final int size = 8;
        table = new Table(size);

        btns = new JButton[size][size];
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                JButton btn = new JButton();

                btn.setBounds(
                        15 + j * 55,
                        250 + i * 55,
                        50,
                        50);

                root.add(btn);
                btn.getInsets(new Insets(0, 0, 0, 0));
                btn.setFont(new Font("Arial", Font.PLAIN, 8));

                btns[i][j] = btn;

                btn.setActionCommand(i + " " + j);

                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String event = e.getActionCommand();
                        String[] array = event.split(" ");
                        int x = Integer.parseInt(array[0]);
                        int y = Integer.parseInt(array[1]);
                        drawTable();
                    }
                });

            }
        }
        drawTable();
    }




    private void drawTable() {
        int size = table.getSize();
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {

                btns[i][j].setText(table.getCell(i, j).toString());

                if (btns[i][j].getText() == "S") {
                    Icon a =new ImageIcon("szny.jpg");
                    btns[i][j].setIcon(a);
                }

                if (btns[i][j].getText() == "R") {
                    Icon b =new ImageIcon("nyuszi2.jpg");
                    btns[i][j].setIcon(b);
                }

                if (btns[i][j].getText() == "G") {
                    Icon c =new ImageIcon("kaja.jpg");
                    btns[i][j].setIcon(c);
                }

                if (btns[i][j].getText() == "B") {
                    Icon d =new ImageIcon("bokor.jpg");
                    btns[i][j].setIcon(d);
                }

                if (btns[i][j].getText() == " ") {
                    Icon e =new ImageIcon("alap.jpg");
                    btns[i][j].setIcon(e);
                }
            }
        }
    }
}

