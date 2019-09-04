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
@Table(name="Etiqueta")
public class Etiqueta implements Serializable {
	public Etiqueta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm_instagual.ORMConstants.KEY_ETIQUETA_APARECE_EN) {
			return ORM_aparece_en;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_INSTAGUAL_ETIQUETA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_INSTAGUAL_ETIQUETA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Etiqueta", nullable=true, length=255)	
	private String etiqueta;
	
	@ManyToMany(targetEntity=orm_instagual.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Publicacion_Etiqueta", joinColumns={ @JoinColumn(name="EtiquetaID") }, inverseJoinColumns={ @JoinColumn(name="PublicacionIdPublicacion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_aparece_en = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setEtiqueta(String value) {
		this.etiqueta = value;
	}
	
	public String getEtiqueta() {
		return etiqueta;
	}
	
	private void setORM_Aparece_en(java.util.Set value) {
		this.ORM_aparece_en = value;
	}
	
	private java.util.Set getORM_Aparece_en() {
		return ORM_aparece_en;
	}
	
	@Transient	
	public final orm_instagual.PublicacionSetCollection aparece_en = new orm_instagual.PublicacionSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_ETIQUETA_APARECE_EN, orm_instagual.ORMConstants.KEY_PUBLICACION_CONTIENE_ETIQUETA, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
