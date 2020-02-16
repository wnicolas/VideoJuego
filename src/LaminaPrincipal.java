import java.awt.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class LaminaPrincipal extends JPanel{
	
	JButton arriba,abajo,izquierda,derecha;
	
	public LaminaPrincipal() {
	
		setLayout(new BorderLayout());
		
		LaminaDibujar miLaminaDibujar=new LaminaDibujar();
		add(miLaminaDibujar, BorderLayout.CENTER);
		
	
//--------------------Poniendo los Botones-----------------------
	
	JPanel laminaBotones=new JPanel();
	add(laminaBotones,BorderLayout.SOUTH);
	
	arriba=new JButton("Arriba");
	abajo=new JButton("Abajo");
	izquierda=new JButton("Izquierda");
	derecha=new JButton("Derecha");
	laminaBotones.add(arriba);
	laminaBotones.add(abajo);
	laminaBotones.add(izquierda);
	laminaBotones.add(derecha);
	
	arriba.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Arriba");
			
		}
	});
	
	abajo.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Abajo");
			
		}
	});
	izquierda.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Izquierda");
			
		}
	});
	derecha.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Derecha");
			
		}
	});
	//---------------------------------------------------------------------------
	
	}
	
	
	
}
