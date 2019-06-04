package user_interface;

import java.util.Vector;
import user_interface.Publicacion_propia;
import com.instagual.instagual.*;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.VerticalLayout;

public class Ver_listado_de_publicaciones_propias extends Ver_listado_de_publicaciones_propias_ventana {
	public Ver_usuario_propio _ver_usuario_propio;
	public Vector<Publicacion_propia> _list_Publicacion_propia = new Vector<Publicacion_propia>();
	public Vector<String> imagenesSrc = new Vector<String>();
	public Ver_listado_de_publicaciones_propias() {
		inicializar();
		
		
	}
	public void inicializar() {
		publicacionesPerfil.removeAllComponents();
		datosPrueba();
		int count =0;
		HorizontalLayout fila = new HorizontalLayout(); 
		fila.setWidth(100, Unit.PERCENTAGE);
		
		for(String src : imagenesSrc) {
			
			
				ThemeResource resource = new ThemeResource(src);
				Image image = new Image("",resource);
				image.setWidth(100, Unit.PERCENTAGE);
				image.setHeight(100, Unit.PERCENTAGE);
				fila.addComponent(image);
				if(count ==2) {
					publicacionesPerfil.addComponent(fila);
					fila = new HorizontalLayout();
					fila.setWidth(100, Unit.PERCENTAGE);
					count =0;
				}
				
				count ++;

		}
		publicacionesPerfil.addComponent(fila);
		
	}
	
	public void datosPrueba() {
		for(int i= 0;i<5;i++) {
			imagenesSrc.add("images/637668.jpg");
		}
	}
}