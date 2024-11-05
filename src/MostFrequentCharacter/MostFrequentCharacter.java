package MostFrequentCharacter;

import ItemListener.ItemListener;

import javax.swing.*;

public class MostFrequentCharacter extends JFrame {
    private JTextArea textArea1;
    private JPanel jpMain;
    private JLabel textArea;
    private JPanel frequentCharLabel;

    MostFrequentCharacter(){
        /*
        * todo
        *  Word: CURrent
        * RRent will have r as the most frequent character
        * if the number of characters are equal the character displayed will nt matter
        *   - for Nev, either n, v, or e can be displayed
        * spaces are not allowed
        * use setName() to set the name
        * */
    }

    public static void main(String[] args) {
        MostFrequentCharacter app = new MostFrequentCharacter();
        app.setContentPane(app.jpMain);
        app.setSize(300, 200);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Item Listener");
    }
}
