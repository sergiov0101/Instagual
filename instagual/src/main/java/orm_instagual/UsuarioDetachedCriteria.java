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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idUsuario;
	public final IntegerExpression configuracionId;
	public final AssociationExpression configuracion;
	public final StringExpression usuario;
	public final StringExpression nombre;
	public final StringExpression apellidos;
	public final StringExpression password;
	public final StringExpression email;
	public final StringExpression fotoPerfil;
	public final BooleanExpression edad;
	public final CollectionExpression es_seguidor_de;
	public final CollectionExpression bloquea_a;
	public final CollectionExpression sigue_a;
	public final CollectionExpression da_me_gusta_a;
	public final CollectionExpression esta_etiquetado_en;
	public final CollectionExpression publica;
	public final CollectionExpression es_bloqueado_por;
	public final CollectionExpression comenta;
	public final CollectionExpression da_me_gusta_a_coment;
	
	public UsuarioDetachedCriteria() {
		super(orm_instagual.Usuario.class, orm_instagual.UsuarioCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		configuracionId = new IntegerExpression("configuracion.idConfiguracion", this.getDetachedCriteria());
		configuracion = new AssociationExpression("configuracion", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		edad = new BooleanExpression("edad", this.getDetachedCriteria());
		es_seguidor_de = new CollectionExpression("ORM_es_seguidor_de", this.getDetachedCriteria());
		bloquea_a = new CollectionExpression("ORM_bloquea_a", this.getDetachedCriteria());
		sigue_a = new CollectionExpression("ORM_sigue_a", this.getDetachedCriteria());
		da_me_gusta_a = new CollectionExpression("ORM_da_me_gusta_a", this.getDetachedCriteria());
		esta_etiquetado_en = new CollectionExpression("ORM_esta_etiquetado_en", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		es_bloqueado_por = new CollectionExpression("ORM_es_bloqueado_por", this.getDetachedCriteria());
		comenta = new CollectionExpression("ORM_comenta", this.getDetachedCriteria());
		da_me_gusta_a_coment = new CollectionExpression("ORM_da_me_gusta_a_coment", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm_instagual.UsuarioCriteria.class);
		idUsuario = new IntegerExpression("idUsuario", this.getDetachedCriteria());
		configuracionId = new IntegerExpression("configuracion.idConfiguracion", this.getDetachedCriteria());
		configuracion = new AssociationExpression("configuracion", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		edad = new BooleanExpression("edad", this.getDetachedCriteria());
		es_seguidor_de = new CollectionExpression("ORM_es_seguidor_de", this.getDetachedCriteria());
		bloquea_a = new CollectionExpression("ORM_bloquea_a", this.getDetachedCriteria());
		sigue_a = new CollectionExpression("ORM_sigue_a", this.getDetachedCriteria());
		da_me_gusta_a = new CollectionExpression("ORM_da_me_gusta_a", this.getDetachedCriteria());
		esta_etiquetado_en = new CollectionExpression("ORM_esta_etiquetado_en", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
		es_bloqueado_por = new CollectionExpression("ORM_es_bloqueado_por", this.getDetachedCriteria());
		comenta = new CollectionExpression("ORM_comenta", this.getDetachedCriteria());
		da_me_gusta_a_coment = new CollectionExpression("ORM_da_me_gusta_a_coment", this.getDetachedCriteria());
	}
	
	public ConfiguracionDetachedCriteria createConfiguracionCriteria() {
		return new ConfiguracionDetachedCriteria(createCriteria("configuracion"));
	}
	
	public orm_instagual.UsuarioDetachedCriteria createEs_seguidor_deCriteria() {
		return new orm_instagual.UsuarioDetachedCriteria(createCriteria("ORM_es_seguidor_de"));
	}
	
	public orm_instagual.UsuarioDetachedCriteria createBloquea_aCriteria() {
		return new orm_instagual.UsuarioDetachedCriteria(createCriteria("ORM_bloquea_a"));
	}
	
	public orm_instagual.UsuarioDetachedCriteria createSigue_aCriteria() {
		return new orm_instagual.UsuarioDetachedCriteria(createCriteria("ORM_sigue_a"));
	}
	
	public orm_instagual.PublicacionDetachedCriteria createDa_me_gusta_aCriteria() {
		return new orm_instagual.PublicacionDetachedCriteria(createCriteria("ORM_da_me_gusta_a"));
	}
	
	public orm_instagual.PublicacionDetachedCriteria createEsta_etiquetado_enCriteria() {
		return new orm_instagual.PublicacionDetachedCriteria(createCriteria("ORM_esta_etiquetado_en"));
	}
	
	public orm_instagual.PublicacionDetachedCriteria createPublicaCriteria() {
		return new orm_instagual.PublicacionDetachedCriteria(createCriteria("ORM_publica"));
	}
	
	public orm_instagual.UsuarioDetachedCriteria createEs_bloqueado_porCriteria() {
		return new orm_instagual.UsuarioDetachedCriteria(createCriteria("ORM_es_bloqueado_por"));
	}
	
	public orm_instagual.ComentarioDetachedCriteria createComentaCriteria() {
		return new orm_instagual.ComentarioDetachedCriteria(createCriteria("ORM_comenta"));
	}
	
	public orm_instagual.ComentarioDetachedCriteria createDa_me_gusta_a_comentCriteria() {
		return new orm_instagual.ComentarioDetachedCriteria(createCriteria("ORM_da_me_gusta_a_coment"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

