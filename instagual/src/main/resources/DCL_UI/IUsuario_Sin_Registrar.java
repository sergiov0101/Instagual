package DCL_UI;

public interface IUsuario_Sin_Registrar {

	public void RecuperarContrasena(int aIdUsuario);

	public boolean Registro(String aUsuario, String aNombre, String aApellidos, String aPassword, String aEmail, boolean aEdad);
}