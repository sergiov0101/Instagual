package DCL_UI;

public interface IUsuario {

	public void Eliminar_publicacion_propia(int aIdPublicacion);

	public void Dar_quitar_me_gusta(int aIdPublicacion, int aIdUsuario);

	public void dar_quitar_me_gusta_comentario(int aIdComentario, int aIdUsuario);

	public void EliminarCuenta(int aIdUsuario);

	public void Modificar_perfil(int aIdUsuario, String aNombre, String aApellidos, String aFoto_perfil);

	public void AjustesNotificarMeGusta(int aIdUsuario, boolean aValue);

	public void AjustesNotificarComentario(int aIdUsuario, boolean aValue);

	public void AjustesNotificarSeguimiento(int aIdUsuario, boolean aValue);

	public void AjustesNotificarSolicitud(int aIdUsuario, boolean aValue);

	public void AjustesCuentaPrivada(boolean aIdUsuario, boolean aValue);

	public void AjustesMostrarSeguidores(int aIdUsuario, boolean aValue);

	public void SubirPublicacion(String aDescripcion, String aUrl, float aSize, float aDuracion, int aIdUsuario);

	public void BloquearDesbloquearUsuario(int aIdUsuarioOrigen, int aIdUsuarioDestino);

	public void seguir_dejarDeSeguir(int aIdUsuarioOrigen, int aIdUsuarioDestino);

	public void ActivarDesactivarNotificaciones(int aIdUsuarioOrigen, int aIdUsuarioDestino);
}