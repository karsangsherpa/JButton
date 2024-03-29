import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.*;
public class myFramee extends JFrame implements ActionListener{
    JButton button;
myFramee() {

    ImageIcon icon = new ImageIcon(bro.webp);
    button = new JButton();
    button.setBounds(100, 100, 250, 100);
    button.addActionListener(e -> System.out.println("poop"));
    button.setText("I'm a button");
    button.setFocusable(false);
    button.setIcon(icon);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setVerticalTextPosition(JButton.BOTTOM);
    button.setFont(new Font("Comic sans", Font.BOLD, 25));

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 500);
    this.setVisible(true);
    this.add(button);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==button) {
System.out.println("poop");
}
}
} 
