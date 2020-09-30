package javaapplication44;

import java.lang.Math;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.sqrt;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ca extends JFrame implements ActionListener {

    cx v = new cx();
    Double op;
    double num1;
    double num2;
    char ope;
    double result;
    Double e;
    String f;
    JPanel p1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26,b27;
    JTextField t1;

    public Ca() {
        t1 = new JTextField();
        p1 = new JPanel();

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("+");
        b12 = new JButton("-");
        b13 = new JButton("÷");
        b14 = new JButton("*");
        b15 = new JButton("1/x");
        b16 = new JButton("x^2");
        b17 = new JButton("%");
        b18 = new JButton("=");
        b19 = new JButton("-/+");
        b20 = new JButton("Del");
        b21 = new JButton("sin");
        b22 = new JButton("cos");
        b23 = new JButton("tan");
        b24 = new JButton("x^3");
        b25 = new JButton(".");
        b26 = new JButton("off");
        b27=new JButton ("sqrt");
        this.setTitle("Calcualtor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(400, 500);
        this.setLocation(300, 20);
this.add(b27);
        b1.setBounds(5, 275, 50, 40);
        b2.setBounds(60, 275, 50, 40);
        b3.setBounds(115, 275, 50, 40);
        b4.setBounds(5, 325, 50, 40);
        b5.setBounds(60, 325, 50, 40);
        b6.setBounds(115, 325, 50, 40);
        b7.setBounds(5, 375, 50, 40);
        b8.setBounds(60, 375, 50, 40);
        b9.setBounds(115, 375, 50, 40);
           b27.setBounds(335, 275, 60, 40);
        b10.setBounds(60, 430, 50, 40);
        b18.setBounds(115, 420, 50, 50);
        b19.setBounds(5, 430, 50, 40);
        b11.setBounds(170, 275, 50, 40);
        b12.setBounds(225, 275, 50, 40);
        b13.setBounds(280, 275, 50, 40);
        b14.setBounds(170, 325, 50, 40);
        b15.setBounds(225, 325, 60, 40);
        b16.setBounds(290, 325, 60, 40);
        b17.setBounds(170, 375, 50, 40);
        b20.setBounds(335, 230, 60, 40);
        b21.setBounds(225, 375, 60, 40);
        b22.setBounds(290, 375, 60, 40);
        b23.setBounds(170, 430, 60, 40);
        b24.setBounds(235, 430, 60, 40);
        b25.setBounds(300, 430, 50, 40);
        b26.setBounds(270, 230, 60, 40);
     
        b20.setBackground(Color.yellow);
        b11.setFont(new Font("iireire", Font.BOLD, 20));
        t1.setFont(new Font("iireire", Font.BOLD, 20));
        b12.setFont(new Font("iireire", Font.BOLD, 20));
        b13.setFont(new Font("iireire", Font.BOLD, 20));
        b17.setFont(new Font("iireire", Font.BOLD, 15));
        b18.setFont(new Font("iireire", Font.BOLD, 15));
        b14.setFont(new Font("iireire", Font.BOLD, 20));
        b19.setFont(new Font("iireire", Font.BOLD, 13));
        t1.setBounds(30, 30, 300, 40);
        b26.setForeground(Color.red);
        p1.setBackground(Color.red);
        this.setLayout(null);
        this.add(p1);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b10);
        this.add(b18);
        this.add(b19);
        this.add(b11);
        this.add(b12);
        this.add(b13);
        this.add(b14);
        this.add(b15);
        this.add(b16);
        this.add(b17);
        this.add(b20);
        this.add(b21);
        this.add(b22);
        this.add(b23);
        this.add(b24);
        this.add(b25);
        this.add(t1);
        this.add(b26);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b1.addMouseListener(v);
        b2.addMouseListener(v);
        b3.addMouseListener(v);
        b4.addMouseListener(v);
        b5.addMouseListener(v);
        b6.addMouseListener(v);
        b7.addMouseListener(v);
        b8.addMouseListener(v);
        b9.addMouseListener(v);
        b10.addMouseListener(v);
        b27.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String q = t1.getText() + "1";
            t1.setText(q);
        }
        if (ae.getSource() == b2) {
            String q = t1.getText() + "2";
            t1.setText(q);
        }
        if (ae.getSource() == b3) {
            String q = t1.getText() + "3";
            t1.setText(q);
        }
        if (ae.getSource() == b4) {
            String q = t1.getText() + "4";
            t1.setText(q);
        }
        if (ae.getSource() == b5) {
            String q = t1.getText() + "5";
            t1.setText(q);
        }
        if (ae.getSource() == b6) {
            String q = t1.getText() + "6";
            t1.setText(q);
        }
        if (ae.getSource() == b7) {
            String q = t1.getText() + "7";
            t1.setText(q);
        }
        if (ae.getSource() == b8) {
            String q = t1.getText() + "8";
            t1.setText(q);
        }
        if (ae.getSource() == b9) {
            String q = t1.getText() + "9";
            t1.setText(q);
        }
        if (ae.getSource() == b10) {
            String q = t1.getText() + "0";
            t1.setText(q);
        }
        if (ae.getSource() == b11) {
            nbn('+');
        }
        if (ae.getSource() == b12) {
            nbn('-');
        }
        if (ae.getSource() == b13) {
            nbn('÷');
        }
        if (ae.getSource() == b14) {
            nbn('*');
        }
        if (ae.getSource() == b15) {
            Double x = Double.parseDouble(t1.getText());
            Double qw = 1 / x;
            t1.setText(String.valueOf(qw));

        }
        if (ae.getSource() == b16) {
            Double x = Double.parseDouble(t1.getText());
            Double qw = Math.pow(x, 2);
            t1.setText(String.valueOf(qw));
        }
        if (ae.getSource() == b17) {
            nbn('%');
        }
        if (ae.getSource() == b18) {

            Double v = Double.parseDouble(t1.getText());

            t1.setText(" ");
            if (ope == '+' || ope == '-' || ope == '÷' || ope == '*' || ope == '%') {
                switch (ope) {
                    case '+':
                        result = num1 + v;
                        break;
                    case '-':
                        result = num1 - v;
                        break;
                    case '÷':
                        result = num1 / v;
                        break;
                    case '*':
                        result = num1 * v;
                        break;
                    case '%':
                        result = num1 % v;
                        break;
                    case '/':
                        result = 1 / v;
                }
                t1.setText(String.valueOf(result));
            }

        }
        if (ae.getSource() == b19) {
            Double c = Double.parseDouble(t1.getText());
            c = c * (-1);
            t1.setText(String.valueOf(c));
        }
        if (ae.getSource() == b20) {
            t1.setText("  ");

        }
        if (ae.getSource() == b21) {
            Double x = Double.parseDouble(t1.getText());
            Double qw = Math.sin(x * Math.PI / 180);
            t1.setText(String.valueOf(qw));
        }

        if (ae.getSource() == b22) {
            Double x = Double.parseDouble(t1.getText());
            Double qw = Math.cos(x * Math.PI / 180);
            t1.setText(String.valueOf(qw));
        }
        if (ae.getSource() == b23) {
            Double x = Double.parseDouble(t1.getText());
            Double qw = Math.tan(x * Math.PI / 180);
            t1.setText(String.valueOf(qw));
        }
        if (ae.getSource() == b24) {
            Double x = Double.parseDouble(t1.getText());
            Double qw = (Math.pow(x, 3));
            t1.setText(String.valueOf(qw));

        }
        if (ae.getSource() == b25) {
            String w = t1.getText() + ".";
            t1.setText(".");
        }
        if (ae.getSource() == b26) {
            System.exit(0);
        }
        if(ae.getSource()==b27){
         Double x = Double.parseDouble(t1.getText());
            Double qw = (Math.sqrt(x));
            t1.setText(String.valueOf(qw));
        }

    }

    private void nbn(char operation) {
        num1 = Double.parseDouble(t1.getText());
        t1.setText(" ");
        ope = operation;
    }

    private class cx implements MousemotionListener, MouseListener, MouseWheelListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            b1.setBackground(Color.red);
            b2.setBackground(Color.red);
            b3.setBackground(Color.red);
            b4.setBackground(Color.red);
            b5.setBackground(Color.red);
            b6.setBackground(Color.red);
            b7.setBackground(Color.red);
            b8.setBackground(Color.red);
            b9.setBackground(Color.red);
            b10.setBackground(Color.red);

        }

        @Override
        public void mousePressed(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            b1.setBackground(Color.yellow);
            b2.setBackground(Color.yellow);
            b3.setBackground(Color.yellow);
            b4.setBackground(Color.yellow);
            b5.setBackground(Color.yellow);
            b6.setBackground(Color.yellow);
            b7.setBackground(Color.yellow);
            b8.setBackground(Color.yellow);
            b9.setBackground(Color.yellow);
            b10.setBackground(Color.yellow);

        }

        @Override
        public void mouseExited(MouseEvent me) {
            b1.setBackground(Color.white);
            b2.setBackground(Color.white);
            b3.setBackground(Color.white);
            b4.setBackground(Color.white);
            b5.setBackground(Color.white);
            b6.setBackground(Color.white);
            b7.setBackground(Color.white);
            b8.setBackground(Color.white);
            b9.setBackground(Color.white);
            b10.setBackground(Color.white);
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent mwe) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
