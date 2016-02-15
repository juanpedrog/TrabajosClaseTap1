import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Container;
import java.awt.Insets;

public class GridBagLayoutInsets{
  public static void main(String[] args){
    String title="GridBagLayout";
    JFrame frame=new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container container=frame.getContentPane();
    container.setLayout(new GridBagLayout());

    GridBagConstraints gbc=new GridBagConstraints();

    gbc.fill=GridBagConstraints.BOTH;
    gbc.insets=new Insets(5,5,5,5);
    int count=1;
    for(int y=0;y<3;y++){
      gbc.gridy=y;
      for(int x=0;x<3;x++){
        gbc.gridx=x;
        container.add(new JButton("Button"+count++),gbc);
      }
    }
    frame.pack();
    frame.setVisible(true);
  }
}
