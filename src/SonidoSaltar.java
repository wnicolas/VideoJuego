import java.applet.AudioClip;

public class SonidoSaltar implements Strategy {

	@Override
	public void agregarSonido() {
		System.out.println("Añadiendo sonido saltar");
		AudioClip sonido;
		sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/sonido_saltar.wav"));
		sonido.play();
	}

}
