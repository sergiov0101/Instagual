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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioCriteria extends AbstractORMCriteria {
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
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		idUsuario = new IntegerExpression("idUsuario", this);
		configuracionId = new IntegerExpression("configuracion.idConfiguracion", this);
		configuracion = new AssociationExpression("configuracion", this);
		usuario = new StringExpression("usuario", this);
		nombre = new StringExpression("nombre", this);
		apellidos = new StringExpression("apellidos", this);
		password = new StringExpression("password", this);
		email = new StringExpression("email", this);
		fotoPerfil = new StringExpression("fotoPerfil", this);
		edad = new BooleanExpression("edad", this);
		es_seguidor_de = new CollectionExpression("ORM_es_seguidor_de", this);
		bloquea_a = new CollectionExpression("ORM_bloquea_a", this);
		sigue_a = new CollectionExpression("ORM_sigue_a", this);
		da_me_gusta_a = new CollectionExpression("ORM_da_me_gusta_a", this);
		esta_etiquetado_en = new CollectionExpression("ORM_esta_etiquetado_en", this);
		publica = new CollectionExpression("ORM_publica", this);
		es_bloqueado_por = new CollectionExpression("ORM_es_bloqueado_por", this);
		comenta = new CollectionExpression("ORM_comenta", this);
		da_me_gusta_a_coment = new CollectionExpression("ORM_da_me_gusta_a_coment", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(orm_instagual.A11ModeladoPersistentManager.instance().getSession());
	}
	
	public ConfiguracionCriteria createConfiguracionCriteria() {
		return new ConfiguracionCriteria(createCriteria("configuracion"));
	}
	
	public orm_instagual.UsuarioCriteria createEs_seguidor_deCriteria() {
		return new orm_instagual.UsuarioCriteria(createCriteria("ORM_es_seguidor_de"));
	}
	
	public orm_instagual.UsuarioCriteria createBloquea_aCriteria() {
		return new orm_instagual.UsuarioCriteria(createCriteria("ORM_bloquea_a"));
	}
	
	public orm_instagual.UsuarioCriteria createSigue_aCriteria() {
		return new orm_instagual.UsuarioCriteria(createCriteria("ORM_sigue_a"));
	}
	
	public orm_instagual.PublicacionCriteria createDa_me_gusta_aCriteria() {
		return new orm_instagual.PublicacionCriteria(createCriteria("ORM_da_me_gusta_a"));
	}
	
	public orm_instagual.PublicacionCriteria createEsta_etiquetado_enCriteria() {
		return new orm_instagual.PublicacionCriteria(createCriteria("ORM_esta_etiquetado_en"));
	}
	
	public orm_instagual.PublicacionCriteria createPublicaCriteria() {
		return new orm_instagual.PublicacionCriteria(createCriteria("ORM_publica"));
	}
	
	public orm_instagual.UsuarioCriteria createEs_bloqueado_porCriteria() {
		return new orm_instagual.UsuarioCriteria(createCriteria("ORM_es_bloqueado_por"));
	}
	
	public orm_instagual.ComentarioCriteria createComentaCriteria() {
		return new orm_instagual.ComentarioCriteria(createCriteria("ORM_comenta"));
	}
	
	public orm_instagual.ComentarioCriteria createDa_me_gusta_a_comentCriteria() {
		return new orm_instagual.ComentarioCriteria(createCriteria("ORM_da_me_gusta_a_coment"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

