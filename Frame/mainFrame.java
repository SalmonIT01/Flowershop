package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainFrame extends JFrame implements ActionListener {
    private JButton buttonBuy;
    private JButton buttonExit;
    private JButton buttonAdd;

   

    public mainFrame(){
        super ("Good Day Shop");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(Toolkit.getDefaultToolkit().getImage("z1.jpg"));
    
        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    private void initComponents() {
        buttonBuy = new JButton("Buy Flowers");
        buttonExit = new JButton("Exit");
        buttonAdd = new JButton("Add Flowers");
    
        setLayout(null);
            
        //Buy
        buttonBuy.setLocation(340,250);
        buttonBuy.setSize(150, 25);
        buttonBuy.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //Exit
        buttonExit.setLocation(340,280);
        buttonExit.setSize(150, 25);
        buttonExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //ADD
        buttonAdd.setLocation(630,525);
        buttonAdd.setSize(150, 22);
        buttonAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonAdd.setToolTipText("for employees only");
        
        add(buttonBuy);
        add(buttonExit);
        add(buttonAdd);

        buttonAdd.addActionListener(this);
        buttonExit.addActionListener(this);
        buttonBuy.addActionListener(this);
    }


    //Action
    @Override
    public void actionPerformed(ActionEvent event) {
            if(event.getSource()==buttonBuy){
                setVisible(false);
                new buyFrame().setVisible(true);
            }else if(event.getSource()==buttonAdd){
                setVisible(false);
                new passwordFrame().setVisible(true);
            }else if(event.getSource()==buttonExit){
                dispose();
            }       
    }


    public void run(){
        setVisible(true);
    }

    }







