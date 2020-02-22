import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class DecoradorEmpujar extends DecoradorOpcional {

	private Image image;
	private Thread hilo;
	private BufferedImage bi;
	private int incremento;
	
	public DecoradorEmpujar(Componente componente) {
		super(componente);
		animar();
	}

	@Override
	public void animar() {
		arrancarHilo();
		bi=new BufferedImage(100,150,BufferedImage.TYPE_INT_RGB);
		Toolkit herramienta=Toolkit.getDefaultToolkit();
		image=herramienta.getImage(getClass().getResource("/imagenes/personaje.jpg"));
		//miComponente.animar();
		
	}

	@Override
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
			System.out.println("animacion");
			if(incremento>6) {
				incremento=0;
				}
			}
		
	}

	@Override
	public Prototype clonar() {
		
		return miComponente.clonar();
	}
	
public void paint(Graphics g) {
		
		int mx=(incremento%6)*52;
		int aux=incremento*2;
		int my=(incremento/5)*99;
		
		Graphics2D g2d;
		g.drawImage(bi,0,0,this);
		g2d=bi.createGraphics();
		g2d.fillRect(0, 0, 100,150);
		
		g2d.drawImage(image, 20,0, 100, 150, (320+mx)-aux, 0,(363+mx)-aux,99, this);
		repaint();
		
	}
	
	
}
