import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public abstract class DecoradorOpcional extends JPanel implements Runnable,Prototype,Componente {
	
	Componente miComponente;

	
	
	public DecoradorOpcional(Componente componente) {
		miComponente=componente;
	}

}
