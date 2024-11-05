package ItemListener;

import javax.swing.*;

public class ItemListener extends JFrame{
    private JCheckBox cCheckBox;
    private JPanel jpMain;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JComboBox proficiencyComboBox;
    private JLabel languageLabel;
    private JLabel proficiencyLabel;

    JCheckBox[] proficiencyCheckBox = {cCheckBox,cppCheckBox,cSharpCheckBox,javaCheckBox,pythonCheckBox};
    ItemListener(){

        StringBuilder selectedLanguages = new StringBuilder(" ");
        for (JCheckBox lang : proficiencyCheckBox) {
            // todo, check if the proficiencyCheckBox is check and append to languageLable(JLabel)
            if (lang.isSelected()) {
                selectedLanguages.append(lang.getText()).append(", "); // Append selected language
            }
        }


        if (selectedLanguages.length() > 3) { // "Selected Languages: " is 22 chars
            selectedLanguages.setLength(selectedLanguages.length() - 2); // Remove last comma and space
        } else {
            selectedLanguages.append("None"); // No languages selected
        }

        proficiencyLabel.setText(selectedLanguages.toString());


        String proficiencySelected = (String) proficiencyComboBox.getSelectedItem();
        proficiencyLabel.setText(proficiencyLabel.getText() + " | Proficiency: " + proficiencySelected);
        //String proficiencySelected = (String)proficiencyComboBox.getSelectedItem();
        proficiencyLabel.setText(proficiencySelected);
    }
    public static void main(String[] args) {
        ItemListener app = new ItemListener();
        app.setContentPane(app.jpMain);
        app.setSize(300, 200);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Item Listener");
    }
}
