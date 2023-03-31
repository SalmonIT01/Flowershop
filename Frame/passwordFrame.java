package Frame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class passwordFrame extends JFrame implements ActionListener{
    private JButton buttonEnter;
    private JButton buttonBack;
    private JPasswordField pass1;
    private JLabel label1;
    



    public passwordFrame(){
        super ("Good Day Shop");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(Toolkit.getDefaultToolkit().getImage("z1.jpg"));

        initComponentsAdd();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    


    private void initComponentsAdd() {
        label1 = new JLabel("***Please enter password***");
        pass1 = new JPasswordField(10);
        buttonEnter = new JButton("Enter");
        buttonBack = new JButton("Back");
        
        //Label1
        label1.setSize(200, 25);
        label1.setLocation(340,150);
        
        //Jpassword
        pass1.setSize(150, 25);
        pass1.setLocation(345,183);
        pass1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //Enter
        buttonEnter.setSize(150, 25);
        buttonEnter.setLocation(345,225);
        buttonEnter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //Back
        buttonBack.setSize(80,25);
        buttonBack.setLocation(10, 525);
        buttonBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        setLayout(null);
        
        add(label1);
        add(pass1);
        add(buttonEnter);
        add(buttonBack);
        
        buttonEnter.addActionListener(this);
        buttonBack.addActionListener(this);
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonEnter){
            String passText = new String(pass1.getPassword());
            if(passText.equals("65361731")){
                setVisible(false);
                new addFrame().setVisible(true);
            }else{
                String message = "Invalid password";
                JOptionPane.showMessageDialog(this, message); 
            }
        }else if(e.getSource()==buttonBack){
            setVisible(false);
            new mainFrame().setVisible(true);
        }
        
    }



    public void run(){
        setVisible(true);
    }
}
