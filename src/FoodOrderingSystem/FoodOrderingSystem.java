package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JCheckBox cPizza;
    private JPanel jpMain;
    private JRadioButton rbNone;
    private JCheckBox cBurger;
    private JRadioButton rb5;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    private JCheckBox[] foods= {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
    private int[] prices = {100, 80, 65, 55, 50, 40};
    private  JRadioButton[] discounts = {rbNone, rb5, rb10, rb15};
    private double[] discountValue = {0.0, 0.05, 0.10, 0.15};

    public FoodOrderingSystem(){

        btnOrder.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                double amount = 0;
                int i = 0;


                for (JCheckBox food : foods) {
                    if (food.isSelected()) {
                        amount += prices[i];
                    }
                    i++;
                }


                double discount = 0.0;
                int j = 0;
                for (JRadioButton discountOption : discounts) {
                    if (discountOption.isSelected()) {
                        discount = discountValue[j];
                        break;
                    }
                    j++;
                }
                amount -= amount * discount;
               String formattedS = String.format("%.2f amount", amount);
               JOptionPane.showMessageDialog(null, "The total price is Php " + formattedS);
            }
        });

    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.jpMain);
        app.setSize(750, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
