package pokemon;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Quagsire implements ActionListener{
	 
	//criando os elementos que serão usados na nossa janela
	JFrame janela = new JFrame("pokemon");//uma janela com o título "pokemon"
	JButton botaoSquirtle = new JButton("squirtle"); //um botão squirtle
	JButton botaoBulbassauro = new JButton("bulbassauro"); //um botão bulbassauro
	JButton botaoCharmander = new JButton("charmander"); //um botão charmander
	JLabel textoAExibir = new JLabel("Pressione um botão."); // exibe o texto "pressione um botão"
	JLabel imagemAExibir = new JLabel(new ImageIcon("src\\arquivos\\pokebola.png"));//exibe a imagem pokebola, que está na pasta arquivos

	public Quagsire(){
		//configurando a nossa janela
		//estaremos usando o FlowLayout, para não termos que posicionar cada item
		//cada item será automaticamente posicionado ao lado/abaixo do item anterior
		janela.setLayout(new FlowLayout()); 	
		janela.setSize(420, 600); //configura o tamanho

		// Adiciona os botões, o texto e a imagem na janela. 
		janela.add(botaoSquirtle);
		janela.add(botaoBulbassauro);
		janela.add(botaoCharmander);

		janela.add(textoAExibir); 

		janela.add(imagemAExibir);
		
		// Adiciona eventos (recebe um sinal caso o botão seja clicado)
		botaoSquirtle.addActionListener(this);
		botaoBulbassauro.addActionListener(this);
		botaoCharmander.addActionListener(this);
		
		// Mostra a janela que construímos
		janela.setVisible(true); 
	}

 	//gerência de eventos (lógica: se isto acontecer, faça tal ação)
	public void actionPerformed(ActionEvent evento) {
		
		//se o botão clicado for o que tem texto "squirtle"
		if(evento.getActionCommand().equals("squirtle"))  {
			
			//muda o texto de "pressione um botão" para "squirtle"
			textoAExibir.setText("squirtle "); 
			
			//muda a imagem para o gif do squirtle que se encontra na pasta arquivos
			imagemAExibir.setIcon(new ImageIcon("src\\arquivos\\squirtle.gif"));
		}			
		//mesma lógica porém caso clique bulbassauro ou charmander
		if(evento.getActionCommand().equals("bulbassauro"))  {
			textoAExibir.setText("bulbassauro"); 
			imagemAExibir.setIcon(new ImageIcon("src\\arquivos\\bulbassauro.gif"));
		}
		if(evento.getActionCommand().equals("charmander"))  {
			textoAExibir.setText("charmander"); 
			imagemAExibir.setIcon(new ImageIcon("src\\arquivos\\charmander.gif"));
		}
	} 
	
	public static void main(String args[]) { 
		//Executa o nosso código
		new Quagsire(); 
	} 
}