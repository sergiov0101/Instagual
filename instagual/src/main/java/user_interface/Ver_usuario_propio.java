package user_interface;

import com.vaadin.ui.Button;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Button.ClickEvent;

public class Ver_usuario_propio extends Ver_usuario_inv_ {
	/*private link _contadorSeguidos;
	private link _contadorSeguidores;
	private button _ajustes;*/
	public Usuario_propio _usuario_propio;
	public Ver_listado_de_publicaciones_propias _ver_listado_de_publicaciones_propias;
	public Ver_listado_usuarios_seguidos _ver_listado_usuarios_seguidos;
	public Ver_listado_seguidores _ver_listado_seguidores;
	public publicaciones_etiquetadas_propio_ _publicaciones_etiquetadas_propio_;
	public actividades_usuario _actividades_usuario;
	Ver_listado_de_publicaciones_propias publ = new Ver_listado_de_publicaciones_propias();
	public Ver_usuario_propio() {
		this.optionButton.setVisible(true);
		optionButton.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				userOptions();
			}
		});
		//Tabsheet con distintos tipos de publicaciones
		publicaciones.setVisible(false);
		TabSheet tabsheet = new TabSheet();
		tabsheet.addStyleNames("centered-tabs compact-tabbar tabsheetPerfil");
		publicaciones.setCaption("Publicaciones");
		tabsheet.addTab(new Ver_listado_de_publicaciones_propias()).setCaption("publicaciones");
		//publ.removeAllComponents();
		tabsheet.addTab(publ).setCaption("Etiquetas");
		tabsheet.addTab(new actividades_usuario()).setCaption("Actividad");
		contentLayout.addComponent(tabsheet);
		tabsheet.setVisible(true);
	}
	
	public void GenerarPublicacionesPropias(){
		
	}
	
	public void userOptions() {
		this.mainLayout.removeAllComponents();
		this.mainLayout.addComponent(new Ajustes());
	}
	public void userFollowers(){
		this.mainLayout.removeAllComponents();
		this.mainLayout.addComponent(new Ver_listado_seguidores());
	}
}