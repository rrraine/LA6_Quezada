// SIR WORKING PERO AYAW SA CODECHUM ROR

package KeyEventActivity;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyEventActivity extends JFrame {
    private JTextArea editableTextArea;
    private JPanel jpMain;
    private JTextArea nonEditableTextArea;

    KeyEventActivity() {

        // todo: convert vowel character text from editableTextArea to Uppercase
        // store the converted string (with uppercase vowel letters) to jtextarea noneditabletextarea

        editableTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                String inputText = editableTextArea.getText();
                StringBuilder convertedText = new StringBuilder();


                for (char c : inputText.toCharArray()) {

                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        convertedText.append(Character.toUpperCase(c));
                    } else {
                        convertedText.append(c);
                    }
                }

                nonEditableTextArea.setText(convertedText.toString());
            }
        });
    }

    public static void main (String[] args){
        KeyEventActivity app = new KeyEventActivity();
        app.setTitle("Key Event Class");
        app.setContentPane(app.jpMain);
        app.setSize(750, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
