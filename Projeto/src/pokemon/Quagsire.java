package pokemon;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Quagsire implements ActionListener{
	 
	JFrame janela = new JFrame("pokemon");
	JButton botaoWooper = new JButton("wooper"); 
	JButton botaoBulbassauro = new JButton("bulbassauro"); 
	JButton botaoQuagsire = new JButton("quagsire"); 
	JLabel textoAExibir = new JLabel("Pressione um botão."); 
	JLabel imagemAExibir = new JLabel(new ImageIcon());

	public Quagsire(){
		//configura a nossa janela
		janela.setLayout(new FlowLayout()); 	//estaremos usando o FlowLayout
		janela.setSize(420, 600); //configura o tamanho
		janela.setVisible(true); //coloca ela como visível

		// Adiciona os botões, o texto e a imagem na janela. 
		janela.add(botaoWooper);
		janela.add(botaoBulbassauro);
		janela.add(botaoQuagsire);

		janela.add(textoAExibir); 

		janela.add(imagemAExibir);
		
		// Adiciona eventos. 
		botaoWooper.addActionListener(this);
		botaoBulbassauro.addActionListener(this);
		botaoQuagsire.addActionListener(this);
		
		// Mostra o frame construído.
		janela.setVisible(true); 
	}

 	//Método para gerência de eventos
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().contains("wooper"))  {
			textoAExibir.setText("wooper "); 
			imagemAExibir.setIcon(new ImageIcon("src\\files\\wooper.jpg"));
		}			
		if(evento.getActionCommand().equals("bulbassauro"))  {
			textoAExibir.setText("bulbassauro"); 
			imagemAExibir.setIcon(new ImageIcon("src\\files\\bulbassauro.jpg"));
		}
		if(evento.getActionCommand().equals("quagsire"))  {
			textoAExibir.setText("quagsire"); 
			imagemAExibir.setIcon(new ImageIcon("src\\files\\quagsire.jpg"));
		}
	} 
	
	public static void main(String args[]) { 
		new Quagsire(); 
	} 
}