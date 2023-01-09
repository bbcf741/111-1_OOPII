import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class W6_Images extends JFrame implements ActionListener{
    JButton prebtn;
    JButton nextbtn;
    JLabel imgLabel;
    ImageIcon imglist[] = new ImageIcon[3];
    int imgIndex = 1;

    public static void main(String[] args){
        W6_Images imgs = new W6_Images();
        imgs.setVisible(true);
    }

    public W6_Images(){
        super("Gallery");
        setBounds(0, 0, 300, 300);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        ImageIcon img1 = new ImageIcon("ahri.jpg");
        imglist[0] = new ImageIcon(img1.getImage().getScaledInstance(200, 200, DO_NOTHING_ON_CLOSE));

        ImageIcon img2 = new ImageIcon("amumu.jpg");
        imglist[1] = new ImageIcon(img2.getImage().getScaledInstance(200, 200, DO_NOTHING_ON_CLOSE));

        ImageIcon img3 = new ImageIcon("ashe.jpg");
        imglist[2] = new ImageIcon(img3.getImage().getScaledInstance(200, 200, DO_NOTHING_ON_CLOSE));

        imgLabel = new JLabel(imglist[1]);
        imgLabel.setBounds(0, 0, 200, 200);
        contentPane.add(imgLabel, BorderLayout.CENTER);

        JPanel btns = new JPanel(new GridLayout(1, 2));

        prebtn = new JButton("Previous");
        btns.add(prebtn);
        prebtn.addActionListener(this);

        nextbtn = new JButton("Next");
        btns.add(nextbtn);
        nextbtn.addActionListener(this);

        contentPane.add(btns, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == nextbtn){
            if (imgIndex == 2){
                imgLabel.setIcon(null);
                JOptionPane.showMessageDialog(null, "There is no image!\nAshe is the last image.", "", JOptionPane.WARNING_MESSAGE);
                imgIndex += 1;
            }
            else if(imgIndex > 2){
                imgLabel.setIcon(null);
                imgIndex += 1;
            }
            else{
                imgIndex += 1;
                imgLabel.setText(null);
                imgLabel.setIcon(imglist[imgIndex]);
            }
        }

        else if(e.getSource() == prebtn){
            if (imgIndex == 0){
                imgLabel.setIcon(null);
                JOptionPane.showMessageDialog(null, "There is no image!\nAhri is the first image.", "", JOptionPane.WARNING_MESSAGE);
                imgIndex -= 1;
            }
            else if(imgIndex < 0){
                imgLabel.setIcon(null);
                imgIndex -= 1;
            }
            else{
                imgIndex -= 1;
                imgLabel.setText(null);
                imgLabel.setIcon(imglist[imgIndex]);
            }
        }
    }
}