package user_interface;

import java.util.Vector;
import user_interface.Publicacion_inv_;
import com.instagual.instagual.*;
public class Listado_de_publicaciones_populares_inv_ extends Listado_de_publicaciones_populares_inv_ventana {
public Invitado _invitado;
Publicacion publicacion = new Publicacion();
public Listado_de_publicaciones_populares_inv_() {
	listaPublicaciones.addComponent(publicacion);
	listaPublicaciones.addComponent(publicacion);
	publicacion.setVisible(true);
	
}
}