import java.awt.GridBagLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class GridBagLayoutRelative2{
  public static void main(String[] args){
    String title="GridBagLayout with gridx and gridy";
    JFrame frame=new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container=frame.getContentPane();
    container.setLayout(new GridBagLayout());

    GridBagConstraints gbc=new GridBagConstraints();

    JButton b1=new JButton("Button 1");
    JButton b2=new JButton("Button 2");
    JButton b3=new JButton("Button 3");

    gbc.gridx=0;
    gbc.gridy=0;
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    container.add(b1,gbc);

    gbc.gridx=GridBagConstraints.RELATIVE;
    gbc.gridy=GridBagConstraints.RELATIVE;
    gbc.gridwidth=1;
    container.add(b2,gbc);

    gbc.gridx=1;
    gbc.gridy=GridBagConstraints.RELATIVE;
    container.add(b3,gbc);
    frame.pack();
    frame.setVisible(true);
  }

}
