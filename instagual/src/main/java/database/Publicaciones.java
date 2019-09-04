package database;

import java.util.Vector;
import orm_instagual.Publicacion;

public class Publicaciones {
	public BD_Principal _c_bd_public;
	public Vector<Publicacion> _cont_public = new Vector<Publicacion>();

	public void EliminarPublicacion(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public void MeGusta(int aIdPublicacion, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void anadirPublicacion(String aDescripcion) {
		throw new UnsupportedOperationException();
	}
}