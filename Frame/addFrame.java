package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addFrame extends JFrame implements ActionListener{
    private JButton buttonEnter;
    private JButton buttonBack;
    private JLabel label1;
    private JTextField textField;



    public addFrame(){
        super ("Good Day Shop");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(Toolkit.getDefaultToolkit().getImage("z1.jpg"));

        initComponentsAdd();
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void initComponentsAdd() {
        label1 = new JLabel("Increase the number of flowers");
        buttonEnter = new JButton("Enter");
        buttonBack = new JButton("Back");
        textField = new JTextField(10);

        label1.setSize(200, 25);
        label1.setLocation(340,150);

        buttonEnter.setSize(150, 25);
        buttonEnter.setLocation(345,225);
        buttonEnter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonEnter.setToolTipText("increase the number of flowers");

        buttonBack.setSize(80,25);
        buttonBack.setLocation(10, 525);
        buttonBack.setCursor(new Cursor(Cursor.HAND_CURSOR));

        textField.setSize(150, 25);
        textField.setLocation(345,183);
        textField.setCursor(new Cursor(Cursor.HAND_CURSOR));

        setLayout(null);

        add(label1);
        add(buttonEnter);
        add(textField);
        add(buttonBack);

        buttonEnter.addActionListener(this);
        buttonBack.addActionListener(this);     
    }



    @Override
    public void actionPerformed(ActionEvent d) {
        if(d.getSource()==buttonBack){
            setVisible(false);
            new mainFrame().setVisible(true);
        }else if(d.getSource()==buttonEnter){
            String message = "6650";
            JOptionPane.showMessageDialog(this, message); 
        }
    }




    public void run(){
        setVisible(true);
    }

}
