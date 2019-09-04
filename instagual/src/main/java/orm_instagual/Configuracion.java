/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: sergio(University of Almeria)
 * License Type: Academic
 */
package orm_instagual;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Configuracion")
public class Configuracion implements Serializable {
	public Configuracion() {
	}
	
	@Column(name="IdConfiguracion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_INSTAGUAL_CONFIGURACION_IDCONFIGURACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_INSTAGUAL_CONFIGURACION_IDCONFIGURACION_GENERATOR", strategy="native")	
	private int idConfiguracion;
	
	@Column(name="NotificarMeGustab", nullable=false, length=1)	
	private boolean notificarMeGustab;
	
	@Column(name="NotificarComentario", nullable=false, length=1)	
	private boolean notificarComentario;
	
	@Column(name="NotificarSeguimiento", nullable=false, length=1)	
	private boolean notificarSeguimiento;
	
	@Column(name="NotificarSolicitud", nullable=false, length=1)	
	private boolean notificarSolicitud;
	
	@Column(name="CuentaPrivada", nullable=false, length=1)	
	private boolean cuentaPrivada;
	
	@Column(name="MostrarSeguidores", nullable=false, length=1)	
	private boolean mostrarSeguidores;
	
	@OneToOne(mappedBy="configuracion", targetEntity=orm_instagual.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm_instagual.Usuario configurado_por;
	
	private void setIdConfiguracion(int value) {
		this.idConfiguracion = value;
	}
	
	public int getIdConfiguracion() {
		return idConfiguracion;
	}
	
	public int getORMID() {
		return getIdConfiguracion();
	}
	
	public void setNotificarMeGustab(boolean value) {
		this.notificarMeGustab = value;
	}
	
	public boolean getNotificarMeGustab() {
		return notificarMeGustab;
	}
	
	public void setNotificarComentario(boolean value) {
		this.notificarComentario = value;
	}
	
	public boolean getNotificarComentario() {
		return notificarComentario;
	}
	
	public void setNotificarSeguimiento(boolean value) {
		this.notificarSeguimiento = value;
	}
	
	public boolean getNotificarSeguimiento() {
		return notificarSeguimiento;
	}
	
	public void setNotificarSolicitud(boolean value) {
		this.notificarSolicitud = value;
	}
	
	public boolean getNotificarSolicitud() {
		return notificarSolicitud;
	}
	
	public void setCuentaPrivada(boolean value) {
		this.cuentaPrivada = value;
	}
	
	public boolean getCuentaPrivada() {
		return cuentaPrivada;
	}
	
	public void setMostrarSeguidores(boolean value) {
		this.mostrarSeguidores = value;
	}
	
	public boolean getMostrarSeguidores() {
		return mostrarSeguidores;
	}
	
	public void setConfigurado_por(orm_instagual.Usuario value) {
		if (this.configurado_por != value) {
			orm_instagual.Usuario lconfigurado_por = this.configurado_por;
			this.configurado_por = value;
			if (value != null) {
				configurado_por.setConfiguracion(this);
			}
			if (lconfigurado_por != null && lconfigurado_por.getConfiguracion() == this) {
				lconfigurado_por.setConfiguracion(null);
			}
		}
	}
	
	public orm_instagual.Usuario getConfigurado_por() {
		return configurado_por;
	}
	
	public String toString() {
		return String.valueOf(getIdConfiguracion());
	}
	
}
