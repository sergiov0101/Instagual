	package user_interface;


import org.orm.*;

import com.instagual.instagual.publicacion_ventana;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.jsclipboard.JSClipboard;
import com.vaadin.shared.Connector;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

import database.Configuraciones;

import com.vaadin.ui.Button.ClickEvent;
public class Publicacion extends publicacion_ventana {
	public Ver_listado_de_publicaciones _ver_listado_de_publicaciones;
	public Ver_publicacion _ver_publicacion;
	public Acciones_publicacion _acciones_publicacion;
	String shareUrl;
	boolean meGusta = false;
	String usuario = "prueba";//cargar de la base de datos
	public Publicacion() {
			int idAutor = 0;//cargar de la base de datos
			int imgId = 001;
			shareUrl = "http://exampledddddddddddddddddd/"+imgId;
			linkUsuario.setCaption(usuario);
			linkUsuario.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					
					goToUser(idAutor);
				}
			});
	        compartir.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					
					btnShared();
				}
			});
	        
	        comentar.addClickListener(new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {

								try {
									btnComents();
								} catch (PersistentException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						
		
					}
			});
	       
		        me_gusta.addClickListener(new Button.ClickListener() {
						public void buttonClick(ClickEvent event) {
							
							btnLike();
						}
				});
	}
	//Funcion del boton de compartir
	public void btnShared() {
		HorizontalLayout subContent = new HorizontalLayout();
		subContent.setMargin(true);
		final JSClipboard clipboard = new JSClipboard();
		//Label con la direccion de la publicacion
		final Label labelTextShare= new Label(shareUrl);
		labelTextShare.setSizeFull();      
		labelTextShare.setId("tocopie-label");
		//Boton de copiar al portapapeles
		Button clipboardbtn = new Button();
		clipboardbtn.setIcon(VaadinIcons.CLIPBOARD);
		clipboard.apply(clipboardbtn,labelTextShare);
		clipboard.addSuccessListener(new JSClipboard.SuccessListener() {

			@Override
			public void onSuccess() {
				Notification.show("Copy to clipboard successful");
			}
		});
		clipboard.addErrorListener(new JSClipboard.ErrorListener() {

			@Override
			public void onError() {
				Notification.show("Copy to clipboard unsuccessful", Notification.Type.ERROR_MESSAGE);
			}
		});  

		subContent.addComponent(labelTextShare);
		subContent.addComponent(clipboardbtn);
		subContent.addComponent(new Label("| "));
		//Creamos una nueva ventana con el contenido generado
    	Window window = new Window();
    	window.setContent(subContent);
        //window.setWidth("-1");
        window.setResizable(false);
        window.setDraggable(false);
        window.center();
        window.setModal(true);

        // Add it to the root component
        UI.getCurrent().addWindow(window);
	}
	
	public void btnComents() throws PersistentException{
		VerticalLayout subContent = new VerticalLayout();
		subContent.setMargin(true);
		subContent.addComponent(new Ver_listado_de_comentarios());
		Window window = new Window();
    	window.setContent(subContent);
        //window.setWidth("-1");
        window.setResizable(false);
        window.setDraggable(false);
        window.center();
        window.setModal(true);
        Configuraciones.NotificarMeGusta(1, true); 
        // Add it to the root component
        UI.getCurrent().addWindow(window);
        
        
	}
	
	public void btnLike() {
		
		if(meGusta) {
			me_gusta.setIcon(VaadinIcons.HEART_O);
			meGusta = false;// Establecer en la base de datos
		}else {
			me_gusta.setIcon(VaadinIcons.HEART);
			meGusta = true;// Establecer en la base de datos
		}

	}
	
	public void goToUser(int idAutor) {
		//usuarioPublicacion.removeAllComponents();
		//this.getParent().setVisible(false);
	
	}
}