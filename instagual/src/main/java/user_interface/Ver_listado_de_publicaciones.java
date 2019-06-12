package user_interface;

import java.util.Vector;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import user_interface.Publicacion;
import user_interface.Publicacion_etiquetada;

public class Ver_listado_de_publicaciones extends Listado_de_publicaciones_populares_inv_ {
	public Usuario _usuario;
	public Vector<Publicacion> _list_Publicacion = new Vector<Publicacion>();
	public Vector<Publicacion_etiquetada> _list_Publicacion_etiquetada = new Vector<Publicacion_etiquetada>();
	public Ver_usuario_propio userProfile = new Ver_usuario_propio();
	public Ver_listado_de_publicaciones() {
		inicializar();
		btnProfile.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				userProfile();
			}
		});
		
		this.btnSearch.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				userSearch();
			}
		});
		this.btnSocial.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				userSocial();
			}
		});
		
		this.btnUpload.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				userUpload();
			}
		});
	}
	
	
	public void inicializar() {
		listaPublicaciones.removeAllComponents();
		datosPrueba();
		for(Publicacion p:_list_Publicacion) {
			listaPublicaciones.addComponent(p);
		}
	
	}
	public void userProfile() {
		//listaPublicaciones.setVisible(false);
		contentLayout.removeAllComponents();
		contentLayout.addComponent(userProfile);
	}
	
	public void datosPrueba() {
		for(int i = 0 ;i<5;i++) {
			_list_Publicacion.add(new Publicacion());
		}
	}
	
	public void userSearch() {
		contentLayout.removeAllComponents();
		contentLayout.addComponent(new Buscar() );	
	}
	
	public void userSocial() {
		contentLayout.removeAllComponents();
		contentLayout.addComponent(new Ver_notificaciones());
	}
	
	public void userUpload() {
		contentLayout.removeAllComponents();
		contentLayout.addComponent(new Subir_publicacion());
	}
}