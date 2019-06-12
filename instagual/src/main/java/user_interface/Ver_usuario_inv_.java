package user_interface;
import com.instagual.instagual.*;
public class Ver_usuario_inv_ extends Ver_usuario_inv_ventana {
	public Acciones_de_publicacion_inv_ _acciones_de_publicacion_inv_;
	public Listado_de_publicaciones_usuario_inv_ _listado_de_publicaciones_usuario_inv_;
	Ver_listado_de_publicaciones_propias publicaciones = new Ver_listado_de_publicaciones_propias();
	public Ver_usuario_inv_() {
		contentLayout.addComponent(publicaciones);
		publicaciones.setVisible(true);
		this.optionButton.setVisible(false);
	}
	
}