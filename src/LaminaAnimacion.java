import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;



public class LaminaAnimacion extends JPanel implements Runnable, Prototype{

	private Image image;
	private Thread hilo;
	private BufferedImage bi;
	private int incremento;
	
	public LaminaAnimacion() {
		
		animar();
		
	}
	
	public void animar() {
		arrancarHilo();
		bi=new BufferedImage(100,150,BufferedImage.TYPE_INT_RGB);
		Toolkit herramienta=Toolkit.getDefaultToolkit();
		image=herramienta.getImage(getClass().getResource("/imagenes/personaje.jpg"));
		
		
	}
	
	public void paint(Graphics g) {
		
		int mx=(incremento%6)*52;
		int my=(incremento/6)*99;
		
		Graphics2D g2d;
		g.drawImage(bi,0,0,this);
		g2d=bi.createGraphics();
		g2d.fillRect(0, 0, 100,150);
		
		g2d.drawImage(image, 0,0, 100, 150, (7+mx), my, (mx+59), (my+99), this);
		repaint();
		
	}
	
	
	public void arrancarHilo() {
		hilo=new Thread(this);
		hilo.start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(110);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			incremento++;
			if(incremento>6) {
				incremento=0;
			}
		
		
	}
}

	@Override
	public Prototype clonar() {
		LaminaAnimacion clon=null;
		
		try {
			clon=(LaminaAnimacion)clone();
			clon.hilo=new Thread(this.hilo);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clon;
	}

}
