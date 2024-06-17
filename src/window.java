
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class window extends JFrame
{
 JPanel show;
 JPanel jp;
 JButton jt1;
 JButton jt2;
 JButton jt3;
 JButton jt4;
 JButton jt5;
 JButton jt6;
 JButton jt7;
 JButton jt8;
 JButton jt9;
 JLabel jla;
 JButton n;
 game gg;
 Dimension jdimension;
    window(){
  super("TicTacToe");
  gg = new game();
  setLayout(new GridBagLayout());
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  show = new JPanel();
  jla = new JLabel("LETS PLAY");
  show.setPreferredSize(new Dimension(300,64));
  jla.setFont(new Font("Jokerman", Font.PLAIN, 35));
  show.add(jla);
  GridBagConstraints s = new GridBagConstraints(); 
  jdimension = new Dimension(100,100);
  setResizable(false);
  jp = new JPanel(new GridBagLayout());
  jt1= new JButton();
  jt1.setPreferredSize(jdimension);
  jt1.setFocusPainted(false);
  jt1.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt1.setForeground(Color.RED);
  jt2= new JButton();
  jt2.setPreferredSize(jdimension);
  jt2.setFocusPainted(false);
  jt2.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt2.setForeground(Color.RED);
  jt3= new JButton();
  jt3.setPreferredSize(jdimension);
  jt3.setFocusPainted(false);
  jt3.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt3.setForeground(Color.RED);
  jt4= new JButton();
  jt4.setPreferredSize(jdimension);
  jt4.setFocusPainted(false);
  jt4.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt4.setForeground(Color.RED);
  jt5= new JButton();
  jt5.setPreferredSize(jdimension);
  jt5.setFocusPainted(false);
  jt5.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt5.setForeground(Color.RED);
  jt6= new JButton();
  jt6.setPreferredSize(jdimension);
  jt6.setFocusPainted(false);
  jt6.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt6.setForeground(Color.RED);
  jt7= new JButton();
  jt7.setPreferredSize(jdimension);
  jt7.setFocusPainted(false);
  jt7.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt7.setForeground(Color.RED);
  jt8= new JButton();
  jt8.setPreferredSize(jdimension);
  jt8.setFocusPainted(false);
  jt8.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt8.setForeground(Color.RED);
  jt9= new JButton();
  jt9.setPreferredSize(jdimension);
  jt9.setFocusPainted(false);
  jt9.setFont(new Font("Jokerman",Font.PLAIN, 70));
  jt9.setForeground(Color.RED);
  n = new JButton("NEW GAME");
  n.setPreferredSize(new Dimension(300,20));
  n.setBackground(Color.getHSBColor(23, 80, 35));
  n.setFocusPainted(false);
  GridBagConstraints g =new GridBagConstraints();
  g.gridy=0;
  g.gridx=0;
  jp.add(jt1,g);
  g.gridx=1;
  jp.add(jt2,g);
  g.gridx=2;
  jp.add(jt3,g);
  g.gridy=1;
  g.gridx=0;
  jp.add(jt4,g);
  g.gridx=1;
  jp.add(jt5,g);
  g.gridx=2;
  jp.add(jt6,g);
  g.gridy=2;
  g.gridx=0;
  jp.add(jt7,g);
  g.gridx=1;
  jp.add(jt8,g);
  g.gridx=2;
  jp.add(jt9,g);
  show.setBackground(Color.cyan);
  s.gridy=0;
  add(show,s);
  s.gridy=1;
  add(jp,s);
  s.gridy=2;
  add(n,s);
  pack();
  setVisible(true);
  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
  setLocation(((dim.width)/2)-((/*jf.*/getSize().width)/2), ((dim.height)/2)-((/*jf.*/getSize().height)/2));
  lvldilog();
  jt1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
          if(gg.matrix[0][0]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
          else{
          gg.matrix[0][0]='X';
          gg.useri=0;
          gg.userj=0;
          gg.gamestage();
          }
          }
  });
  jt2.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
      if(gg.matrix[0][1]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
      else{        
          gg.matrix[0][1]='X';
          gg.useri=0;
          gg.userj=1;
      gg.gamestage();
      }
      }
  });
  jt3.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
       if(gg.matrix[0][2]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
          else{
          gg.matrix[0][2]='X';
          gg.useri=0;
          gg.userj=2;
          gg.gamestage();
          }
      }
  });
  jt4.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
         if(gg.matrix[1][0]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
          else{
          gg.matrix[1][0]='X';
          gg.useri=1;
          gg.userj=0;
          gg.gamestage();
          }
      }
  });
  jt5.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
        if(gg.matrix[1][1]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
          else{
          gg.matrix[1][1]='X';
          gg.useri=1;
          gg.userj=1;
          gg.gamestage();
          }
      }
  });
  jt6.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
        if(gg.matrix[1][2]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
          else{
          gg.matrix[1][2]='X';
          gg.useri=1;
          gg.userj=2;
          gg.gamestage();
          }
      }
  });
  jt7.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
          if(gg.matrix[2][0]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
          else{
          gg.matrix[2][0]='X';
          gg.useri=2;
          gg.userj=0;
          gg.gamestage();
          }
      }
  });
  jt8.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
        if(gg.matrix[2][1]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
          else{
          gg.matrix[2][1]='X';
          gg.useri=2;
          gg.userj=1;
          gg.gamestage();
          }
      }
  });
  jt9.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
         if(gg.matrix[2][2]!=' ')
          JOptionPane.showMessageDialog(null, "The Block is already filled", "Error",JOptionPane.ERROR_MESSAGE);
          else{
          gg.matrix[2][2]='X';
          gg.useri=2;
          gg.userj=2;
          gg.gamestage();
          }
      }
  });
  n.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae) {
      for(byte i =0;i<3;i++)
          for(byte j=0; j<3;j++)
          gg.matrix[i][j] = ' ';
      jt1.setBackground(null);
      jt2.setBackground(null);
      jt3.setBackground(null);
      jt4.setBackground(null);
      jt5.setBackground(null);
      jt6.setBackground(null);
      jt7.setBackground(null);
      jt8.setBackground(null);
      jt9.setBackground(null);
      gg.draw();
      lvldilog();
      ButtonSwitch(true);}
      
  });
}
    void ButtonSwitch(boolean a){
    jt1.setEnabled(a);
    jt2.setEnabled(a);
    jt3.setEnabled(a);
    jt4.setEnabled(a);
    jt5.setEnabled(a);
    jt6.setEnabled(a);
    jt7.setEnabled(a);
    jt8.setEnabled(a);
    jt9.setEnabled(a);
    }
    void lvldilog(){
    JPanel pd =new JPanel();
                pd.add(new JLabel("Please make a selection:"));
                DefaultComboBoxModel model = new DefaultComboBoxModel();
                model.addElement("Very Easy");
                model.addElement("Easy");
                model.addElement("Medium");
                model.addElement("Hard");
                model.addElement("Impossible");
                JComboBox comboBox = new JComboBox(model);
                pd.add(comboBox);
                JOptionPane.showConfirmDialog(null, pd, "Select Level", JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE);
                if(comboBox.getSelectedItem().equals("Very Easy")){
                    gg.lvlcheck=0;
                }
                else if(comboBox.getSelectedItem().equals("Easy")){
                    gg.lvlcheck=1;
                }
                else if(comboBox.getSelectedItem().equals("Medium")){
                    gg.lvlcheck=2;
                }
                else if(comboBox.getSelectedItem().equals("Hard")){
                    gg.lvlcheck=3;
                }
                else if(comboBox.getSelectedItem().equals("Impossible")){
                    gg.lvlcheck=4;
                }
    }
}