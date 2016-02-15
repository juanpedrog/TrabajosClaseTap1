import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Container;

public class GridBagLayoutFill2{
  public static void main(String[] args){
    String title="GridBagLayout";
    JFrame frame=new JFrame(title);
    Container container=frame.getContentPane();
    container.setLayout(new GridBagLayout());

    GridBagConstraints gbc=new GridBagConstraints();

    gbc.gridx=0;
    gbc.gridy=0;
    container.add(new JButton("Button1"),gbc);

    gbc.gridx=1;
    gbc.gridy=0;
    gbc.gridwidth=GridBagConstraints.RELATIVE;
    container.add(new JButton("Button2"),gbc);

    gbc.gridx=GridBagConstraints.RELATIVE;
    gbc.gridy=0;
    gbc.gridwidth=GridBagConstraints.REMAINDER;
    container.add(new JButton("Button3"),gbc);

    gbc.gridwidth=1;

    gbc.gridy=1;
    gbc.gridx=0;
    container.add(new JButton("Button4"),gbc);

    gbc.gridx=1;
    container.add(new JButton("this is a big Button5"),gbc);

    gbc.gridx=2;
    container.add(new JButton("Button6"),gbc);

    gbc.gridx=0;
    gbc.gridy=2;
    container.add(new JButton("Button7"),gbc);

    gbc.gridx=GridBagConstraints.RELATIVE;
    gbc.fill=GridBagConstraints.HORIZONTAL;
    container.add(new JButton("Button8"),gbc);

    gbc.gridx=GridBagConstraints.RELATIVE;
    container.add(new JButton("Button9"),gbc);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
  }

}
