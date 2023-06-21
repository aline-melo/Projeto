package pokemon;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Quagsire implements ActionListener{
	 
	//criando os elementos que serão usados na nossa janela
	JFrame janela = new JFrame("pokemon");
	JButton botaosquirtle = new JButton("squirtle"); 
	JButton botaoBulbassauro = new JButton("bulbassauro"); 
	JButton botaocharmander = new JButton("charmander"); 
	JLabel textoAExibir = new JLabel("Pressione um botão."); 
	JLabel imagemAExibir = new JLabel(new ImageIcon("src\\files\\pokebola.png"));

	public Quagsire(){
		//configura a nossa janela
		janela.setLayout(new FlowLayout()); 	//estaremos usando o FlowLayout
		janela.setSize(420, 600); //configura o tamanho

		// Adiciona os botões, o texto e a imagem na janela. 
		janela.add(botaosquirtle);
		janela.add(botaoBulbassauro);
		janela.add(botaocharmander);

		janela.add(textoAExibir); 

		janela.add(imagemAExibir);
		
		// Adiciona eventos (recebe um sinal caso o botão seja clicado
		botaosquirtle.addActionListener(this);
		botaoBulbassauro.addActionListener(this);
		botaocharmander.addActionListener(this);
		
		// Mostra a janela que construímos
		janela.setVisible(true); 
	}

 	//Método para gerência de eventos (lógica: se isto acontecer, faça tal ação)
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().contains("squirtle"))  {
			//muda o texto de "pressione um botão" para "squirtle"
			textoAExibir.setText("squirtle "); 
			
			imagemAExibir.setIcon(new ImageIcon("src\\files\\squirtle.gif"));
		}			
		if(evento.getActionCommand().equals("bulbassauro"))  {
			textoAExibir.setText("bulbassauro"); 
			imagemAExibir.setIcon(new ImageIcon("src\\files\\bulbassauro.gif"));
		}
		if(evento.getActionCommand().equals("charmander"))  {
			textoAExibir.setText("charmander"); 
			imagemAExibir.setIcon(new ImageIcon("src\\files\\charmander.gif"));
		}
	} 
	
	public static void main(String args[]) { 
		new Quagsire(); 
	} 
}