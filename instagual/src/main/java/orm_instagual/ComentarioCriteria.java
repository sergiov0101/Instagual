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

public class ComentarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression idComentario;
	public final IntegerExpression pertenece_a_usuarioId;
	public final AssociationExpression pertenece_a_usuario;
	public final IntegerExpression comentario_aparece_enId;
	public final AssociationExpression comentario_aparece_en;
	public final StringExpression comentario;
	public final CollectionExpression le_gusta_a;
	
	public ComentarioCriteria(Criteria criteria) {
		super(criteria);
		idComentario = new IntegerExpression("idComentario", this);
		pertenece_a_usuarioId = new IntegerExpression("pertenece_a_usuario.idUsuario", this);
		pertenece_a_usuario = new AssociationExpression("pertenece_a_usuario", this);
		comentario_aparece_enId = new IntegerExpression("comentario_aparece_en.idPublicacion", this);
		comentario_aparece_en = new AssociationExpression("comentario_aparece_en", this);
		comentario = new StringExpression("comentario", this);
		le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this);
	}
	
	public ComentarioCriteria(PersistentSession session) {
		this(session.createCriteria(Comentario.class));
	}
	
	public ComentarioCriteria() throws PersistentException {
		this(orm_instagual.A11ModeladoPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createPertenece_a_usuarioCriteria() {
		return new UsuarioCriteria(createCriteria("pertenece_a_usuario"));
	}
	
	public PublicacionCriteria createComentario_aparece_enCriteria() {
		return new PublicacionCriteria(createCriteria("comentario_aparece_en"));
	}
	
	public orm_instagual.UsuarioCriteria createLe_gusta_aCriteria() {
		return new orm_instagual.UsuarioCriteria(createCriteria("ORM_le_gusta_a"));
	}
	
	public Comentario uniqueComentario() {
		return (Comentario) super.uniqueResult();
	}
	
	public Comentario[] listComentario() {
		java.util.List list = super.list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

