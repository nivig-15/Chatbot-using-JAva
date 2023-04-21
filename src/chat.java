import java.lang.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot extends JFrame {

    private JTextArea ca= new JTextArea();
    private JTextField cf=new JTextField();
    private JButton b=new JButton();
    private JLabel l=new JLabel();
    jdbc jc = new jdbc();
    private teacherlocation t = new teacherlocation();
    //private studentResult sr = new studentResult();
    private studentMarks sm = new studentMarks();

    Chatbot(){                                                // Layout and Properties defined in Constructor

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(800,800);                     //Outer box
        f.getContentPane().setBackground(Color.cyan);
        f.setTitle("ChatBot");
        f.add(ca);
        f.add(cf);
        ca.setSize(782,710);                    //Chatbot screen
        ca.setLocation(1, 1);
        ca.setBackground(Color.BLACK);
        cf.setSize(700,20);                     //type area
        cf.setLocation(1,720);
        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setSize(98,20);                       //send button
        b.setLocation(700,720);
        int enter = 10;

        b.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String reply = null;
                if((e.getSource() == b)) {                           // Message sent on Clicking send button

                    String text = cf.getText().toLowerCase();
                    ca.setForeground(Color.GREEN);
                    ca.append("You-->"+text+"\n");
                    cf.setText("");

                    if(text.contains("hi")) {                         // input Checking
                        replyMeth("Heyyy!!");
                    }
                    else if(text.contains("results")){
                        reply = sm.marks("Student Results:\n\tName\tRemarks\n\n");
                        replyMeth("Here are the results \n " + reply );
                    }
                    else if(text.contains("how are you")) {
                        replyMeth("I'm Good :).Thank you for asking");
                    }
                    else if(text.contains("what is your name")) {
                        replyMeth("I'm Java");
                    }
                    else if(text.contains("gender")) {
                        replyMeth("I'm a machine I do not have a gender");

                    }
                    else if(text.contains("marks")) {
                        reply = sm.marks();
                        replyMeth(reply);
                    }
                    else if(text.contains("passed")) {
                        reply = sm.marks("Student Results:\n\tName\tRemarks\n\n",1);
                        replyMeth(reply);
                    }
                    else if(text.contains("failed")) {
                        reply = sm.marks("Student Results:\n\tName\tRemarks\n\n",1,1);
                        replyMeth(reply);
                    }
                    else if(text.contains("faculty location")) {
                        reply = t.main();
                        replyMeth(reply);
                    }
                    else if(text.contains("cse faculty")) {
                        reply = t.CSE();
                        replyMeth(reply);
                    }
                    else if(text.contains("ece faculty")) {
                        reply = t.ECE();
                        replyMeth(reply);
                    }
                    else if(text.contains("me faculty")) {
                        reply = t.ME();
                        replyMeth(reply);
                    }
                    else if(text.contains("administration")) {
                        reply = t.Administration();
                        replyMeth(reply);
                    }

                    else if(text.contains("dean")) {
                        reply = t.Dean();
                        replyMeth(reply);
                    }

                    else if(text.contains("bye")) {
                        replyMeth("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
                    }
                    else if(text.contains("close")||text.contains("exit")){
                        System.out.println("Chatbot Application has been closed");
                        System.exit(0);
                    }
                    else
                        replyMeth("I Can't Understand");

                }

            }

            /* private String vaidation() {
                String s = null;
                return s;
            } */

        });

    }
    public void replyMeth(String s) {                          // Reply Method
        ca.append("ChatBot-->"+s+"\n");
    }

    /* public void Demo{
        System.out.println(t.Administration());
    }*/


}


public class chat {                                     //Driver Class

    public static void main(String[] args) {             //main class

        new Chatbot();                                  // instantiation
        System.out.println();
    }

}
