import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Laba5 extends JFrame
{
    JTextField jta = new JTextField(27);
    JButton button = new JButton("Проверить");

    Font fnt = new Font("Time new roman",Font.BOLD, 12);

    Laba5()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(300, 300);
        add(new JLabel("Введите число: "));
        add(jta);
        add(button);
        add(new JLabel("Нажмите кнопку"));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Random generate = new Random();
                    int number = generate.nextInt(3);
                    System.out.print("number = " + number);
                    int x = Integer.parseInt(jta.getText().trim());
                    if (x == number) {
                        JOptionPane.showMessageDialog(null, "Вы угадали!" + x, "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Вы не угадали!", "Внимание!", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new Laba5();
    }
}