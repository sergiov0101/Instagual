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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idComentario;
	public final IntegerExpression pertenece_a_usuarioId;
	public final AssociationExpression pertenece_a_usuario;
	public final IntegerExpression comentario_aparece_enId;
	public final AssociationExpression comentario_aparece_en;
	public final StringExpression comentario;
	public final CollectionExpression le_gusta_a;
	
	public ComentarioDetachedCriteria() {
		super(orm_instagual.Comentario.class, orm_instagual.ComentarioCriteria.class);
		idComentario = new IntegerExpression("idComentario", this.getDetachedCriteria());
		pertenece_a_usuarioId = new IntegerExpression("pertenece_a_usuario.idUsuario", this.getDetachedCriteria());
		pertenece_a_usuario = new AssociationExpression("pertenece_a_usuario", this.getDetachedCriteria());
		comentario_aparece_enId = new IntegerExpression("comentario_aparece_en.idPublicacion", this.getDetachedCriteria());
		comentario_aparece_en = new AssociationExpression("comentario_aparece_en", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm_instagual.ComentarioCriteria.class);
		idComentario = new IntegerExpression("idComentario", this.getDetachedCriteria());
		pertenece_a_usuarioId = new IntegerExpression("pertenece_a_usuario.idUsuario", this.getDetachedCriteria());
		pertenece_a_usuario = new AssociationExpression("pertenece_a_usuario", this.getDetachedCriteria());
		comentario_aparece_enId = new IntegerExpression("comentario_aparece_en.idPublicacion", this.getDetachedCriteria());
		comentario_aparece_en = new AssociationExpression("comentario_aparece_en", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createPertenece_a_usuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("pertenece_a_usuario"));
	}
	
	public PublicacionDetachedCriteria createComentario_aparece_enCriteria() {
		return new PublicacionDetachedCriteria(createCriteria("comentario_aparece_en"));
	}
	
	public orm_instagual.UsuarioDetachedCriteria createLe_gusta_aCriteria() {
		return new orm_instagual.UsuarioDetachedCriteria(createCriteria("ORM_le_gusta_a"));
	}
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

