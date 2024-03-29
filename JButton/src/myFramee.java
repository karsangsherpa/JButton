import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class myFramee extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
myFramee() {

    ImageIcon icon = new ImageIcon("bro.webp");
    ImageIcon icon2 = new ImageIcon("bro.jpeg");

    label = new JLabel();
    label.setIcon(icon2);
    label.setBounds(150, 250, 100, 250 );
    label.setVisible(true);

    button = new JButton();
    button.setBounds(100, 100, 250, 100);
    button.addActionListener(e -> System.out.println("poop"));
    button.setText("I'm a button");
    button.setFocusable(false);
    button.setIcon(icon);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setVerticalTextPosition(JButton.BOTTOM);
    button.setFont(new Font("Comic sans", Font.BOLD, 25));
    button.setIconTextGap(-15);
    button.setForeground(Color.cyan);
    button.setBackground(Color.lightGray);
    button.setBorder(BorderFactory.createEtchedBorder());
    button.setEnabled(false);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 500);
    this.setVisible(true);
    this.add(button);
    this.add(label);
}
@Override
public void actionPerformed(ActionEvent e){
if(e.getSource()==button) {
/*System.out.println("poop");
button.setEnabled(false);*/
label.setVisible(true);
}
}
} 
