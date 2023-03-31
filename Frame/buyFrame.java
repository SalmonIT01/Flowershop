package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class buyFrame extends JFrame implements ActionListener{
    private JLabel label1;
    private JButton buttonEnter;
    private JButton buttonBack;
    private JTextField textField;



    public buyFrame(){
        super ("Good Day Shop");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(Toolkit.getDefaultToolkit().getImage("z1.jpg"));
        
        initComponentsAdd();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    private void initComponentsAdd() {
        label1 = new JLabel("Select flowers");
        buttonEnter = new JButton("Enter");
        buttonBack = new JButton("Back");
        textField = new JTextField(10);

        label1.setSize(200, 25);
        label1.setLocation(340,150);

        buttonEnter.setSize(150, 25);
        buttonEnter.setLocation(345,225);
        buttonEnter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonEnter.setToolTipText("Buy flowers");

        buttonBack.setSize(80,25);
        buttonBack.setLocation(10, 525);
        buttonBack.setCursor(new Cursor(Cursor.HAND_CURSOR));

        textField.setSize(150, 25);
        textField.setLocation(345,183);
        textField.setCursor(new Cursor(Cursor.HAND_CURSOR));
    
        add(label1);
        add(buttonEnter);
        add(buttonBack);
        add(textField);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
   
    }



    public void run(){
        setVisible(true);
    }
    
}
