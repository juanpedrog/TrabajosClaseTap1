import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Container;
import java.awt.Insets;

public class GridBagLayoutEMail extends JFrame{
  JLabel des=new JLabel("Para:");
  JLabel asunto=new JLabel("Asunto:");
  JLabel cc=new JLabel("CC:");
  JLabel bcc=new JLabel("BCC:");
  JTextField destext=new JTextField("gjhgjhghjghjgjhghjgjhgjhg");
  JTextField asunttext=new JTextField("");
  JTextField cctext=new JTextField("");
  JTextField bcctext=new JTextField("");
  Container container;

  public GridBagLayoutEMail(){
    super("Correo");


    container=getContentPane();
    container.setLayout(new GridBagLayout());
    GridBagConstraints gbc=new GridBagConstraints();

    gbc.insets=new Insets(5,5,5,5);
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.anchor=GridBagConstraints.EAST;
    //Label "para:"
    container.add(des,gbc);

    //Label "Asunto:"
    gbc.gridy=1;
    container.add(asunto,gbc);

    //Label "CC:"
    gbc.gridy=2;
    container.add(cc,gbc);

    //TextField "Para:"
    gbc.gridx=1;
    gbc.gridy=0;
    gbc.fill=GridBagConstraints.BOTH;
    container.add(destext,gbc);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);

  }
  public static void main(String[] args){
    GridBagLayoutEMail mail=new GridBagLayoutEMail();
  }
}
