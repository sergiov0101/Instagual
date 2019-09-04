package user_interface;

import java.util.Vector;

import com.instagual.instagual.Ver_listado_de_comentarios_inv_ventana;

import user_interface.Comentario_inv_;

public class Ver_listado_de_comentarios_inv_ extends Ver_listado_de_comentarios_inv_ventana {
	public Acciones_de_publicacion_inv_ _acciones_de_publicacion_inv_;
	public Vector<Comentario_inv_> _list_Comentario_inv_ = new Vector<Comentario_inv_>();
	public Ver_listado_de_comentarios_inv_() {	
		//this.addComentButton.setVisible(false);
		this.addComentLy.setVisible(false);
		loadComents();
		
	}
	public void loadComents(){
		datosPrueba();
		this.comentarios.addComponent(new Comentario_inv_());
		for(Comentario_inv_ comentario : _list_Comentario_inv_)
			this.comentarios.addComponent(comentario);
		
	}
	
	public void datosPrueba() {
		for(int i = 0; i<5 ; i++) {
			_list_Comentario_inv_.add(new Comentario_inv_("@prueba","Texto de prueba"));
		}
	}
}