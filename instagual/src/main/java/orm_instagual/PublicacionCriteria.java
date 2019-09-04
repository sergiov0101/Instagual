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

public class PublicacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idPublicacion;
	public final CollectionExpression le_gusta_a;
	public final StringExpression descripcion;
	public final CollectionExpression etiqueta_a;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final CollectionExpression contiene;
	public final CollectionExpression contiene_etiqueta;
	public final CollectionExpression tiene;
	
	public PublicacionCriteria(Criteria criteria) {
		super(criteria);
		idPublicacion = new IntegerExpression("idPublicacion", this);
		le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this);
		descripcion = new StringExpression("descripcion", this);
		etiqueta_a = new CollectionExpression("ORM_etiqueta_a", this);
		pertenece_aId = new IntegerExpression("pertenece_a.idUsuario", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		contiene = new CollectionExpression("ORM_contiene", this);
		contiene_etiqueta = new CollectionExpression("ORM_contiene_etiqueta", this);
		tiene = new CollectionExpression("ORM_tiene", this);
	}
	
	public PublicacionCriteria(PersistentSession session) {
		this(session.createCriteria(Publicacion.class));
	}
	
	public PublicacionCriteria() throws PersistentException {
		this(orm_instagual.A11ModeladoPersistentManager.instance().getSession());
	}
	
	public orm_instagual.UsuarioCriteria createLe_gusta_aCriteria() {
		return new orm_instagual.UsuarioCriteria(createCriteria("ORM_le_gusta_a"));
	}
	
	public orm_instagual.UsuarioCriteria createEtiqueta_aCriteria() {
		return new orm_instagual.UsuarioCriteria(createCriteria("ORM_etiqueta_a"));
	}
	
	public UsuarioCriteria createPertenece_aCriteria() {
		return new UsuarioCriteria(createCriteria("pertenece_a"));
	}
	
	public orm_instagual.MultimediaCriteria createContieneCriteria() {
		return new orm_instagual.MultimediaCriteria(createCriteria("ORM_contiene"));
	}
	
	public orm_instagual.EtiquetaCriteria createContiene_etiquetaCriteria() {
		return new orm_instagual.EtiquetaCriteria(createCriteria("ORM_contiene_etiqueta"));
	}
	
	public orm_instagual.ComentarioCriteria createTieneCriteria() {
		return new orm_instagual.ComentarioCriteria(createCriteria("ORM_tiene"));
	}
	
	public Publicacion uniquePublicacion() {
		return (Publicacion) super.uniqueResult();
	}
	
	public Publicacion[] listPublicacion() {
		java.util.List list = super.list();
		return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
	}
}

