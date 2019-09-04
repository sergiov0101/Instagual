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
@Table(name="Publicacion")
public class Publicacion implements Serializable {
	public Publicacion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm_instagual.ORMConstants.KEY_PUBLICACION_LE_GUSTA_A) {
			return ORM_le_gusta_a;
		}
		else if (key == orm_instagual.ORMConstants.KEY_PUBLICACION_ETIQUETA_A) {
			return ORM_etiqueta_a;
		}
		else if (key == orm_instagual.ORMConstants.KEY_PUBLICACION_CONTIENE) {
			return ORM_contiene;
		}
		else if (key == orm_instagual.ORMConstants.KEY_PUBLICACION_CONTIENE_ETIQUETA) {
			return ORM_contiene_etiqueta;
		}
		else if (key == orm_instagual.ORMConstants.KEY_PUBLICACION_TIENE) {
			return ORM_tiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm_instagual.ORMConstants.KEY_PUBLICACION_PERTENECE_A) {
			this.pertenece_a = (orm_instagual.Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IdPublicacion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_INSTAGUAL_PUBLICACION_IDPUBLICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_INSTAGUAL_PUBLICACION_IDPUBLICACION_GENERATOR", strategy="native")	
	private int idPublicacion;
	
	@ManyToMany(targetEntity=orm_instagual.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Publicacion", joinColumns={ @JoinColumn(name="PublicacionIdPublicacion") }, inverseJoinColumns={ @JoinColumn(name="UsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_le_gusta_a = new java.util.HashSet();
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@ManyToMany(targetEntity=orm_instagual.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Publicacion2", joinColumns={ @JoinColumn(name="PublicacionIdPublicacion") }, inverseJoinColumns={ @JoinColumn(name="UsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_etiqueta_a = new java.util.HashSet();
	
	@ManyToOne(targetEntity=orm_instagual.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm_instagual.Usuario pertenece_a;
	
	@OneToMany(mappedBy="Esta_en", targetEntity=orm_instagual.Multimedia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_aparece_en", targetEntity=orm_instagual.Etiqueta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_etiqueta = new java.util.HashSet();
	
	@OneToMany(mappedBy="comentario_aparece_en", targetEntity=orm_instagual.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	private void setIdPublicacion(int value) {
		this.idPublicacion = value;
	}
	
	public int getIdPublicacion() {
		return idPublicacion;
	}
	
	public int getORMID() {
		return getIdPublicacion();
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	private void setORM_Le_gusta_a(java.util.Set value) {
		this.ORM_le_gusta_a = value;
	}
	
	private java.util.Set getORM_Le_gusta_a() {
		return ORM_le_gusta_a;
	}
	
	@Transient	
	public final orm_instagual.UsuarioSetCollection le_gusta_a = new orm_instagual.UsuarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_PUBLICACION_LE_GUSTA_A, orm_instagual.ORMConstants.KEY_USUARIO_DA_ME_GUSTA_A, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Etiqueta_a(java.util.Set value) {
		this.ORM_etiqueta_a = value;
	}
	
	private java.util.Set getORM_Etiqueta_a() {
		return ORM_etiqueta_a;
	}
	
	@Transient	
	public final orm_instagual.UsuarioSetCollection etiqueta_a = new orm_instagual.UsuarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_PUBLICACION_ETIQUETA_A, orm_instagual.ORMConstants.KEY_USUARIO_ESTA_ETIQUETADO_EN, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPertenece_a(orm_instagual.Usuario value) {
		if (pertenece_a != null) {
			pertenece_a.publica.remove(this);
		}
		if (value != null) {
			value.publica.add(this);
		}
	}
	
	public orm_instagual.Usuario getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(orm_instagual.Usuario value) {
		this.pertenece_a = value;
	}
	
	private orm_instagual.Usuario getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final orm_instagual.MultimediaSetCollection contiene = new orm_instagual.MultimediaSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_PUBLICACION_CONTIENE, orm_instagual.ORMConstants.KEY_MULTIMEDIA_ESTA_EN, orm_instagual.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Contiene_etiqueta(java.util.Set value) {
		this.ORM_contiene_etiqueta = value;
	}
	
	private java.util.Set getORM_Contiene_etiqueta() {
		return ORM_contiene_etiqueta;
	}
	
	@Transient	
	public final orm_instagual.EtiquetaSetCollection contiene_etiqueta = new orm_instagual.EtiquetaSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_PUBLICACION_CONTIENE_ETIQUETA, orm_instagual.ORMConstants.KEY_ETIQUETA_APARECE_EN, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final orm_instagual.ComentarioSetCollection tiene = new orm_instagual.ComentarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_PUBLICACION_TIENE, orm_instagual.ORMConstants.KEY_COMENTARIO_COMENTARIO_APARECE_EN, orm_instagual.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdPublicacion());
	}
	
}
