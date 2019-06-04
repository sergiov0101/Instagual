package user_interface;

import java.util.Vector;
import user_interface.Publicacion_inv_;
import com.instagual.instagual.*;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
public class Listado_de_publicaciones_populares_inv_ extends Listado_de_publicaciones_populares_inv_ventana {
	public Invitado _invitado;
	public Listado_de_publicaciones_populares_inv_() {
		listaPublicaciones.addComponent(new Publicacion());
		listaPublicaciones.addComponent(new Publicacion());
		listaPublicaciones.addComponent(new Publicacion());
		btnHome.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				goHome();
			}
		});
		/*btnProfile.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				userProfile();
			}
		});*/
	}
	public void goHome() {
		contentLayout.removeAllComponents();
		contentLayout.addComponent(listaPublicaciones);
	}
}