import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;

public class GridBagLayoutAnchor{
  public static void main(String[] args){
    String title="GridBagLayout Anchor";
    JFrame frame=new JFrame(title);

    JButton[] bts=new JButton[9];
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container=frame.getContentPane();
    container.setLayout(new GridBagLayout());

    GridBagConstraints gbc=new GridBagConstraints();

    bts[0]=new JButton("NORTHWEST");
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.ipadx=5;
    gbc.ipady=5;
    gbc.weightx=100;
    gbc.weighty=100;
    gbc.fill=GridBagConstraints.NONE;
    gbc.anchor=GridBagConstraints.NORTHWEST;
    container.add(bts[0],gbc);

    bts[1]=new JButton("NORTH");
    gbc.gridx=1;
    gbc.gridy=0;
    gbc.anchor=GridBagConstraints.NORTH;
    container.add(bts[1],gbc);

    bts[2]=new JButton("NORTHEAST");
    gbc.gridx=2;
    gbc.gridy=0;
    gbc.anchor=GridBagConstraints.NORTHEAST;
    container.add(bts[2],gbc);

    bts[3]=new JButton("WEST");
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.anchor=GridBagConstraints.WEST;
    container.add(bts[3],gbc);

    bts[4]=new JButton("CENTER");
    gbc.gridx=1;
    gbc.gridy=1;
    gbc.anchor=GridBagConstraints.CENTER;
    container.add(bts[4],gbc);

    bts[5]=new JButton("EAST");
    gbc.gridx=2;
    gbc.gridy=1;
    gbc.anchor=GridBagConstraints.EAST;
    container.add(bts[5],gbc);

    bts[6]=new JButton("SOUTHWEST");
    gbc.gridx=0;
    gbc.gridy=2;
    gbc.anchor=GridBagConstraints.SOUTHWEST;
    container.add(bts[6],gbc);

    bts[7]=new JButton("SOUTH");
    gbc.gridx=1;
    gbc.gridy=2;
    gbc.anchor=GridBagConstraints.SOUTH;
    container.add(bts[7],gbc);

    bts[8]=new JButton("SOUTHEAST");
    gbc.gridx=2;
    gbc.gridy=2;
    gbc.anchor=GridBagConstraints.SOUTHEAST;
    container.add(bts[8],gbc);

    frame.setBounds(50,50,500,500);
    frame.setVisible(true);
  }
}
