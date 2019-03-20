package user_interface;

import java.util.Vector;
import user_interface.Comentario;
import user_interface.Anadir_comentario;

public class Ver_listado_de_comentarios extends Ver_listado_de_comentarios_inv_ {
	public Acciones_publicacion _acciones_publicacion;
	public Vector<Comentario> _list_Comentario = new Vector<Comentario>();
	public Vector<Anadir_comentario> _list_Añadir_comentario = new Vector<Anadir_comentario>();
}