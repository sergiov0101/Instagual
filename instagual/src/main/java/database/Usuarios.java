package database;

import java.util.Vector;
import orm_instagual.Usuario;

public class Usuarios {
	public BD_Principal _c_bd_usr;
	public Vector<Usuario> _cont_usr = new Vector<Usuario>();

	public void Buscar(String aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void eliminarUsuario(int aIdUusario) {
		throw new UnsupportedOperationException();
	}

	public void modificarNombre(int aIdUsuario, String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void modificarApellidos(int aIdUsuario, String aApellidos) {
		throw new UnsupportedOperationException();
	}

	public void modificarFotoPerfil(int aIdUsuario, String aFotoPerfil) {
		throw new UnsupportedOperationException();
	}

	public void RecuperarContrasena(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean Registro(String aUsuario, String aNombre, String aApellidos, String aPassword, String aEmail, boolean aEdad) {
		throw new UnsupportedOperationException();
	}

	public void BloquearDesbloquearUsuario(int aIdUsuarioOrigen, int aIdUsuarioDestino) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguir(int aIdUsarioOrigen, int aIdUsuarioDestino) {
		throw new UnsupportedOperationException();
	}

	public void ActivarDesactivarNotificaciones(int aIdUsuarioOrigen, int aIdUsuarioDestino) {
		throw new UnsupportedOperationException();
	}
}