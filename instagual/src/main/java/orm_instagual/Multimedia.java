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
@Table(name="Multimedia")
public class Multimedia implements Serializable {
	public Multimedia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm_instagual.ORMConstants.KEY_MULTIMEDIA_ESTA_EN) {
			this.Esta_en = (orm_instagual.Publicacion) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_INSTAGUAL_MULTIMEDIA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_INSTAGUAL_MULTIMEDIA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=orm_instagual.Publicacion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PublicacionIdPublicacion", referencedColumnName="IdPublicacion", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm_instagual.Publicacion Esta_en;
	
	@Column(name="Url", nullable=true, length=255)	
	private String url;
	
	@Column(name="`Size`", nullable=false)	
	private float size;
	
	@Column(name="Duracion", nullable=false)	
	private float duracion;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setSize(float value) {
		this.size = value;
	}
	
	public float getSize() {
		return size;
	}
	
	public void setDuracion(float value) {
		this.duracion = value;
	}
	
	public float getDuracion() {
		return duracion;
	}
	
	public void setEsta_en(orm_instagual.Publicacion value) {
		if (Esta_en != null) {
			Esta_en.contiene.remove(this);
		}
		if (value != null) {
			value.contiene.add(this);
		}
	}
	
	public orm_instagual.Publicacion getEsta_en() {
		return Esta_en;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Esta_en(orm_instagual.Publicacion value) {
		this.Esta_en = value;
	}
	
	private orm_instagual.Publicacion getORM_Esta_en() {
		return Esta_en;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
