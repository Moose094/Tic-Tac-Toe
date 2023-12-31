/*

      import java.awt.*;
      import java.awt.event.*;
      import java.util.*;
      import javax.swing.*;

      public class TicTacToe implements ActionListener{

      	Random random = new Random(); // create an instance of the random class because we will randomly choose which player is going first
      	JFrame frame = new JFrame();
      	JPanel title_panel = new JPanel();
      	JPanel button_panel = new JPanel();
      	JLabel textfield = new JLabel();
      	JButton[] buttons = new JButton[25];
      	boolean player1_turn;
       // let's create a constructor for our class
      	
      	TicTacToe(){
      		
      		// The next few lines of codes create a frame for this project
      		
      		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      		frame.setSize(800,800);
      		frame.getContentPane().setBackground(new Color(50,50,50));
      		frame.setLayout(new BorderLayout());
      		frame.setVisible(true);
      		
      		// let's create the textfield of this game
      		
      		textfield.setBackground(new Color(25,25,25));
      		textfield.setForeground(new Color(25,255,0));
      		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
      		textfield.setHorizontalAlignment(JLabel.CENTER);
      		textfield.setText("Tic-Tac-Toe"); // title of the game
      		textfield.setOpaque(true);
      		
      		// let's create the title panel
      		title_panel.setLayout(new BorderLayout());
      		title_panel.setBounds(0,0,800,100);
      		
      		// let's create a button panel
      		button_panel.setLayout(new GridLayout(5,5));
      		button_panel.setBackground(new Color(150,150,150));
      		
      		// let's create the buttons for the game
      		for(int i=0;i<25;i++) {
      			buttons[i] = new JButton();
      			button_panel.add(buttons[i]);
      			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
      			buttons[i].setFocusable(false);
      			buttons[i].addActionListener(this);
      		}
      		
      		title_panel.add(textfield); // adds textfield to the title panel
      		frame.add(title_panel,BorderLayout.NORTH); // adds title panel to the frame
      		frame.add(button_panel);
      		
      		firstTurn();
      	}

      	@Override
      	public void actionPerformed(ActionEvent e) {
      		
      		for(int i=0;i<25;i++) {
      			if(e.getSource()==buttons[i]) {
      				if(player1_turn) {
      					if(buttons[i].getText()=="") {
      						buttons[i].setForeground(new Color(255,0,0));
      						buttons[i].setText("X");
      						player1_turn=false;
      						textfield.setText("O turn");
      						check();
      					}
      				}
      				else {
      					if(buttons[i].getText()=="") {
      						buttons[i].setForeground(new Color(0,0,255));
      						buttons[i].setText("O");
      						player1_turn=true;
      						textfield.setText("X turn");
      						check();
      					}
      				}
      			}			
      		}
      	}
      	
      	public void firstTurn() {
      		
      		
      		
      		if(random.nextInt(2)==0) {
      			player1_turn=true;
      			textfield.setText("X turn");
      		}
      		else {
      			player1_turn=false;
      			textfield.setText("O turn");
      		}
      	}
      	
      	public void check() {
      		//check X win conditions
      		if(
      				(buttons[0].getText()=="X") &&
      				(buttons[1].getText()=="X") &&
      				(buttons[2].getText()=="X") &&
      				(buttons[3].getText()=="X") &&
      				(buttons[4].getText()=="X")
      				) {
      			xWins(0,1,2,3,4);
      		}
      		if(
      				(buttons[0].getText()=="X") &&
      				(buttons[5].getText()=="X") &&
      				(buttons[10].getText()=="X") &&
      				(buttons[15].getText()=="X") &&
      				(buttons[20].getText()=="X") 
      				) {
      			xWins(0,5,10,15,20);
      		}
      		if(
      				(buttons[1].getText()=="X") &&
      				(buttons[6].getText()=="X") &&
      				(buttons[11].getText()=="X") &&
      				(buttons[16].getText()=="X") &&
      				(buttons[21].getText()=="X")
      				) {
      			xWins(1,6,11,16,21);
      		}
      		if(
      				(buttons[2].getText()=="X") &&
      				(buttons[7].getText()=="X") &&
      				(buttons[12].getText()=="X") &&
      				(buttons[17].getText()=="X") &&
      				(buttons[22].getText()=="X")
      				) {
      			xWins(2,7,12,17,22);
      		}
      		if(
      				(buttons[3].getText()=="X") &&
      				(buttons[8].getText()=="X") &&
      				(buttons[13].getText()=="X") &&
      				(buttons[18].getText()=="X") &&
      				(buttons[23].getText()=="X")
      				) {
      			xWins(2,8,13,18,23);
      		}
      		if(
      				(buttons[4].getText()=="X") &&
      				(buttons[9].getText()=="X") &&
      				(buttons[14].getText()=="X") &&
      				(buttons[19].getText()=="X") &&
      				(buttons[24].getText()=="X")
      				) {
      			xWins(4,9,14,19,24);
      		}
      		if(
      				(buttons[5].getText()=="X") &&
      				(buttons[6].getText()=="X") &&
      				(buttons[7].getText()=="X") &&
      				(buttons[8].getText()=="X") &&
      				(buttons[9].getText()=="X")
      				) {
      			xWins(5,6,7,8,9);
      		}
      		if(
      				(buttons[10].getText()=="X") &&
      				(buttons[11].getText()=="X") &&
      				(buttons[12].getText()=="X") &&
      				(buttons[13].getText()=="X") &&
      				(buttons[14].getText()=="X")
      				) {
      			xWins(10,11,12,13,14);
      			if(
          				(buttons[15].getText()=="X") &&
          				(buttons[16].getText()=="X") &&
          				(buttons[17].getText()=="X") &&
          				(buttons[18].getText()=="X") &&
          				(buttons[19].getText()=="X")
          				) {
          			xWins(15,16,17,18,19);
          			
          			if(
              				(buttons[20].getText()=="X") &&
              				(buttons[21].getText()=="X") &&
              				(buttons[22].getText()=="X") &&
              				(buttons[23].getText()=="X") &&
              				(buttons[24].getText()=="X")
              				) {
              			xWins(20,21,22,23,24);
              			
              			if(
                  				(buttons[0].getText()=="X") &&
                  				(buttons[6].getText()=="X") &&
                  				(buttons[12].getText()=="X") &&
                  				(buttons[18].getText()=="X") &&
                  				(buttons[24].getText()=="X")
                  				) {
                  			xWins(0,6,12,18,24);
                  				
                  			if(
                      				(buttons[4].getText()=="X") &&
                      				(buttons[8].getText()=="X") &&
                      				(buttons[12].getText()=="X") &&
                      				(buttons[16].getText()=="X") &&
                      				(buttons[20].getText()=="X")
                      				) {
                      			xWins(4,8,12,16,20);
                      			
      			
      		}
      		//check O win conditions
                  			if(
                      				(buttons[0].getText()=="O") &&
                      				(buttons[1].getText()=="O") &&
                      				(buttons[2].getText()=="O") &&
                      				(buttons[3].getText()=="O") &&
                      				(buttons[4].getText()=="O")
                      				) {
                      			oWins(0,1,2,3,4);
                      		}
                      		if(
                      				(buttons[0].getText()=="O") &&
                      				(buttons[5].getText()=="O") &&
                      				(buttons[10].getText()=="O") &&
                      				(buttons[15].getText()=="O") &&
                      				(buttons[20].getText()=="O") 
                      				) {
                      			oWins(0,5,10,15,20);
                      		}
                      		if(
                      				(buttons[1].getText()=="O") &&
                      				(buttons[6].getText()=="O") &&
                      				(buttons[11].getText()=="O") &&
                      				(buttons[16].getText()=="O") &&
                      				(buttons[221].getText()=="O")
                      				) {
                      			oWins(1,6,11,16,21);
                      		}
                      		if(
                      				(buttons[2].getText()=="O") &&
                      				(buttons[7].getText()=="O") &&
                      				(buttons[12].getText()=="O") &&
                      				(buttons[17].getText()=="O") &&
                      				(buttons[22].getText()=="O")
                      				) {
                      			oWins(2,7,12,17,22);
                      		}
                      		if(
                      				(buttons[3].getText()=="O") &&
                      				(buttons[8].getText()=="O") &&
                      				(buttons[13].getText()=="O") &&
                      				(buttons[18].getText()=="O") &&
                      				(buttons[23].getText()=="O")
                      				) {
                      			oWins(2,8,13,18,23);
                      		}
                      		if(
                      				(buttons[4].getText()=="O") &&
                      				(buttons[9].getText()=="O") &&
                      				(buttons[14].getText()=="O") &&
                      				(buttons[19].getText()=="O") &&
                      				(buttons[24].getText()=="O")
                      				) {
                      			oWins(4,9,14,19,24);
                      		}
                      		if(
                      				(buttons[5].getText()=="O") &&
                      				(buttons[6].getText()=="O") &&
                      				(buttons[7].getText()=="O") &&
                      				(buttons[8].getText()=="O") &&
                      				(buttons[9].getText()=="O")
                      				) {
                      			oWins(5,6,7,8,9);
                      		}
                      		if(
                      				(buttons[10].getText()=="O") &&
                      				(buttons[11].getText()=="O") &&
                      				(buttons[12].getText()=="O") &&
                      				(buttons[13].getText()=="O") &&
                      				(buttons[14].getText()=="O")
                      				) {
                      			oWins(10,11,12,13,14);
                      		}
                      			if(
                          				(buttons[15].getText()=="O") &&
                          				(buttons[16].getText()=="O") &&
                          				(buttons[17].getText()=="O") &&
                          				(buttons[18].getText()=="O") &&
                          				(buttons[19].getText()=="O")
                          				) {
                          			oWins(15,16,17,18,19);
                      			}
                          			if(
                              				(buttons[20].getText()=="O") &&
                              				(buttons[21].getText()=="O") &&
                              				(buttons[22].getText()=="O") &&
                              				(buttons[23].getText()=="O") &&
                              				(buttons[24].getText()=="O")
                              				) {
                              			oWins(20,21,22,23,24);
                          			}
                              			if(
                                  				(buttons[0].getText()=="O") &&
                                  				(buttons[6].getText()=="O") &&
                                  				(buttons[12].getText()=="O") &&
                                  				(buttons[18].getText()=="O") &&
                                  				(buttons[24].getText()=="O")
                                  				) {
                                  			oWins(0,6,12,18,24);
                              			}	
                                  			if(
                                      				(buttons[4].getText()=="O") &&
                                      				(buttons[8].getText()=="O") &&
                                      				(buttons[12].getText()=="O") &&
                                      				(buttons[16].getText()=="O") &&
                                      				(buttons[20].getText()=="O")
                                      				) {
                                  			
                                      			oWins(4,8,12,16,20);
                                  			}
              			}
          			
      			
                                      			
              			
                              			
                          			
                                      			
      	
      	public void xWins(int a,int b,int c, int d, int e) {
      		buttons[a].setBackground(Color.GREEN);
      		buttons[b].setBackground(Color.GREEN);
      		buttons[c].setBackground(Color.GREEN);
      		buttons[d].setBackground(Color.GREEN);
      		buttons[e].setBackground(Color.GREEN);
      		for(int i=0;i<25;i++) {
      			buttons[i].setEnabled(false);
      		}
      		textfield.setText("X wins");
      	}
      	public void oWins(int a,int b,int c, int d, int e) {
      		buttons[a].setBackground(Color.GREEN);
      		buttons[b].setBackground(Color.GREEN);
      		buttons[c].setBackground(Color.GREEN);
      		buttons[d].setBackground(Color.GREEN);
      		buttons[e].setBackground(Color.GREEN);
      		
      		for(int i=0;i<25;i++) {
      			buttons[i].setEnabled(false);
      		}
      		textfield.setText("O wins");
      	}
      }
      
      
      
      
      
      
      
      
      
	

*/