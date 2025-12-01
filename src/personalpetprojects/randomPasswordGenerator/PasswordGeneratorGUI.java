package personalpetprojects.randomPasswordGenerator;

import javax.swing.*;
import java.awt.*;

public class PasswordGeneratorGUI extends JFrame {
    public PasswordGeneratorGUI(){
        super("Password Generator");

        setSize(540, 570);

        setResizable(false);

        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        addGuiComponents();
    }

    private void addGuiComponents(){
        //title
        JLabel titleLabel =  new JLabel("Password Generator");
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 32));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(0,10,540,39);
        add(titleLabel);

        //result text area
        JTextArea passwordOutput = new JTextArea();

        //prevent editing the text area
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Dialog", Font.BOLD, 32));


    }
}
