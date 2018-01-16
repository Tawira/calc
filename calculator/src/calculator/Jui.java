package calculator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Jui extends JFrame{
	private JTextField answerfield;
	private JButton  clear, off, on, one, two, three, four, five, six, seven, eight, nine, zero, decimal, add, sub, multiply, div, equals, back;
	private String stemp1, stemp2, sanswer;
	private double answer = 0.0;
	private JPanel contentPanel;
	private JLabel l1, l2, l3, l4, l5, l6;
	private boolean equalsClicked = false, opChosen = false;
	char operation= ' ';
	
	public Jui(){
		super("Calculator");
		
	answerfield = new JTextField(null, 25);
	answerfield.setEditable(false);
	
	
	l1 = new JLabel(" ");
	l2 = new JLabel(" ");
	clear = new JButton("C");
	off = new JButton("Off");
	on = new JButton("On");
	seven = new JButton("7");
	eight = new JButton("8");
	nine = new JButton("9");
	add = new JButton("+");
	sub = new JButton("-");
	four = new JButton("4");
	five = new JButton("5");
	six = new JButton("6");
	multiply = new JButton("*");
	div = new JButton("/");
	one = new JButton("1");
	two = new JButton("2");
	three = new JButton("3");
	l3 = new JLabel(" ");
	l4 = new JLabel(" ");
	zero = new JButton("0");
	decimal = new JButton(".");
	l5 = new JLabel(" ");
	back = new JButton("BACK");
	equals = new JButton("=");
	l6 = new JLabel(" ");
	
	Dimension dim = new Dimension(55, 25);
	
	clear.setPreferredSize(dim);
	off.setPreferredSize(dim);
	on.setPreferredSize(dim);
	one.setPreferredSize(dim);
	two.setPreferredSize(dim);
	three.setPreferredSize(dim);
	four.setPreferredSize(dim);
	five.setPreferredSize(dim);
	six.setPreferredSize(dim);
	seven.setPreferredSize(dim);
	eight.setPreferredSize(dim);
	nine.setPreferredSize(dim);
	zero.setPreferredSize(dim);
	add.setPreferredSize(dim);
	sub.setPreferredSize(dim);
	multiply.setPreferredSize(dim);
	div.setPreferredSize(dim);
	equals.setPreferredSize(dim);
	decimal.setPreferredSize(dim);
	l1.setPreferredSize(dim);
	l2.setPreferredSize(dim);
	l3.setPreferredSize(dim);
	l4.setPreferredSize(dim);
	l5.setPreferredSize(dim);
	l6.setPreferredSize(dim);
	clear.setPreferredSize(dim);
	back.setPreferredSize(dim);
	
	

	Numbers n = new Numbers();
	Calc c = new Calc();	
	
	
	one.addActionListener(n);two.addActionListener(n);three.addActionListener(n);
	four.addActionListener(n);five.addActionListener(n);six.addActionListener(n);
	seven.addActionListener(n);eight.addActionListener(n);nine.addActionListener(n);
	zero.addActionListener(n); decimal.addActionListener(n);back.addActionListener(n); on.addActionListener(n);
	off.addActionListener(n);
	
    add.addActionListener(c); sub.addActionListener(c); multiply.addActionListener(c);
    div.addActionListener(c); equals.addActionListener(c); clear.addActionListener(c);
	
	contentPanel = new JPanel();
	contentPanel.setBackground(Color.BLUE);
	contentPanel.setLayout(new FlowLayout());
	
	contentPanel.add(answerfield, BorderLayout.NORTH);
	contentPanel.add(l1);contentPanel.add(l2); contentPanel.add(clear); contentPanel.add(off); contentPanel.add(on);
	contentPanel.add(seven); contentPanel.add(eight); contentPanel.add(nine); contentPanel.add(add);
	contentPanel.add(sub); contentPanel.add(four); contentPanel.add(five); contentPanel.add(six); contentPanel.add(multiply); contentPanel.add(div);
	contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(l3); contentPanel.add(l4); contentPanel.add(zero); contentPanel.add(decimal); 
	contentPanel.add(l5); contentPanel.add(back); contentPanel.add(equals); contentPanel.add(l6);
	
	
	this.setContentPane(contentPanel);
			
	}

	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event) {
	    JButton src = (JButton) event.getSource();
	    
	    if(src.equals(one)) {
	    	if(opChosen==false) {
	    		if(stemp1==null) {
	    			stemp1 = "1";
	    		}else {
	    			stemp1 = stemp1 + "1";
	    		}
	    	}else {
	    		if(stemp2==null) {
	    			stemp2 = "1";
	    		}else {
	    			stemp1 = stemp2 + "1";
	        	}
	    	}
	    }
		
	    		
	    		if(src.equals(two)) {
	    			if(opChosen==false) {
	    				if(stemp1==null) {
	    					stemp1 = "2";
	    				}else {
	    					stemp1 = stemp1 + "2";
	    				}
	    			}else {
	    				if(stemp2==null) {
	    					stemp2 = "2";
	    				}else {
	    					stemp2 = stemp2 + "2";
	    			   }
	    			}
	    		}
	    				if(src.equals(three)) {
	    	    			if(opChosen==false) {
	    	    				if(stemp1==null) {
	    	    					stemp1 = "3";
	    	    				}else {
	    	    					stemp1 = stemp1 + "3";
	    	    				}
	    	    			}else {
	    	    				if(stemp2==null) {
	    	    					stemp2 = "3";
	    	    				}else {
	    	    					stemp2 = stemp2 + "3";
	    		                }
	    	    			}
	    				}
	    	    				if(src.equals(four)) {
	    	    	    			if(opChosen==false) {
	    	    	    				if(stemp1==null) {
	    	    	    					stemp1 = "4";
	    	    	    				}else {
	    	    	    					stemp1 = stemp1 + "4";
	    	    	    				}
	    	    	    			}else {
	    	    	    				if(stemp2==null) {
	    	    	    					stemp2 = "4";
	    	    	    				}else {
	    	    	    					stemp2 = stemp2 + "4";
	      }
	    	    	    			}
	    	    				}
	    	    	    				if(src.equals(five)) {
	    	    	    	    			if(opChosen==false) {
	    	    	    	    				if(stemp1==null) {
	    	    	    	    					stemp1 = "5";
	    	    	    	    				}else {
	    	    	    	    					stemp1 = stemp1 + "5";
	    	    	    	    				}
	    	    	    	    			}else {
	    	    	    	    				if(stemp2==null) {
	    	    	    	    					stemp2 = "5";
	    	    	    	    				}else {
	    	    	    	    					stemp2 = stemp2 + "5"; 	    				
	  }
	    	    	    	    			}
	    	    	    				}
	    	    	    	    				if(src.equals(six)) {
	    	    	    	    	    			if(opChosen==false) {
	    	    	    	    	    				if(stemp1==null) {
	    	    	    	    	    					stemp1 = "6";
	    	    	    	    	    				}else {
	    	    	    	    	    					stemp1 = stemp1 + "6";
	    	    	    	    	    				}
	    	    	    	    	    			}else {
	    	    	    	    	    				if(stemp2==null) {
	    	    	    	    	    					stemp2 = "6";
	    	    	    	    	    				}else {
	    	    	    	    	    					stemp2 = stemp2 + "6";  	    				
   }
	    	    	    	    	    			}
	    	    	    	    				}
	    	    	    	    	    				
	    	    	    	    	    				if(src.equals(seven)) {
	    	    	    	    	    	    			if(opChosen==false) {
	    	    	    	    	    	    				if(stemp1==null) {
	    	    	    	    	    	    					stemp1 = "7";
	    	    	    	    	    	    				}else {
	    	    	    	    	    	    					stemp1 = stemp1 + "7";
	    	    	    	    	    	    				}
	    	    	    	    	    	    			}else {
	    	    	    	    	    	    				if(stemp2==null) {
	    	    	    	    	    	    					stemp2 = "7";
	    	    	    	    	    	    				}else {
	    	    	    	    	    	    					stemp2 = stemp2 + "7";   	    	    	    				
}
	    	    	    	    	    	    			}
	    	    	    	    	    				}
	    	    	    	    	    	    				
	    	    	    	    	    	    				if(src.equals(eight)) {
	    	    	    	    	    	    	    			if(opChosen==false) {
	    	    	    	    	    	    	    				if(stemp1==null) {
	    	    	    	    	    	    	    					stemp1 = "8";
	    	    	    	    	    	    	    				}else {
	    	    	    	    	    	    	    					stemp1 = stemp1 + "8";
	    	    	    	    	    	    	    				}
	    	    	    	    	    	    	    			}else {
	    	    	    	    	    	    	    				if(stemp2==null) {
	    	    	    	    	    	    	    					stemp2 = "8";
	    	    	    	    	    	    	    				}else {
	    	    	    	    	    	    	    					stemp2 = stemp2 + "8"; 
	    	    	    	    	    	    	    				}
	    	    	    	    	    	    	    			}
	    	    	    	    	    	    				}
	    	    	    	    	    	    	    					if(src.equals(nine)) {
	    	    	    	    	    	    	    		    			if(opChosen==false) {
	    	    	    	    	    	    	    		    				if(stemp1==null) {
	    	    	    	    	    	    	    		    					stemp1 = "9";
	    	    	    	    	    	    	    		    				}else {
	    	    	    	    	    	    	    		    					stemp1 = stemp1 + "9";
	    	    	    	    	    	    	    		    				}
	    	    	    	    	    	    	    		    			}else {
	    	    	    	    	    	    	    		    				if(stemp2==null) {
	    	    	    	    	    	    	    		    					stemp2 = "9";
	    	    	    	    	    	    	    		    				}else {
	    	    	    	    	    	    	    		    					stemp2 = stemp2 + "9";
	    	    	    	    	    	    	    		    				}
	    	    	    	    	    	    	    		    			}
	    	    	    	    	    	    	    					}
	    	    	    	    	    	    	    		    					if(src.equals(zero)) {
	    	    	    	    	    	    	    		    		    			if(opChosen==false) {
	    	    	    	    	    	    	    		    		    				if(stemp1==null) {
	    	    	    	    	    	    	    		    		    					stemp1 = "0";
	    	    	    	    	    	    	    		    		    				}else {
	    	    	    	    	    	    	    		    		    					stemp1 = stemp1 + "0";
	    	    	    	    	    	    	    		    		    				}
	    	    	    	    	    	    	    		    		    			}else {
	    	    	    	    	    	    	    		    		    				if(stemp2==null) {
	    	    	    	    	    	    	    		    		    					stemp2 = "0";
	    	    	    	    	    	    	    		    		    				}else {
	    	    	    	    	    	    	    		    		    					stemp2 = stemp2 + "0";
	    	    	    	    	    	    	    		    		    				}
	    	    	    	    	    	    	    		    		    			}
	    	    	    	    	    	    	    		    					}
	    	    	    	    	    	    	    		    					
	    	    	    	    	    	    	    		    					if(src.equals(decimal)) {
	    	    	    	    	    	    	    		    		    			if(opChosen==false) {
	    	    	    	    	    	    	    		    		    				if(stemp1==null) {
	    	    	    	    	    	    	    		    		    					stemp1 = "0.";
	    	    	    	    	    	    	    		    		    				}else
	    	    	    	    	    	    	    		    		    				if(stemp1 != null){
	    	    	    	    	    	    	    		    		    					
	    	    	    	    	    	    	    		    		    					if(stemp1.contains(".")) {
	    	    	    	    	    	    	    		    		    						System.out.println("You already have a decimal point");
	    	    	    	    	    	    	    		    		    					}else {
	    	    	    	    	    	    	    		    		    						stemp1 += ".";
	    	    	    	    	    	    	    		    		    					}
	    	    	    	    	    	    	    		    		    					
	    	    	    	    	    	    	    		    		    					
	    	    	    	    	    	    	    		    		    				}
	    	    	    	    	    	    	    		    		    			}else {
	    	    	    	    	    	    	    		    		    				if(stemp2==null) {
	    	    	    	    	    	    	    		    		    					stemp2 = "0.";
	    	    	    	    	    	    	    		    		    				}else 
	    	    	    	    	    	    	    		    		    				if(stemp2 != null){
	    	    	    	    	    	    	    		    		    					if(stemp2.contains(".")) {
	    	    	    	    	    	    	    		    		    						System.out.println("You already have a decimal point");
	    	    	    	    	    	    	    		    		    					}else {
	    	    	    	    	    	    	    		    		    						stemp2 += ".";
	    	    	    	    	    	    	    		    		    					}
	    	    	    	    	    	    	    		    		    					
	    	    	    	    	    	    	    		    		    				}
	    	    	    	    	    	    	    		    		    			}
	    	    	    	    	    	    	    		    					}
	    	    	    	    	    	    	    		    					
	    	    	    	    	    	    	    		    					    		    					
	    	    	    	    	    	    	    		    	if(src.equals(back))	{
	    	    	    	    	    	    	    		    		if(opChosen==false) {
	    	    	    	    	    	    	    		    			if(stemp1==null) {
	    	    	    	    	    	    	    		    				System.out.println("CANT DELETE NOTHING!");;
	    	    	    	    	    	    	    		    			}else {
	    	    	    	    	    	    	    		    				stemp1 = stemp1.substring(0, stemp1.length()-1);
	    	    	    	    	    	    	    		    			
	    	    	    	    	    	    	    		    			}
	    	    	    	    	    	    	    		    		}else {
	    	    	    	    	    	    	    		    			
	    	    	    	    	    	    	    		    			if(stemp2==null) {
	    	    	    	    	    	    	    		    				System.out.println("Cant DELETE NOTHING !");
	    	    	    	    	    	    	    		    			}else {
	    	    	    	    	    	    	    		    				stemp2= stemp2.substring(0, stemp2.length()-1);
	    	    	    	    	    	    	    		    			}
	    	    	    	    	    	    	    		    		}
	    	    	    	    	    	    	    		    	}
	    	    	    	    	    	    	    		    				
	    	    	    	    	    	    	    		    		if(equalsClicked==false){	
	    	    	    	    	    	    	    		    		if(opChosen==false){
	    	    	    	    	    	    	    		    			answerfield.setText(stemp1);
	    	    	    	    	    	    	    		    		}else {
	    	    	    	    	    	    	    		    			answerfield.setText(stemp2);
	    	    	    	    	    	    	    		    		}
	    	    	    	    	    	    	    		    }
	    	    	    	    	    	    	    		    		
		}
	}

	private class Calc implements ActionListener{ 
	public void actionPerformed(ActionEvent event) { 
		JButton src = (JButton) event.getSource();
		
		
		if(src.equals(add)) {
			if(stemp1==null) {
				System.out.println("Choose your numbers first!");
			}else
				if(stemp1 != null && stemp2 == null) {
					opChosen =  true;
					operation = '+';
				}else
					if(stemp1 != null && stemp2 != null) {
						System.out.println("Two operations only!");
					}
		}
		
		if(src.equals(sub)) {
			if(stemp1==null) {
				System.out.println("Choose your numbers first!");
			}else
				if(stemp1 != null && stemp2 == null) {
					opChosen =  true;
					operation = '+';
				}else
					if(stemp1 != null && stemp2 != null) {
						System.out.println("Two operations only!");
					}
		}
		
		if(src.equals(multiply)) {
			if(stemp1==null) {
				System.out.println("Choose your numbers first!");
			}else
				if(stemp1 != null && stemp2 == null) {
					opChosen =  true;
					operation = '+';
				}else
					if(stemp1 != null && stemp2 != null) {
						System.out.println("Two operations only!");
					}
		}
		
		if(src.equals(div)) {
			if(stemp1==null) {
				System.out.println("Choose your numbers first!");
			}else
				if(stemp1 != null && stemp2 == null) {
					opChosen =  true;
					operation = '+';
				}else
					if(stemp1 != null && stemp2 != null) {
						System.out.println("Two operations only!");
					}
			
			if(src.equals(equals)) {
				if(stemp1==null) {
					System.out.println("Choose your numbers first!");
				}else
					if(stemp1 != null && stemp2 == null) {
						System.out.println("Choose BOTH numbers first!");
						
						}
			}
			if(stemp1 !=null && stemp2 != null) {
				double d1 = 0.0, d2 = 0.0;
				
				d1 = Double.parseDouble(stemp1);
				d2 = Double.parseDouble(stemp2);
				
				switch(operation) {
				case '+' :
					answer = d1 + d2;
					break;
				case'-' :
					answer = d1 - d2;
					break;
				case'*':
					answer = d1 * d2;
					break;
				case '/' :
					answer = d1 / d2;
					break;
				}
				
				 sanswer = Double.toString(answer);
				 answerfield.setText(sanswer);
				 if(operation == '/' && d2 ==0.0) {
					 answerfield.setText("Divide by 0 error");
				 }
				
				
			}
		}
		
		if(src.equals(clear)) {
			stemp1 = null;
			stemp2= null;
			equalsClicked = false;
			opChosen = false;
			operation = ' ';
			answerfield.setText(null);
			sanswer = null;
			}

			
		}
		
	     }
	public void enable() {
		off.setEnabled(true);
		on.setEnabled(false);
		answerfield.setEnabled(true);
		zero.setEnabled(true);
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		add.setEnabled(true);
		sub.setEnabled(true);
		multiply.setEnabled(true);
		div.setEnabled(true);
		equals.setEnabled(true);
		back.setEnabled(true);
		clear.setEnabled(true);
		decimal.setEnabled(true);
	}
		
		public void disable() {
			answerfield.setText(" ");
			off.setEnabled(false);
			on.setEnabled(true);
			zero.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			add.setEnabled(false);
			sub.setEnabled(false);
			multiply.setEnabled(false);
			div.setEnabled(false);
			equals.setEnabled(false);
			back.setEnabled(false);
			clear.setEnabled(false);
			decimal.setEnabled(false);
			
			
		}

}


	


