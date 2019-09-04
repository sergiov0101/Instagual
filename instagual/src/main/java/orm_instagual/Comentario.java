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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm_instagual.ORMConstants.KEY_COMENTARIO_LE_GUSTA_A) {
			return ORM_le_gusta_a;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm_instagual.ORMConstants.KEY_COMENTARIO_COMENTARIO_APARECE_EN) {
			this.comentario_aparece_en = (orm_instagual.Publicacion) owner;
		}
		
		else if (key == orm_instagual.ORMConstants.KEY_COMENTARIO_PERTENECE_A_USUARIO) {
			this.pertenece_a_usuario = (orm_instagual.Usuario) owner;
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
	
	@Column(name="IdComentario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_INSTAGUAL_COMENTARIO_IDCOMENTARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_INSTAGUAL_COMENTARIO_IDCOMENTARIO_GENERATOR", strategy="native")	
	private int idComentario;
	
	@ManyToOne(targetEntity=orm_instagual.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UsuarioIdUsuario", referencedColumnName="IdUsuario", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm_instagual.Usuario pertenece_a_usuario;
	
	@ManyToOne(targetEntity=orm_instagual.Publicacion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PublicacionIdPublicacion", referencedColumnName="IdPublicacion", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm_instagual.Publicacion comentario_aparece_en;
	
	@Column(name="Comentario", nullable=true, length=255)	
	private String comentario;
	
	@ManyToMany(targetEntity=orm_instagual.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Comentario", joinColumns={ @JoinColumn(name="ComentarioIdComentario") }, inverseJoinColumns={ @JoinColumn(name="UsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_le_gusta_a = new java.util.HashSet();
	
	private void setIdComentario(int value) {
		this.idComentario = value;
	}
	
	public int getIdComentario() {
		return idComentario;
	}
	
	public int getORMID() {
		return getIdComentario();
	}
	
	public void setComentario(String value) {
		this.comentario = value;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario_aparece_en(orm_instagual.Publicacion value) {
		if (comentario_aparece_en != null) {
			comentario_aparece_en.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public orm_instagual.Publicacion getComentario_aparece_en() {
		return comentario_aparece_en;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comentario_aparece_en(orm_instagual.Publicacion value) {
		this.comentario_aparece_en = value;
	}
	
	private orm_instagual.Publicacion getORM_Comentario_aparece_en() {
		return comentario_aparece_en;
	}
	
	public void setPertenece_a_usuario(orm_instagual.Usuario value) {
		if (pertenece_a_usuario != null) {
			pertenece_a_usuario.comenta.remove(this);
		}
		if (value != null) {
			value.comenta.add(this);
		}
	}
	
	public orm_instagual.Usuario getPertenece_a_usuario() {
		return pertenece_a_usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a_usuario(orm_instagual.Usuario value) {
		this.pertenece_a_usuario = value;
	}
	
	private orm_instagual.Usuario getORM_Pertenece_a_usuario() {
		return pertenece_a_usuario;
	}
	
	private void setORM_Le_gusta_a(java.util.Set value) {
		this.ORM_le_gusta_a = value;
	}
	
	private java.util.Set getORM_Le_gusta_a() {
		return ORM_le_gusta_a;
	}
	
	@Transient	
	public final orm_instagual.UsuarioSetCollection le_gusta_a = new orm_instagual.UsuarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_COMENTARIO_LE_GUSTA_A, orm_instagual.ORMConstants.KEY_USUARIO_DA_ME_GUSTA_A_COMENT, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdComentario());
	}
	
}
