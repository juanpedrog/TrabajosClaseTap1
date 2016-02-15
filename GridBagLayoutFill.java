import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Container;

public class GridBagLayoutFill{
  public static void main(String[] args){
    String title="GridBagLayout with gridx and gridy";
    JFrame frame=new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container=frame.getContentPane();
    container.setLayout(new GridBagLayout());

    GridBagConstraints gbc=new GridBagConstraints();

    gbc.fill=GridBagConstraints.BOTH;

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
    for(int i=0;i<6;i++){
      gbc.gridx=i;
      container.add(new JButton("Button"+(i+4)),gbc);
    }

    frame.pack();
    frame.setVisible(true);
  }
}
