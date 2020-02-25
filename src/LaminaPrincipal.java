import java.awt.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class LaminaPrincipal extends JPanel{
	
	JButton empujar;
	
	public LaminaPrincipal() {
	
		setLayout(new BorderLayout());
		
		LaminaDibujar miLaminaDibujar=new LaminaDibujar();
		add(miLaminaDibujar, BorderLayout.CENTER);
		
	
//--------------------Poniendo los Botones-----------------------
	
	JPanel laminaBotones=new JPanel();
	add(laminaBotones,BorderLayout.SOUTH);
	
	empujar=new JButton("Empujar");
	laminaBotones.add(empujar);
	
	empujar.addActionListener(miLaminaDibujar);
	
	
	//---------------------------------------------------------------------------
	
	}
	
	
	
}
