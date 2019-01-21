package Ventanas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import PJ.Personaje;

public class Prueba extends JFrame {

	private JProgressBar pb;
	
	public Prueba() {
		super();
		
		Container cp = this.getContentPane();
		JPanel main = new JPanel(new FlowLayout());
		cp.add(main);
		
		int min, max;
		min = 0;
		max = 20;
		
		Personaje.hp = 20;
		pb = new JProgressBar(min, max);
		pb.setValue(Personaje.hp);
		main.add(pb);
		
		JButton bajar = new JButton("Bajar");
		JButton subir = new JButton("Subir");
		main.add(bajar);
		main.add(subir);
		
		bajar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Personaje.hp > 0) {
					Personaje.hp--;
					actualizar();
				}
			}
		});
		
		subir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Personaje.hp < 20) {
					Personaje.hp++;
					actualizar();
				}
			}
		});
		
		
		setVisible(true);
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actualizar() {
		pb.setValue(Personaje.hp);
	}
	
	public static void main(String[] args) {
		new Prueba();
	}

}
