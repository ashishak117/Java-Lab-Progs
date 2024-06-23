package LabProgs;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Prog11 extends Applet implements ActionListener {
    Label ltitle,lname,lregno,ljava,lunix,lca;
    TextField tname,tregno,tjava,tunix,tca;
    Button cmdreport;
    int total;
    float avg;
    
    public void init() {
        setLayout(null);
        ltitle=new Label("Student Details");
        lname=new Label("Student Name");
        lregno=new Label("Regno");
        ljava=new Label("Java");
        lunix=new Label("Unix");
        lca=new Label("Comp architecture");

        tname=new TextField(20);
        tregno=new TextField(20);
        tjava=new TextField(3);
        tunix=new TextField(3);
        tca=new TextField(3);

        cmdreport=new Button("SUBMIT");

        ltitle.setBounds(100,0,150,10);
        lname.setBounds(0,50,100,20);
        tname.setBounds(120,50,100,20);
        lregno.setBounds(0,75,100,20);
        tregno.setBounds(120,75,100,20);
        ljava.setBounds(0,100,100,20);
        tjava.setBounds(120,100,40,20);
        lunix.setBounds(0,125,100,20);
        tunix.setBounds(120,125,40,20);
        lca.setBounds(0,150,100,20);
        tca.setBounds(100,225,150,30);

        add(ltitle);
        add(lname);
        add(tname);
        add(lregno);
        add(tregno);
        add(ljava);
        add(tjava);
        add(lunix);
        add(tunix);
        add(lca);
        add(tca);
        add(cmdreport);
        cmdreport.addActionListener(this);
    }
            
    public void actionPerformed(ActionEvent ae) {
        try {
            int java=Integer.parseInt(tjava.getText());
            int unix=Integer.parseInt(tunix.getText());
            int ca=Integer.parseInt(tca.getText());
            total=java+unix+ca;
            avg=total/3;
        }
        catch(NumberFormatException e) {}
        repaint();
    }
    public void paint(Graphics g) {
        Font f=new Font("Aerial",Font.BOLD,20);
        g.setFont(f);
        g.drawString("Student Report", 100, 275);
        g.drawString("--------------------------", 100, 300);
        g.drawString("Student Name:"+tname.getText(), 0, 320);
        g.drawString("Student Regno:"+tregno.getText(),0,340);
        g.drawString("Java"+tjava.getText(), 0, 360);
        g.drawString("Unix"+tunix.getText(),0,380);
        g.drawString("Comp Architecture:"+tca.getText(),0,400);
        g.drawString("Total:"+total,0,420);
        g.drawString("Avg:"+avg,0,440);
    }
}
