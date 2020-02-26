import java.applet.AudioClip;;
public class SonidoEmpujar implements Strategy {

	@Override
	public void agregarSonido() {
		System.out.println("Añandiendo sonido empujar");
		
		AudioClip sonido;
		sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/sonido_empujar.wav"));
		sonido.play();
	}

}
