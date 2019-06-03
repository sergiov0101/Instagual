package user_interface;

import java.util.Vector;
import user_interface.Publicacion;
import user_interface.Publicacion_etiquetada;

public class Ver_listado_de_publicaciones extends Listado_de_publicaciones_populares_inv_ {
	public Usuario _usuario;
	public Vector<Publicacion> _list_Publicacion = new Vector<Publicacion>();
	public Vector<Publicacion_etiquetada> _list_Publicacion_etiquetada = new Vector<Publicacion_etiquetada>();
}