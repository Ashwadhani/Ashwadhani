//calculator code
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;
import java.awt.Graphics;

public class Calculator implements ActionListener{
    int c,n;
	double pi,degree,radian,hyp,random,sin,cos,tant;
    String s1,s2,s3,s4,s5;
    JFrame f;
    JButton b0,brand, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, beq, bclr,bsq,bro,bsin,btant,bhyp,bcos,bpi,bfact,bcu,bp4,blog;
    JPanel p;
    TextField t1;
    GridLayout g;
    Calculator(){
        f = new JFrame("Calculator");
        f.setLayout(new FlowLayout());
        p = new JPanel();
        b0 = new JButton("   0   ");
        b0.addActionListener(this);
        
        b1 = new JButton("   1   ");
        b1.addActionListener(this);
		b1.setBounds(50,50,20,30);

        b2 = new JButton("   2   ");
        b2.addActionListener(this);

        b3 = new JButton("   3   ");
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.addActionListener(this);

        badd = new JButton("+");
        badd.addActionListener(this);

        bsub = new JButton("-");
        bsub.addActionListener(this);

        bmul = new JButton("*");
        bmul.addActionListener(this);

        bdiv = new JButton("/");
        bdiv.addActionListener(this);

        beq = new JButton("=");
        beq.addActionListener(this);

        bclr = new JButton("CLR");
        bclr.addActionListener(this);
		
		bsq = new JButton("x^2");
		bsq.addActionListener(this);
		
		bro = new JButton("√");
		bro.addActionListener(this);
	
		bsin = new JButton("sin");
		bsin.addActionListener(this);
		
		bcos = new JButton("cos");
		bcos.addActionListener(this);
		
		btant = new JButton("tan");
		btant.addActionListener(this);
		
		bhyp = new JButton("hyp");
		bhyp.addActionListener(this);
		
		bcu = new JButton("x^3");
		bcu.addActionListener(this);
		
		bp4 = new JButton("x^4");
		bp4.addActionListener(this);
		
		bfact = new JButton("log10");
		bfact.addActionListener(this);
		
		bpi = new JButton("𝞹");
		bpi.addActionListener(this);
		
		blog = new JButton("log");
		blog.addActionListener(this);
		
		brand = new JButton("random");
		brand.addActionListener(this);
		

        t1 = new TextField(20);
        f.add(t1);
        g = new GridLayout(7,2);
        p.setLayout(g);
        
		t1.setForeground(Color.WHITE);
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		b8.setForeground(Color.WHITE);
		b9.setForeground(Color.WHITE);
		b0.setForeground(Color.WHITE);
		
		t1.setBackground(Color.BLACK);
		p.setBackground(Color.BLACK);
		f.add(p);
		b1.setBackground(Color.DARK_GRAY);
		b0.setBackground(Color.DARK_GRAY);
		b2.setBackground(Color.DARK_GRAY);
		b3.setBackground(Color.DARK_GRAY);
		b4.setBackground(Color.DARK_GRAY);
		b5.setBackground(Color.DARK_GRAY);
		b6.setBackground(Color.DARK_GRAY);
		b7.setBackground(Color.DARK_GRAY);
		b8.setBackground(Color.DARK_GRAY);
		b9.setBackground(Color.DARK_GRAY);
		badd.setBackground(Color.ORANGE);
		bsub.setBackground(Color.ORANGE);
		bmul.setBackground(Color.ORANGE);
		bdiv.setBackground(Color.ORANGE);
		bclr.setBackground(Color.LIGHT_GRAY);
		bsq.setBackground(Color.ORANGE);
		bsin.setBackground(Color.ORANGE);
		bcos.setBackground(Color.ORANGE);
		btant.setBackground(Color.ORANGE);
		beq.setBackground(Color.ORANGE);
		bro.setBackground(Color.ORANGE);
		bcu.setBackground(Color.ORANGE);
		bhyp.setBackground(Color.ORANGE);
		bp4.setBackground(Color.ORANGE);
		bpi.setBackground(Color.ORANGE);
		bfact.setBackground(Color.ORANGE);
		blog.setBackground(Color.ORANGE);
		brand.setBackground(Color.ORANGE);
		
		b0.setSize(20,15);
    
        p.add(badd);
        p.add(bsub);
        p.add(bmul);

        p.add(bdiv);
        p.add(beq);
		p.add(bsq);
		p.add(bro);
		p.add(bsin);
		p.add(bcos);
		p.add(btant);
		p.add(bhyp);
		p.add(bp4);
		p.add(bcu);
		p.add(bpi);
		p.add(bfact);
		p.add(blog);
		p.add(b0);
        p.add(b1);
        p.add(b2);
		p.add(brand);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(bclr);
        p.add(b7);
        p.add(b8);
        p.add(b9);
		//p.add(bclr);
        p.add(b6);
        f.add(p);
        f.setSize(400,400);
        f.setVisible(true);
        f.setBackground(Color.LIGHT_GRAY);
		f.setForeground(Color.LIGHT_GRAY);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b0){
            s3 = t1.getText();
            s4 = "0";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b1){
            s3 = t1.getText();
            s4 = "1";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b2){
            s3 = t1.getText();
            s4 = "2";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b3){
            s3 = t1.getText();
            s4 = "3";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b4){
            s3 = t1.getText();
            s4 = "4";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b5){
            s3 = t1.getText();
            s4 = "5";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b6){
            s3 = t1.getText();
            s4 = "6";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b7){
            s3 = t1.getText();
            s4 = "7";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b8){
            s3 = t1.getText();
            s4 = "8";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==b9){
            s3 = t1.getText();
            s4 = "9";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if(e.getSource()==badd){
            s1 = t1.getText();
            t1.setText("+");
            c = 1;
        }
        if(e.getSource()==bsub){
            s1 = t1.getText();
            t1.setText("-");
            c = 2;
        }
        if(e.getSource()==bmul){
            s1 = t1.getText();
            t1.setText("");
            c = 3;
        }
        if(e.getSource()==bdiv){
            s1 = t1.getText();
            t1.setText("");
            c = 4;
        }
		if(e.getSource()==bsin)
		{
			s1=t1.getText();
			t1.setText("sin");
			c = 5;
		}
		if(e.getSource()==bcos)
		{
			s1=t1.getText();
			t1.setText("cos");
			c = 6;
		}
		if(e.getSource()==btant)
		{
			s1=t1.getText();
			t1.setText("tan");
			c = 7;
		}
		if(e.getSource()==bhyp)
		{
			s1=t1.getText();
			t1.setText("hyp");
			c = 8;
		}
		if(e.getSource()==bp4)
		{
			s1=t1.getText();
			t1.setText("^4");
			c = 9;
		}
		if(e.getSource()==bcu)
		{
			s1=t1.getText();
			t1.setText("^3");
			c = 10;
		}
		if(e.getSource()==bsq)
		{
			s1=t1.getText();
			t1.setText("^2");
			c = 11;
		}
		if(e.getSource()==bpi)
		{
			s1=t1.getText();
			t1.setText("𝞹");
			c = 12;
		}
		if(e.getSource()==blog)
		{
			s1=t1.getText();
			t1.setText("log");
			c = 13;
		}
		if(e.getSource()==brand)
		{
			s1=t1.getText();
			t1.setText("");
			c = 14;
		}
		if(e.getSource()==bfact)
		{
			s1=t1.getText();
			t1.setText("!");
			c = 15;
		}
		if(e.getSource()==bro)
		{
			s1=t1.getText();
			t1.setText("√ ");
			c = 16;
		}
			
        if(e.getSource()==beq){
            s2 = t1.getText();
            if(c==1){
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==2){
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==3){
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==4){
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
			if(c==5)
			{
				pi = Math.PI;
                degree = Integer.parseInt(s1);
                radian = degree * pi/180;
				sin = Math.sin(radian);
                t1.setText(String.valueOf(sin));
            }
			if(c==6)
			{
			    degree = Integer.parseInt(s1);
                radian = Math.toRadians(degree);
				cos = Math.cos(radian);
                t1.setText(String.valueOf(cos));
			}
			if(c==7)
			{
				degree = Integer.parseInt(s1);
				double r = Math.toRadians(degree);
				tant = Math.tan(r);
				t1.setText(String.valueOf(tant));
			}
			if(c==8)
			{
				degree = Integer.parseInt(s1);
				radian = Integer.parseInt(s2);
				hyp = Math.hypot(degree,radian);
				t1.setText(String.valueOf(hyp));
			}
			if(c==9)
			{
				n = Integer.parseInt(s1);
				n = n*n*n*n;
				t1.setText(String.valueOf(n));
			}
			if(c==10)
			{
				n = Integer.parseInt(s1);
				n = n*n*n;
				t1.setText(String.valueOf(n));
			}
			if(c==11)
			{
				n = Integer.parseInt(s1);
				n = n*n;
				t1.setText(String.valueOf(n));
			}
			if(c==12)
			{
				pi = 3.14;
				n = Integer.parseInt(s1);
				double m  = pi*n;
				t1.setText(String.valueOf(m));
			}
			if(c==13)
			{
				n = Integer.parseInt(s1);
				double m = Math.log(n);
				t1.setText(String.valueOf(m));
			}
			if(c==14)
			{
				degree = Math.random();
                random = Math.round((degree * 10.0) + .5);
                t1.setText(String.valueOf(random));
			}
			if(c==15)
			{
			    n = Integer.parseInt(s1);
				double m = Math.log10(n);
				t1.setText(String.valueOf(m));
			}
			if(c==16)
			{
			    n = Integer.parseInt(s1);
				double l = Math.sqrt(n);
				t1.setText(String.valueOf(l));
			}
		}
	
            if(e.getSource()==bclr){
            t1.setText("");
        }
	}
	

    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
	}
