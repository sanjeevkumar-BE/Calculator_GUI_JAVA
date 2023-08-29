import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main implements ActionListener {

    JLabel display;
    double num1,ans;

    boolean opclicked;
    char op;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btneq,btnclr,btndot,btnmod;
    Main(){
        JFrame jf=new JFrame("Calculator");
        jf.setSize(250,395);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //display
        display=new JLabel();
        display.setBounds(0,0,250,50);
        display.setText("");
        display.setBackground(Color.gray);
        display.setForeground(Color.white);
        display.setHorizontalAlignment(SwingConstants.CENTER);
        display.setOpaque(true);
        display.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(display);

        //buttons
        btn1=new JButton("1");
        btn1.setBounds(0,60,50,50);
        btn1.setBackground(Color.pink);
        jf.add(btn1);

        btn2=new JButton("2");
        btn2.setBounds(60,60,50,50);
        btn2.setBackground(Color.pink);
        jf.add(btn2);

        btn3=new JButton("3");
        btn3.setBounds(120,60,50,50);
        btn3.setBackground(Color.pink);
        jf.add(btn3);

        btn4=new JButton("4");
        btn4.setBounds(0,120,50,50);
        btn4.setBackground(Color.pink);
        jf.add(btn4);

        btn5=new JButton("5");
        btn5.setBounds(60,120,50,50);
        btn5.setBackground(Color.pink);
        jf.add(btn5);

        btn6=new JButton("6");
        btn6.setBounds(120,120,50,50);
        btn6.setBackground(Color.pink);
        jf.add(btn6);

        btn7=new JButton("7");
        btn7.setBounds(0,180,50,50);
        btn7.setBackground(Color.pink);
        jf.add(btn7);

        btn8=new JButton("8");
        btn8.setBounds(60,180,50,50);
        btn8.setBackground(Color.pink);
        jf.add(btn8);

        btn9=new JButton("9");
        btn9.setBounds(120,180,50,50);
        btn9.setBackground(Color.pink);
        jf.add(btn9);

        btn0=new JButton("0");
        btn0.setBounds(0,240,50,50);
        btn0.setBackground(Color.YELLOW);
        jf.add(btn0);
        btndot=new JButton(".");
        btndot.setBounds(60,240,50,50);
        btndot.setFont(new Font("Arial",Font.PLAIN,20));
        btndot.setBackground(Color.YELLOW);
        jf.add(btndot);

        btnmod=new JButton("%");
        btnmod.setBounds(120,240,50,50);
        btnmod.setBackground(Color.YELLOW);
        jf.add(btnmod);



        btnadd=new JButton("+");
        btnadd.setBounds(180,60,50,50);
        btnadd.setFont(new Font("Arial",Font.PLAIN,20));
        btnadd.setBackground(Color.YELLOW);
        jf.add(btnadd);

        btnsub=new JButton("-");
        btnsub.setBounds(180,120,50,50);
        btnsub.setFont(new Font("Arial",Font.PLAIN,20));
        btnsub.setBackground(Color.YELLOW);
        jf.add(btnsub);

        btnmul=new JButton("*");
        btnmul.setBounds(180,180,50,50);
        btnmul.setFont(new Font("Arial",Font.PLAIN,20));
        btnmul.setBackground(Color.YELLOW);
        jf.add(btnmul);

        btndiv=new JButton("/");
        btndiv.setBounds(180,240,50,50);
        btndiv.setBackground(Color.YELLOW);
        btndiv.setFont(new Font("Arial",Font.PLAIN,20));
        jf.add(btndiv);

        btneq=new JButton("=");
        btneq.setBounds(0,300,110,50);
        btneq.setFont(new Font("Arial",Font.PLAIN,30));
        btneq.setBackground(Color.CYAN);
        jf.add(btneq);
        btnclr=new JButton("Clear");
        btnclr.setBounds(120,300,110,50);
        btnclr.setFont(new Font("Arial",Font.PLAIN,30));
        btnclr.setBackground(Color.CYAN);
        jf.add(btnclr);



        //action listner
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnadd.addActionListener(this);
        btnsub.addActionListener(this);
        btnmul.addActionListener(this);
        btndiv.addActionListener(this);
        btneq.addActionListener(this);
        btnclr.addActionListener(this);
        btndot.addActionListener(this);
        btnmod.addActionListener(this);


    }
    public static void main(String[] args) {

        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btn1){
            display.setText(display.getText()+"1");
        }
        else if(e.getSource()==btn2){

            display.setText(display.getText()+"2");
        }

        else if(e.getSource()==btn3){

            display.setText(display.getText()+"3");
        }

        else if(e.getSource()==btn4){

            display.setText(display.getText()+"4");
        }

        else if(e.getSource()==btn5){

            display.setText(display.getText()+"5");
        }

        else if(e.getSource()==btn6){

            display.setText(display.getText()+"6");
        }

        else if(e.getSource()==btn7){

            display.setText(display.getText()+"7");
        }

        else if(e.getSource()==btn8){

            display.setText(display.getText()+"8");
        }

        else if(e.getSource()==btn9){

            display.setText(display.getText()+"9");
        }

        else if(e.getSource()==btn0){

            display.setText(display.getText()+"0");
        }

        else if(e.getSource()==btndot){

            display.setText(display.getText()+".");
        }
        else if(e.getSource()==btnadd){
            opclicked=true;
            String num=display.getText();
            display.setText("");
            num1=Double.parseDouble(num);
            if(opclicked){
                op='+';
            }
            opclicked=false;
        }

        else if(e.getSource()==btnsub){
            opclicked=true;
            String num=display.getText();
            display.setText("");
            num1=Double.parseDouble(num);
            if(opclicked){
                op='-';
            }
            opclicked=false;
        }

        else if(e.getSource()==btnmul){
            opclicked=true;
            String num=display.getText();
            display.setText("");
            num1=Double.parseDouble(num);
            if(opclicked){
                op='*';
            }
            opclicked=false;
        }

        else if(e.getSource()==btndiv){
            opclicked=true;
            String num=display.getText();
            display.setText("");
            num1=Double.parseDouble(num);
            if(opclicked){
                op='/';
            }
            opclicked=false;

        }

        else if(e.getSource()==btnmod){
            opclicked=true;
            String num=display.getText();
            display.setText("");
            num1=Double.parseDouble(num);
            if(opclicked){
                op='%';
            }
            opclicked=false;
        }
        else if(e.getSource()==btneq){
            String num_1=display.getText();
            double num2=Double.parseDouble(num_1);
            switch (op){
                case'+':
                    ans=num1+num2;
                    display.setText(String.valueOf(ans));
                    break;
                case '-':
                    ans=num1-num2;
                    display.setText(String.valueOf(ans));
                    break;
                case'*':
                    ans=num1*num2;
                    display.setText(String.valueOf(ans));
                    break;
                case '/':
                    ans=num1/num2;
                    display.setText(String.valueOf(ans));
                    break;
                case'%':
                    ans=num1%num2;
                    display.setText(String.valueOf(ans));
                    break;
            }

        }
        else{
            display.setText("");
        }
    }
}
