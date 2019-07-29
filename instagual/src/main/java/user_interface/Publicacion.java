	package user_interface;


import org.orm.PersistentException;

import com.instagual.instagual.publicacion_ventana;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.jsclipboard.JSClipboard;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
public class Publicacion extends publicacion_ventana {
	public Ver_listado_de_publicaciones _ver_listado_de_publicaciones;
	public Ver_publicacion _ver_publicacion;
	public Acciones_publicacion _acciones_publicacion;
	String shareUrl;
	public Publicacion() {
			shareUrl = "http://exampledddddddddddddddddd";

	
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
	
	public void btnComents() throws PersistentException {
		VerticalLayout subContent = new VerticalLayout();
		subContent.setMargin(true);
		subContent.addComponent(new Ver_listado_de_comentarios_inv_());
		Window window = new Window();
    	window.setContent(subContent);
        //window.setWidth("-1");
        window.setResizable(false);
        window.setDraggable(false);
        window.center();
        window.setModal(true);

        // Add it to the root component
        UI.getCurrent().addWindow(window);
       // database.Configuraciones.NotificarMeGusta(1,true);
	}
	
	public void btnLike() {
		
		if(me_gusta.getIcon().equals(VaadinIcons.HEART)) {
			me_gusta.setIcon(VaadinIcons.HEART_O);
		}else {
			me_gusta.setIcon(VaadinIcons.HEART);
		}

	}
	
}