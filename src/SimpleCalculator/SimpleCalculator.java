package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JPanel jpMain;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lb1stNumber;
    private JLabel lb2ndNumber;
    private JLabel lblResult;

    public SimpleCalculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tfNumber1.getText().trim());
                int b = Integer.parseInt(tfNumber2.getText().trim());
                int result;
                String op = (String) cbOperations.getSelectedItem();

                switch (op.charAt(0)) {
                    case '+':
                        result = a + b;
                        lblResult.setText("              " + String.valueOf(result) + "                 ");
                        break;
                    case '-':
                        result = a - b;
                        lblResult.setText("              " + String.valueOf(result) + "                 ");
                        break;
                    case '*':
                        result = a * b;
                        lblResult.setText("              " + String.valueOf(result) + "                 ");
                        break;
                    case '/':
                        if (b != 0) {
                            result = a / b;
                            lblResult.setText("              " + String.valueOf(result) + "                 ");
                        } else {
                            JOptionPane.showMessageDialog(null, "Cannot divide by 0");
                        }

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Operation");
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.jpMain);
        app.setSize(750, 300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
