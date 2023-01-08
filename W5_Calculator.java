import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class W5_Calculator extends JFrame implements ActionListener{
    public JTextField textField = new JTextField(20);
    public static void main(String[] args){
        W5_Calculator calculator = new W5_Calculator();
        calculator.setVisible(true);
    }

    public W5_Calculator(){
        super("Calculator");
        setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        textField.setEditable(false);
        jPanel.add(textField);
        add(jPanel,BorderLayout.NORTH);
        JPanel jPanelC = new JPanel();
        jPanelC = new JPanel(new GridLayout(4,4,5,5));
        JButton btn1 = new JButton("7");
        jPanelC.add(btn1);
        btn1.addActionListener(this);
        JButton btn2 = new JButton("8");
        jPanelC.add(btn2);
        btn2.addActionListener(this);
        JButton btn3 = new JButton("9");
        jPanelC.add(btn3);
        btn3.addActionListener(this);
        JButton btn4 = new JButton("/");
        jPanelC.add(btn4);
        btn4.addActionListener(this);
        JButton btn5 = new JButton("4");
        jPanelC.add(btn5);
        btn5.addActionListener(this);
        JButton btn6 = new JButton("5");
        jPanelC.add(btn6);
        btn6.addActionListener(this);
        JButton btn7 = new JButton("6");
        jPanelC.add(btn7);
        btn7.addActionListener(this);
        JButton btn8 = new JButton("*");
        jPanelC.add(btn8);
        btn8.addActionListener(this);
        JButton btn9 = new JButton("1");
        jPanelC.add(btn9);
        btn9.addActionListener(this);
        JButton btn10 = new JButton("2");
        jPanelC.add(btn10);
        btn10.addActionListener(this);
        JButton btn11 = new JButton("3");
        jPanelC.add(btn11);
        btn11.addActionListener(this);
        JButton btn12 = new JButton("-");
        jPanelC.add(btn12);
        btn12.addActionListener(this);
        JButton btn13 = new JButton(".");
        jPanelC.add(btn13);
        btn13.addActionListener(this);
        JButton btn14 = new JButton("0");
        jPanelC.add(btn14);
        btn14.addActionListener(this);
        JButton btn15 = new JButton("=");
        jPanelC.add(btn15);
        btn15.addActionListener(this);
        JButton btn16 = new JButton("+");
        jPanelC.add(btn16);
        btn16.addActionListener(this);
        add(jPanelC,BorderLayout.CENTER);
        setSize(500, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton btn = (JButton)e.getSource();
        textField.setText(textField.getText() + btn.getText());
    }
}