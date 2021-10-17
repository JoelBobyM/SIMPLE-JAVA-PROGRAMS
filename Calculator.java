import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class Calculator implements ActionListener
{
 String s1=new String();
 JFrame f;
 JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
 JButton ba,bs,bm,br,beq,bc,bp;
 JTextField t;
 JPanel p;
 ScriptEngineManager sem=new ScriptEngineManager();
 ScriptEngine sce=sem.getEngineByName("js");
 Object result;
 Calculator()
 {
  s1=" ";
  f=new JFrame("CALCULATOR");
  f.setSize(400,400);
  f.setLayout(null);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  t=new JTextField(18);
  t.addActionListener(this);
  p=new JPanel();
  p.setLayout(new GridLayout(4,4,5,5));
  b0=new JButton("0");
  b1=new JButton("1");
  b2=new JButton("2");
  b3=new JButton("3");
  b4=new JButton("4");
  b5=new JButton("5");
  b6=new JButton("6");
  b7=new JButton("7");
  b8=new JButton("8");
  b9=new JButton("9");
  ba=new JButton("+");
  bs=new JButton("-");
  bm=new JButton("*");
  br=new JButton("%");
  beq=new JButton("=");
  bc=new JButton("C");
  bp=new JButton(".");
  b0.addActionListener(this);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  ba.addActionListener(this);
  bs.addActionListener(this);
  bm.addActionListener(this);
  br.addActionListener(this);
  beq.addActionListener(this);
  bc.addActionListener(this);
  bp.addActionListener(this);
  p.add(b1);p.add(b2);
  p.add(b3);p.add(bc);
  p.add(b4);p.add(b5);
  p.add(b6);p.add(bm);
  p.add(b7);p.add(b8);
  p.add(b9);p.add(br);
  p.add(b0);p.add(bp);
  p.add(ba);p.add(bs);
  t.setBounds(40,30,225,45);
  p.setBounds(20,100,265,180);
  beq.setBounds(20,280,265,40);
  f.add(t);
  f.add(p);
  f.add(beq);
  f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
   String s=e.getActionCommand();
   if(s.charAt(0)=='C')
   {
     s1=" ";
     t.setText(s1);
   }
   else if(s.charAt(0)=='=')
   {
     try
     {
       result=sce.eval(s1);
       t.setText(result.toString());
     }
     catch(ScriptException se)
     {
       System.out.println(se);
     }
    }
    else
    {
      s1=s1+s;
      t.setText(s1);
    }
 }
 public static void main(String[]args)
 {
  new Calculator();
 }
}
  
   
