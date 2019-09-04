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
@Table(name="Usuario")
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm_instagual.ORMConstants.KEY_USUARIO_ES_SEGUIDOR_DE) {
			return ORM_es_seguidor_de;
		}
		else if (key == orm_instagual.ORMConstants.KEY_USUARIO_BLOQUEA_A) {
			return ORM_bloquea_a;
		}
		else if (key == orm_instagual.ORMConstants.KEY_USUARIO_SIGUE_A) {
			return ORM_sigue_a;
		}
		else if (key == orm_instagual.ORMConstants.KEY_USUARIO_DA_ME_GUSTA_A) {
			return ORM_da_me_gusta_a;
		}
		else if (key == orm_instagual.ORMConstants.KEY_USUARIO_ESTA_ETIQUETADO_EN) {
			return ORM_esta_etiquetado_en;
		}
		else if (key == orm_instagual.ORMConstants.KEY_USUARIO_PUBLICA) {
			return ORM_publica;
		}
		else if (key == orm_instagual.ORMConstants.KEY_USUARIO_ES_BLOQUEADO_POR) {
			return ORM_es_bloqueado_por;
		}
		else if (key == orm_instagual.ORMConstants.KEY_USUARIO_COMENTA) {
			return ORM_comenta;
		}
		else if (key == orm_instagual.ORMConstants.KEY_USUARIO_DA_ME_GUSTA_A_COMENT) {
			return ORM_da_me_gusta_a_coment;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm_instagual.ORMConstants.KEY_USUARIO_CONFIGURACION) {
			this.configuracion = (orm_instagual.Configuracion) owner;
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
	
	@Column(name="IdUsuario", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ORM_INSTAGUAL_USUARIO_IDUSUARIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_INSTAGUAL_USUARIO_IDUSUARIO_GENERATOR", strategy="native")	
	private int idUsuario;
	
	@OneToOne(optional=false, targetEntity=orm_instagual.Configuracion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ConfiguracionIdConfiguracion", referencedColumnName="IdConfiguracion", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm_instagual.Configuracion configuracion;
	
	@Column(name="Usuario", nullable=true, length=255)	
	private String usuario;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellidos", nullable=true, length=255)	
	private String apellidos;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="FotoPerfil", nullable=true, length=255)	
	private String fotoPerfil;
	
	@Column(name="Edad", nullable=false, length=1)	
	private boolean edad;
	
	@ManyToMany(targetEntity=orm_instagual.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Usuario", joinColumns={ @JoinColumn(name="UsuarioIdUsuario2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_seguidor_de = new java.util.HashSet();
	
	@ManyToMany(targetEntity=orm_instagual.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Usuario_Usuario2", joinColumns={ @JoinColumn(name="UsuarioIdUsuario2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioIdUsuario") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_bloquea_a = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_seguidor_de", targetEntity=orm_instagual.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_sigue_a = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_le_gusta_a", targetEntity=orm_instagual.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_me_gusta_a = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_etiqueta_a", targetEntity=orm_instagual.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_esta_etiquetado_en = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=orm_instagual.Publicacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_bloquea_a", targetEntity=orm_instagual.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_bloqueado_por = new java.util.HashSet();
	
	@OneToMany(mappedBy="pertenece_a_usuario", targetEntity=orm_instagual.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comenta = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_le_gusta_a", targetEntity=orm_instagual.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_me_gusta_a_coment = new java.util.HashSet();
	
	private void setIdUsuario(int value) {
		this.idUsuario = value;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public int getORMID() {
		return getIdUsuario();
	}
	
	public void setUsuario(String value) {
		this.usuario = value;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setFotoPerfil(String value) {
		this.fotoPerfil = value;
	}
	
	public String getFotoPerfil() {
		return fotoPerfil;
	}
	
	public void setEdad(boolean value) {
		this.edad = value;
	}
	
	public boolean getEdad() {
		return edad;
	}
	
	private void setORM_Es_seguidor_de(java.util.Set value) {
		this.ORM_es_seguidor_de = value;
	}
	
	private java.util.Set getORM_Es_seguidor_de() {
		return ORM_es_seguidor_de;
	}
	
	@Transient	
	public final orm_instagual.UsuarioSetCollection es_seguidor_de = new orm_instagual.UsuarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_ES_SEGUIDOR_DE, orm_instagual.ORMConstants.KEY_USUARIO_SIGUE_A, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Bloquea_a(java.util.Set value) {
		this.ORM_bloquea_a = value;
	}
	
	private java.util.Set getORM_Bloquea_a() {
		return ORM_bloquea_a;
	}
	
	@Transient	
	public final orm_instagual.UsuarioSetCollection bloquea_a = new orm_instagual.UsuarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_BLOQUEA_A, orm_instagual.ORMConstants.KEY_USUARIO_ES_BLOQUEADO_POR, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setConfiguracion(orm_instagual.Configuracion value) {
		if (this.configuracion != value) {
			orm_instagual.Configuracion lconfiguracion = this.configuracion;
			this.configuracion = value;
			if (value != null) {
				configuracion.setConfigurado_por(this);
			}
			if (lconfiguracion != null && lconfiguracion.getConfigurado_por() == this) {
				lconfiguracion.setConfigurado_por(null);
			}
		}
	}
	
	public orm_instagual.Configuracion getConfiguracion() {
		return configuracion;
	}
	
	private void setORM_Sigue_a(java.util.Set value) {
		this.ORM_sigue_a = value;
	}
	
	private java.util.Set getORM_Sigue_a() {
		return ORM_sigue_a;
	}
	
	@Transient	
	public final orm_instagual.UsuarioSetCollection sigue_a = new orm_instagual.UsuarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_SIGUE_A, orm_instagual.ORMConstants.KEY_USUARIO_ES_SEGUIDOR_DE, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Da_me_gusta_a(java.util.Set value) {
		this.ORM_da_me_gusta_a = value;
	}
	
	private java.util.Set getORM_Da_me_gusta_a() {
		return ORM_da_me_gusta_a;
	}
	
	@Transient	
	public final orm_instagual.PublicacionSetCollection da_me_gusta_a = new orm_instagual.PublicacionSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_DA_ME_GUSTA_A, orm_instagual.ORMConstants.KEY_PUBLICACION_LE_GUSTA_A, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Esta_etiquetado_en(java.util.Set value) {
		this.ORM_esta_etiquetado_en = value;
	}
	
	private java.util.Set getORM_Esta_etiquetado_en() {
		return ORM_esta_etiquetado_en;
	}
	
	@Transient	
	public final orm_instagual.PublicacionSetCollection esta_etiquetado_en = new orm_instagual.PublicacionSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_ESTA_ETIQUETADO_EN, orm_instagual.ORMConstants.KEY_PUBLICACION_ETIQUETA_A, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Publica(java.util.Set value) {
		this.ORM_publica = value;
	}
	
	private java.util.Set getORM_Publica() {
		return ORM_publica;
	}
	
	@Transient	
	public final orm_instagual.PublicacionSetCollection publica = new orm_instagual.PublicacionSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_PUBLICA, orm_instagual.ORMConstants.KEY_PUBLICACION_PERTENECE_A, orm_instagual.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_bloqueado_por(java.util.Set value) {
		this.ORM_es_bloqueado_por = value;
	}
	
	private java.util.Set getORM_Es_bloqueado_por() {
		return ORM_es_bloqueado_por;
	}
	
	@Transient	
	public final orm_instagual.UsuarioSetCollection es_bloqueado_por = new orm_instagual.UsuarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_ES_BLOQUEADO_POR, orm_instagual.ORMConstants.KEY_USUARIO_BLOQUEA_A, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Comenta(java.util.Set value) {
		this.ORM_comenta = value;
	}
	
	private java.util.Set getORM_Comenta() {
		return ORM_comenta;
	}
	
	@Transient	
	public final orm_instagual.ComentarioSetCollection comenta = new orm_instagual.ComentarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_COMENTA, orm_instagual.ORMConstants.KEY_COMENTARIO_PERTENECE_A_USUARIO, orm_instagual.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Da_me_gusta_a_coment(java.util.Set value) {
		this.ORM_da_me_gusta_a_coment = value;
	}
	
	private java.util.Set getORM_Da_me_gusta_a_coment() {
		return ORM_da_me_gusta_a_coment;
	}
	
	@Transient	
	public final orm_instagual.ComentarioSetCollection da_me_gusta_a_coment = new orm_instagual.ComentarioSetCollection(this, _ormAdapter, orm_instagual.ORMConstants.KEY_USUARIO_DA_ME_GUSTA_A_COMENT, orm_instagual.ORMConstants.KEY_COMENTARIO_LE_GUSTA_A, orm_instagual.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdUsuario());
	}
	
}
