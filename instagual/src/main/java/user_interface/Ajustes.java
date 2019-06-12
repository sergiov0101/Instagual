package user_interface;

import com.instagual.instagual.Ajustes_ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Ajustes extends Ajustes_ventana {
	public Ver_usuario_propio _ver_usuario_propio;
	public Modificar_perfil _modificar_perfil;
	public Eliminar_cuenta _eliminar_cuenta;
	public Notificaciones _notificaciones;
	public Listado_de_bloqueados _listado_de_bloqueados;
	public Privacidad _privacidad;
	public Ajustes() {
		this.usuarios_bloqueados.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				
				ListadoBloqueados();
			}
		});
	}
	
	public void ListadoBloqueados() {
		this.ajustesMain.removeAllComponents();
		this.ajustesMain.addComponent(new Listado_de_bloqueados());
	}
	
}