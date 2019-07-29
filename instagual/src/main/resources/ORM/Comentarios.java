package ORM;

import java.util.Vector;
import ORM.Comentario;

public class Comentarios {
	public BD_Principal _c_bd_coment;
	public Vector<Comentario> _cont_coment = new Vector<Comentario>();

	public void dar_quitar_me_gusta_comentario(int aIdComentario, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}