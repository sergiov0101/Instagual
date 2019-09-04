package database;

import java.util.Vector;

public class BD_Principal implements IUsuario, IInvitado, IAdministrador, IUsuario_Sin_Registrar {
	public Vector<Configuraciones> _c_conf = new Vector<Configuraciones>();
	public Usuarios _c_usr;
	public Publicaciones _c_public;
	public Multimedias _c_mult;
	public Etiiquetas _c_etiq;
	public Comentarios _c_coment;

	public void Eliminar_publicacion_propia(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public void Dar_quitar_me_gusta(int aIdPublicacion, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void dar_quitar_me_gusta_comentario(int aIdComentario, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void EliminarCuenta(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Modificar_perfil(int aIdUsuario, String aNombre, String aApellidos, String aFoto_perfil) {
		throw new UnsupportedOperationException();
	}

	public void AjustesNotificarMeGusta(Object aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void AjustesNotificarComentario(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void AjustesNotificarSeguimiento(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void AjustesNotificarSolicitud(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void AjustesCuentaPrivada(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void AjustesMostrarSeguidores(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void SubirPublicacion(int aIdUsuario, String aDescripcion, String aUrl, float aSize, float aDuracion) {
		throw new UnsupportedOperationException();
	}

	public void BloquearDesbloquearUsuario(int aIdUsuarioOrigen, int aIdUsuarioDestino) {
		throw new UnsupportedOperationException();
	}

	public void seguir_dejarDeSeguir(int aIdUsuarioOrigen, int aIdUsuarioDestino) {
		throw new UnsupportedOperationException();
	}

	public void ActivarDesactivarNotificaciones(int aIdUsuarioOrigen, int aIdUsuarioDestino) {
		throw new UnsupportedOperationException();
	}

	public void BuscarEtiqueta(String aEtiqueta) {
		throw new UnsupportedOperationException();
	}

	public void BuscarUsuario(String aNombreUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_publicacion_admin(int aIdPublicacion) {
		throw new UnsupportedOperationException();
	}

	public void RecuperarContrasena(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean Registro(String aUsuario, String aNombre, String aApellidos, String aPassword, String aEmail, boolean aEdad) {
		throw new UnsupportedOperationException();
	}

	public void AjustesNotificarMeGusta(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void AjustesCuentaPrivada(boolean aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void SubirPublicacion(String aDescripcion, String aUrl, float aSize, float aDuracion, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}
}