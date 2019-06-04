package user_interface;

import com.vaadin.ui.TabSheet;

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
		publicaciones.setVisible(false);
		TabSheet tabsheet = new TabSheet();
		tabsheet.addStyleNames("centered-tabs compact-tabbar tabsheetPerfil");
		publicaciones.setCaption("Publicaciones");
		tabsheet.addTab(new Ver_listado_de_publicaciones_propias()).setCaption("publicaciones");
		//publ.removeAllComponents();
		tabsheet.addTab(publ).setCaption("publicaciones2");
		contentLayout.addComponent(tabsheet);
		tabsheet.setVisible(true);
	}
	
	public void GenerarPublicacionesPropias(){
		
	}
}