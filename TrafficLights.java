import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TrafficLights implements ActionListener{
   JFrame jf;
   JRadioButton r1,r2,r3;
   static int option=0;
   Traffic t;
   public TrafficLights(){
       jf=new JFrame("TRAFFIC LIGHTS CONTROL");
       jf.setSize(750,750);
       jf.setVisible(true);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       r1=new JRadioButton("STOP");
       r1.setBounds(100,100,100,100);
       r1.addActionListener(this);
       jf.add(r1);
       r2=new JRadioButton("READY");
       r2.setBounds(100,200,100,100);
       r2.addActionListener(this);
       jf.add(r2);
       r3=new JRadioButton("GO");
       r3.setBounds(100,300,100,100);
       r3.addActionListener(this);
       jf.add(r3);
       ButtonGroup b=new ButtonGroup();
       b.add(r1);
       b.add(r2);
       b.add(r3);        
       t=new Traffic();
       jf.add(t);       }
   public void actionPerformed(ActionEvent ae){
      if(ae.getActionCommand()=="STOP")
        option=1;
      if(ae.getActionCommand()=="READY")
        option=2;
      if(ae.getActionCommand()=="GO")
        option=3;
       t.setVisible(false);
       t=new Traffic();
       jf.add(t);          }  
   public static void main(String args[]) {
    TrafficLights s= new TrafficLights();  }  }
  class Traffic extends JPanel{
        public void paint(Graphics g){
            g.drawOval(300,150,100,100);
            g.drawOval(300,300,100,100);
            g.drawOval(300,450,100,100);                                                                                                               
              if(TrafficLights.option==1){
                   g.setColor(Color.red);
                   g.fillOval(300,150,100,100); }
              else if(TrafficLights.option==2){
                   g.setColor(Color.yellow);
                   g.fillOval(300,300,100,100);}
              else if(TrafficLights.option==3){
                  g.setColor(Color.green);
                  g.fillOval(300,450,100,100);}} }

