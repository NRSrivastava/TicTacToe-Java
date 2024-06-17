import java.awt.Color;
import javax.swing.JOptionPane;

public class game {
    char [][] matrix = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    static window w;
    byte useri=0 ,userj =0;
    byte lvlcheck=0;
  public static void main(String[]arguments){
  w = new window();
  }  
  void gamestage(){
      draw();
  if(checkWin()){
      return;
  }
  if(game_complete()){
      w.ButtonSwitch(false);
      JOptionPane.showMessageDialog(null, "Game Tie", "Results",JOptionPane.INFORMATION_MESSAGE);
      return;
  }
  levelselect();
  }
  boolean game_complete(){
      byte q=0;
      for(byte i=0;i<3;i++)
          for(byte j=0;j<3;j++)
              if(matrix[i][j]!=' ')
              q++;
      if(q==9)
          return true;
      return false;
  }
  void draw(){
      w.jt1.setText(String.valueOf(matrix[0][0]));
      w.jt2.setText(String.valueOf(matrix[0][1]));
      w.jt3.setText(String.valueOf(matrix[0][2]));
      w.jt4.setText(String.valueOf(matrix[1][0]));
      w.jt5.setText(String.valueOf(matrix[1][1]));
      w.jt6.setText(String.valueOf(matrix[1][2]));
      w.jt7.setText(String.valueOf(matrix[2][0]));
      w.jt8.setText(String.valueOf(matrix[2][1]));
      w.jt9.setText(String.valueOf(matrix[2][2]));
      }
  boolean checkWin(){
      for (byte i =0; i<3;i++)
 if(matrix[i][0]==matrix[i][1]&&matrix[i][0]==matrix[i][2]&&matrix[i][0]=='X'){
     if(i==0){
         w.jt1.setBackground(Color.green);
         w.jt2.setBackground(Color.green);
         w.jt3.setBackground(Color.green);
     }else if(i == 1){
         w.jt4.setBackground(Color.green);
         w.jt5.setBackground(Color.green);
         w.jt6.setBackground(Color.green);
     }else if(i ==2){
         w.jt7.setBackground(Color.green);
         w.jt8.setBackground(Color.green);
         w.jt9.setBackground(Color.green);
     }
      w.ButtonSwitch(false);
     JOptionPane.showMessageDialog(null, "You WON", "Result",JOptionPane.INFORMATION_MESSAGE);
    return true;
 }
      for (byte i =0; i<3;i++)
 if(matrix[0][i]==matrix[1][i]&&matrix[0][i]==matrix[2][i]&&matrix[0][i]=='X'){
     if(i==0){
         w.jt1.setBackground(Color.green);
         w.jt4.setBackground(Color.green);
         w.jt7.setBackground(Color.green);
     }else if(i == 1){
         w.jt2.setBackground(Color.green);
         w.jt5.setBackground(Color.green);
         w.jt8.setBackground(Color.green);
     }else if(i ==2){
         w.jt3.setBackground(Color.green);
         w.jt6.setBackground(Color.green);
         w.jt9.setBackground(Color.green);
     }
      w.ButtonSwitch(false);
     JOptionPane.showMessageDialog(null,"You WON", "Result",JOptionPane.INFORMATION_MESSAGE);
    return true;
 } 
 if(matrix[0][0]==matrix[1][1]&&matrix[0][0]==matrix[2][2]&&matrix[0][0]=='X'){
      w.jt1.setBackground(Color.green);
         w.jt5.setBackground(Color.green);
         w.jt9.setBackground(Color.green);
      w.ButtonSwitch(false);
     JOptionPane.showMessageDialog(null,"You WON", "Result",JOptionPane.INFORMATION_MESSAGE);
    return true;
     }
 if(matrix[2][0]==matrix[1][1]&&matrix[2][0]==matrix[0][2]&&matrix[2][0]=='X'){
      w.jt3.setBackground(Color.green);
         w.jt5.setBackground(Color.green);
         w.jt7.setBackground(Color.green);
      w.ButtonSwitch(false);
     JOptionPane.showMessageDialog(null,"You WON", "Result",JOptionPane.INFORMATION_MESSAGE);
    return true;
    }
    for (byte i =0; i<3;i++)
 if(matrix[i][0]==matrix[i][1]&&matrix[i][0]==matrix[i][2]&&matrix[i][0]=='O'){
     if(i==0){
         w.jt1.setBackground(Color.red);
         w.jt2.setBackground(Color.red);
         w.jt3.setBackground(Color.red);
     }else if(i == 1){
         w.jt4.setBackground(Color.red);
         w.jt5.setBackground(Color.red);
         w.jt6.setBackground(Color.red);
     }else if(i ==2){
         w.jt7.setBackground(Color.red);
         w.jt8.setBackground(Color.red);
         w.jt9.setBackground(Color.red);
     }
      w.ButtonSwitch(false);
     JOptionPane.showMessageDialog(null, "CPU WON", "Result",JOptionPane.INFORMATION_MESSAGE);
    return true;
 }
      for (byte i =0; i<3;i++)
 if(matrix[0][i]==matrix[1][i]&&matrix[0][i]==matrix[2][i]&&matrix[0][i]=='O'){
     if(i==0){
         w.jt1.setBackground(Color.red);
         w.jt4.setBackground(Color.red);
         w.jt7.setBackground(Color.red);
     }else if(i == 1){
         w.jt2.setBackground(Color.red);
         w.jt5.setBackground(Color.red);
         w.jt8.setBackground(Color.red);
     }else if(i ==2){
         w.jt3.setBackground(Color.red);
         w.jt6.setBackground(Color.red);
         w.jt9.setBackground(Color.red);
     }
      w.ButtonSwitch(false);
     JOptionPane.showMessageDialog(null,"CPU WON", "Result",JOptionPane.INFORMATION_MESSAGE);
    return true;
 } 
 if(matrix[0][0]==matrix[1][1]&&matrix[0][0]==matrix[2][2]&&matrix[0][0]=='O'){
         w.jt1.setBackground(Color.red);
         w.jt5.setBackground(Color.red);
         w.jt9.setBackground(Color.red); 
     w.ButtonSwitch(false);
     JOptionPane.showMessageDialog(null,"CPU WON", "Result",JOptionPane.INFORMATION_MESSAGE);
    return true;
     }
 if(matrix[2][0]==matrix[1][1]&&matrix[2][0]==matrix[0][2]&&matrix[2][0]=='O'){
         w.jt3.setBackground(Color.red);
         w.jt5.setBackground(Color.red);
         w.jt7.setBackground(Color.red);
      w.ButtonSwitch(false);
     JOptionPane.showMessageDialog(null,"CPU WON", "Result",JOptionPane.INFORMATION_MESSAGE);
    return true;
    }
 return false;
  } 
  void random(){
  byte x= (byte) Math.floor(Math.random()*2.5);
  byte y= (byte) Math.floor(Math.random()*2.5);
  while(matrix[x][y]!=' '){
  x= (byte) Math.floor(Math.random()*2.5);
  y= (byte) Math.floor(Math.random()*2.5);
  }
          matrix[x][y]='O';
  }
  void brainM(){
      char a,b,c;
      for(byte i=0;i<3;i++){
             a=matrix[i][0];
             b=matrix[i][1];
             c=matrix[i][2];
             if(a=='X'&&b=='X'&&c==' '){
                 matrix[i][2]='O';
                 draw();
          return;
             }
             if(a=='X'&&b==' '&&c=='X'){
                 matrix[i][1]='O';
                 draw();
          return;
             }
             if(a==' '&&b=='X'&&c=='X'){
                 matrix[i][0]='O';
                 draw();
          return;
             }
            }
      for(byte i=0;i<3;i++){
             a=matrix[0][i];
             b=matrix[1][i];
             c=matrix[2][i];
             if(a=='X'&&b=='X'&&c==' '){
                 matrix[2][i]='O';
                 draw();
          return;
             }
             if(a=='X'&&b==' '&&c=='X'){
                 matrix[1][i]='O';
                 draw();
          return;
             }
             if(a==' '&&b=='X'&&c=='X'){
                 matrix[0][i]='O';
                 draw();
          return;
             }
            }
      if(matrix[1][1]=='X'&&matrix[0][0]=='X'&&matrix[2][2]==' '){
          matrix[2][2]='O';
          draw();
          return;
      }
      if(matrix[1][1]=='X'&&matrix[0][0]==' '&&matrix[2][2]=='X'){
          matrix[0][0]='O';
          draw();
          return;
      }
      if(matrix[1][1]==' '&&matrix[0][0]=='X'&&matrix[2][2]=='X'){
          matrix[1][1]='O';
          draw();
          return;
      }
      if(matrix[0][2]=='X'&&matrix[1][1]=='X'&&matrix[2][0]==' '){
          matrix[2][0]='O';
          draw();
          return;
      }
      if(matrix[0][2]=='X'&&matrix[1][1]==' '&&matrix[2][0]=='X'){
          matrix[1][1]='O';
          draw();
          return;
      }
      if(matrix[0][2]==' '&&matrix[1][1]=='X'&&matrix[2][0]=='X'){
          matrix[0][2]='O';
          draw();
          return;
      }
      if(lvlcheck==2){
          random();
          draw();
      }
      else if(lvlcheck==3)
      {   
      if(!Hard()){
          doit();
      }
      draw();
       }
      else if(lvlcheck==4)
      { 
          if(impossible_defeater_check()){
              draw();
              return;
          }
          if(CpuMidWork())
          {  
              draw();
              return;
          }
          if(!Hard()){
          doit();
          }
      draw();
      }
    }
  boolean Hard(){
    boolean hardcheck = true;
      if(useri==0&&userj==0&&matrix[0][0]=='X'){
          if(matrix[1][1]==' '){
              matrix[1][1]='O';
              hardcheck=false;
          }
          else if(matrix[1][0]==' '){
              matrix[1][0]='O';
              hardcheck=false;
          }
          else if(matrix[0][1]==' '){
              matrix[0][1]='O';
              hardcheck=false;
          }
      }
      else if(useri==0&&userj==2&&matrix[0][2]=='X'){
          if(matrix[1][1]==' '){
              matrix[1][1]='O';
              hardcheck=false;
          }
          else if(matrix[0][1]==' '){
              matrix[0][1]='O';
              hardcheck=false;
          }
          else if(matrix[1][2]==' '){
              matrix[1][2]='O';
              hardcheck=false;
          }
      }
      else if(useri==2&&userj==0&&matrix[2][0]=='X'){
          if(matrix[1][1]==' '){
              matrix[1][1]='O';
              hardcheck=false;
          }
          else if(matrix[1][0]==' '){
              matrix[1][0]='O';
              hardcheck=false;
          }
          else if(matrix[2][1]==' '){
              matrix[2][1]='O';
              hardcheck=false;
          }
      }
      else if(useri==2&&userj==2&&matrix[2][2]=='X'){
          if(matrix[1][1]==' '){
              matrix[1][1]='O';
              hardcheck=false;
          }
          else if(matrix[1][2]==' '){
              matrix[1][2]='O';
              hardcheck=false;
          }
          else if(matrix[2][1]==' '){
              matrix[2][1]='O';
              hardcheck=false;
          }
      }
      else if(useri==0&&userj==1&&matrix[0][1]=='X'){
          if(matrix[1][1]==' '){
              matrix[1][1]='O';
              hardcheck=false;
          }
          else if(matrix[0][0]==' '){
              matrix[0][0]='O';
              hardcheck=false;
          }
          else if(matrix[0][2]==' ')
          {
              matrix[0][2]='O';
              hardcheck=false;
          }
          else{
          for(byte q =0;q<3;q++){
              if(matrix[1][q]==' '){
                  matrix[1][q]='O';
              hardcheck=false;
                  break;
              }
          }
          }
      }
      else if(useri==1&&userj==0&&matrix[1][0]=='X'){
          if(matrix[1][1]==' '){
              matrix[1][1]='O';
              hardcheck=false;
          }
          else if(matrix[0][0]==' '){
              matrix[0][0]='O';
              hardcheck=false;
          }
          else if(matrix[2][0]==' ')
          {
              matrix[2][0]='O';
              hardcheck=false;
          }
          else
          for(byte q =0;q<3;q++){
              if(matrix[q][1]==' '){
                  matrix[q][1]='O';
              hardcheck=false;
                  break;
              }
          }
      }
      else if(useri==1&&userj==2&&matrix[1][2]=='X'){
          if(matrix[1][1]==' '){
              matrix[1][1]='O';
              hardcheck=false;
          }
          else if(matrix[0][2]==' '){
              matrix[0][2]='O';
              hardcheck=false;
          }
          else if(matrix[2][2]==' ')
          {
              matrix[2][2]='O';
              hardcheck=false;
          }
          else
          for(byte q =0;q<3;q++){
              if(matrix[q][1]==' '){
                  matrix[q][1]='O';
              hardcheck=false;
                  break;
              }
          }
      }
      else if(useri==2&&userj==1&&matrix[2][1]=='X'){
          if(matrix[1][1]==' '){
              matrix[1][1]='O';
              hardcheck=false;
          }
          else if(matrix[2][0]==' '){
              matrix[2][0]='O';
              hardcheck=false;
          }
          else if(matrix[2][2]==' ')
          {
              matrix[2][2]='O';
              hardcheck=false;
          }
          else
          for(byte q =0;q<3;q++){
              if(matrix[1][q]==' '){
                  matrix[1][q]='O';
              hardcheck=false;
                  break;
              }
          }
      }
      else if(useri==1&&userj==1&&matrix[1][1]=='X'){
          if(matrix[0][0]==' '){
              matrix[0][0]='O';
              hardcheck=false;}
          else if(matrix[0][2]==' '){
              matrix[0][2]='O';
              hardcheck=false;
          }
          else if(matrix[2][0]==' ')
          {   matrix[2][0]='O';
              hardcheck=false;
          }
          else if(matrix[2][2]==' ')
          {   matrix[2][2]='O';
              hardcheck=false;
          }
          else{
          random();
              hardcheck=false; 
          }
      }
      return !hardcheck;
  }
  void doit(){
      for(byte i=0;i<3;i++){
              for(byte j=0;j<3;j++){
                  useri=i;
                  userj=j;
               if(Hard()){
                   return;
               }   
              }
      }
  }
  void CPUwincheck(){
      char a,b,c;
      for(byte i=0;i<3;i++){
             a=matrix[i][0];
             b=matrix[i][1];
             c=matrix[i][2];
             if(a=='O'&&b=='O'&&c==' '){
                 matrix[i][2]='O';
                 draw();
          return;
             }
             if(a=='O'&&b==' '&&c=='O'){
                 matrix[i][1]='O';
                 draw();
          return;
             }
             if(a==' '&&b=='O'&&c=='O'){
                 matrix[i][0]='O';
                 draw();
          return;
             }
            }
      for(byte i=0;i<3;i++){
             a=matrix[0][i];
             b=matrix[1][i];
             c=matrix[2][i];
             if(a=='O'&&b=='O'&&c==' '){
                 matrix[2][i]='O';
                 draw();
          return;
             }
             if(a=='O'&&b==' '&&c=='O'){
                 matrix[1][i]='O';
                 draw();
          return;
             }
             if(a==' '&&b=='O'&&c=='O'){
                 matrix[0][i]='O';
                 draw();
          return;
             }
            }
      if(matrix[1][1]=='O'&&matrix[0][0]=='O'&&matrix[2][2]==' '){
          matrix[2][2]='O';
          draw();
          return;
      }
      if(matrix[1][1]=='O'&&matrix[0][0]==' '&&matrix[2][2]=='O'){
          matrix[0][0]='O';
          draw();
          return;
      }
      if(matrix[1][1]==' '&&matrix[0][0]=='O'&&matrix[2][2]=='O'){
          matrix[1][1]='O';
          draw();
          return;
      }
      if(matrix[0][2]=='O'&&matrix[1][1]=='O'&&matrix[2][0]==' '){
          matrix[2][0]='O';
          draw();
          return;
      }
      if(matrix[0][2]=='O'&&matrix[1][1]==' '&&matrix[2][0]=='O'){
          matrix[1][1]='O';
          draw();
          return;
      }
      if(matrix[0][2]==' '&&matrix[1][1]=='O'&&matrix[2][0]=='O'){
          matrix[0][2]='O';
          draw();
      }
  }
  boolean CpuMidWork(){
      char a,b,c;
      for(byte i=0;i<3;i++){
             a=matrix[i][0];
             b=matrix[i][1];
             c=matrix[i][2];
             if(a=='O'&&b==' '&&c==' '){
                 matrix[i][2]='O';
                 draw();
          return true;
             }
             if(a==' '&&b==' '&&c=='O'){
                 matrix[i][1]='O';
                 draw();
          return true;
             }
             if(a==' '&&b=='O'&&c==' '){
                 matrix[i][0]='O';
                 draw();
          return true;
             }
            }
      for(byte i=0;i<3;i++){
             a=matrix[0][i];
             b=matrix[1][i];
             c=matrix[2][i];
             if(a=='O'&&b==' '&&c==' '){
                 matrix[2][i]='O';
                 draw();
          return true;
             }
             if(a==' '&&b==' '&&c=='O'){
                 matrix[1][i]='O';
                 draw();
          return true;
             }
             if(a==' '&&b=='O'&&c==' '){
                 matrix[0][i]='O';
                 draw();
          return true;
             }
            }
      if(matrix[1][1]=='O'&&matrix[0][0]==' '&&matrix[2][2]==' '){
          matrix[2][2]='O';
          draw();
          return true;
      }
      if(matrix[1][1]==' '&&matrix[0][0]==' '&&matrix[2][2]=='O'){
          matrix[0][0]='O';
          draw();
          return true;
      }
      if(matrix[1][1]==' '&&matrix[0][0]=='O'&&matrix[2][2]==' '){
          matrix[1][1]='O';
          draw();
          return true;
      }
      if(matrix[0][2]=='O'&&matrix[1][1]==' '&&matrix[2][0]==' '){
          matrix[2][0]='O';
          draw();
          return true;
      }
      if(matrix[0][2]==' '&&matrix[1][1]==' '&&matrix[2][0]=='O'){
          matrix[1][1]='O';
          draw();
          return true;
      }
      if(matrix[0][2]==' '&&matrix[1][1]=='O'&&matrix[2][0]==' '){
          matrix[0][2]='O';
          draw();
          return true;
      }
      return false;
  }
  boolean impossible_defeater_check(){
      if(matrix[0][0]=='X'&&matrix[0][1]=='O'&&matrix[1][1]=='O'&&matrix[1][2]=='X'&&matrix[2][1]=='X'){
          matrix[2][0]='O';
          return true;
      }
      else 
          return false;
  }
  void levelselect(){
      if(lvlcheck == 0){
          random();
          draw();
          checkWin();
        }
      else if(lvlcheck == 1){
          CPUwincheck();
          if(checkWin())
          return;
          random();
          draw();
          checkWin();
      }
      else if(lvlcheck == 2||lvlcheck == 3||lvlcheck == 4){
          CPUwincheck();
       if(checkWin()){
      return;
      }
      brainM();
      checkWin();
      }
  }
}