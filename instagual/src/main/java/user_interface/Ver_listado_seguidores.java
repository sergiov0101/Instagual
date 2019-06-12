package user_interface;

import java.util.Vector;

import com.instagual.instagual.ver_listado_seguidores_ventana;

import user_interface.Usuario_seguidor;
import user_interface.Usuario_seguidor_privado;

public class Ver_listado_seguidores extends ver_listado_seguidores_ventana {
	public Ver_usuario_propio _ver_usuario_propio;
	public Vector<Usuario_seguidor> _list_Usuario_seguidor = new Vector<Usuario_seguidor>();
	public Vector<Usuario_seguidor_privado> _list_Usuario_seguidor_privado = new Vector<Usuario_seguidor_privado>();
	public Ver_listado_seguidores() {
		
	}
}