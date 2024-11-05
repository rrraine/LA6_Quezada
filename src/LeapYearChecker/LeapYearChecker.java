package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JPanel jpMain;
    private JTextField yearTextField;
    private JButton checkYearButton;

    LeapYearChecker(){
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = yearTextField.getText().trim();
                int year =  Integer.parseInt(input);
                if(isLeap(year)){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                }  else { JOptionPane.showMessageDialog(null, "Not a leap year");}
                yearTextField.setText("");
            }

        });

    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.jpMain);
        app.setSize(300, 200);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
