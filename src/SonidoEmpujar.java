import java.applet.AudioClip;;
public class SonidoEmpujar implements Strategy {

	@Override
	public void agregarSonido() {
		System.out.println("A�andiendo sonido empujar");
		
		AudioClip sonido;
		sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/sonido_empujar.wav"));
		sonido.play();
	}

}
