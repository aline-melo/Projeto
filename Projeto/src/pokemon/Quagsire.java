package pokemon;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Quagsire implements ActionListener{
	
	JLabel jlab; 
	JPanel panel;
	JLabel picLabel;
	
	public Quagsire(){
		// Cria um novo container JFrame.  
		JFrame jfrm = new JFrame("pokemon");
		
		jfrm.setLayout(new FlowLayout()); 	
		jfrm.setSize(420, 600); 
		jfrm.setVisible(true); 
		
		
		// Faz buttons. 
		JButton wooper = new JButton("wooper"); 
		JButton bulbassauro = new JButton("bulbassauro"); 
		JButton quagsire = new JButton("quagsire"); 

		
		// Cria um rótulo contendo apenas um texto.  
		jlab = new JLabel("Pressione um botão."); 
		
		panel=new JPanel();  
		picLabel = new JLabel(new ImageIcon());
		panel.add(picLabel);

		
		// Adiciona eventos. 
		wooper.addActionListener(this);
		bulbassauro.addActionListener(this);
		quagsire.addActionListener(this);
		
		// Adiciona os botões no painel de conteúdo. 
		jfrm.add(panel);
		jfrm.add(jlab); 

		jfrm.add(wooper);
		jfrm.add(bulbassauro);
		jfrm.add(quagsire);
		
		// Mostra o frame construído.
		jfrm.setVisible(true); 
	}
	

 	//Método para gerência de eventos
	public void actionPerformed(ActionEvent ae) {

		if(ae.getActionCommand().equals("wooper"))  {
			jlab.setText("wooper "); 
			picLabel.setIcon(new ImageIcon("src\\files\\wooper.jpg"));
		}			
	
		if(ae.getActionCommand().equals("bulbassauro"))  {
			jlab.setText("bulbassauro"); 
			picLabel.setIcon(new ImageIcon("src\\files\\bulbassauro.jpg"));
		}
		if(ae.getActionCommand().equals("quagsire"))  {
			jlab.setText("quagsire"); 
			picLabel.setIcon(new ImageIcon("src\\files\\quagsire.jpg"));
		}
	} 
	
	public static void main(String args[]) { 
		new Quagsire(); 
	} 
}
