import javax.swing.*;

public class Vista extends JFrame{

	public Vista() {
		setBounds(400,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Prueba Video Juego");
		
		LaminaPrincipal miLamina=new LaminaPrincipal();
		add(miLamina);
	}
}
