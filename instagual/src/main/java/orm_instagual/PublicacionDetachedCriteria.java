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

public class PublicacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idPublicacion;
	public final CollectionExpression le_gusta_a;
	public final StringExpression descripcion;
	public final CollectionExpression etiqueta_a;
	public final IntegerExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final CollectionExpression contiene;
	public final CollectionExpression contiene_etiqueta;
	public final CollectionExpression tiene;
	
	public PublicacionDetachedCriteria() {
		super(orm_instagual.Publicacion.class, orm_instagual.PublicacionCriteria.class);
		idPublicacion = new IntegerExpression("idPublicacion", this.getDetachedCriteria());
		le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		etiqueta_a = new CollectionExpression("ORM_etiqueta_a", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.idUsuario", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		contiene_etiqueta = new CollectionExpression("ORM_contiene_etiqueta", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public PublicacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm_instagual.PublicacionCriteria.class);
		idPublicacion = new IntegerExpression("idPublicacion", this.getDetachedCriteria());
		le_gusta_a = new CollectionExpression("ORM_le_gusta_a", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		etiqueta_a = new CollectionExpression("ORM_etiqueta_a", this.getDetachedCriteria());
		pertenece_aId = new IntegerExpression("pertenece_a.idUsuario", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		contiene_etiqueta = new CollectionExpression("ORM_contiene_etiqueta", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
	}
	
	public orm_instagual.UsuarioDetachedCriteria createLe_gusta_aCriteria() {
		return new orm_instagual.UsuarioDetachedCriteria(createCriteria("ORM_le_gusta_a"));
	}
	
	public orm_instagual.UsuarioDetachedCriteria createEtiqueta_aCriteria() {
		return new orm_instagual.UsuarioDetachedCriteria(createCriteria("ORM_etiqueta_a"));
	}
	
	public UsuarioDetachedCriteria createPertenece_aCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public orm_instagual.MultimediaDetachedCriteria createContieneCriteria() {
		return new orm_instagual.MultimediaDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public orm_instagual.EtiquetaDetachedCriteria createContiene_etiquetaCriteria() {
		return new orm_instagual.EtiquetaDetachedCriteria(createCriteria("ORM_contiene_etiqueta"));
	}
	
	public orm_instagual.ComentarioDetachedCriteria createTieneCriteria() {
		return new orm_instagual.ComentarioDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public Publicacion uniquePublicacion(PersistentSession session) {
		return (Publicacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Publicacion[] listPublicacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
	}
}

