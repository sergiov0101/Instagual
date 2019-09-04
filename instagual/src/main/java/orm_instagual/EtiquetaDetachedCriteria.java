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

public class EtiquetaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression etiqueta;
	public final CollectionExpression aparece_en;
	
	public EtiquetaDetachedCriteria() {
		super(orm_instagual.Etiqueta.class, orm_instagual.EtiquetaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		etiqueta = new StringExpression("etiqueta", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
	}
	
	public EtiquetaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm_instagual.EtiquetaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		etiqueta = new StringExpression("etiqueta", this.getDetachedCriteria());
		aparece_en = new CollectionExpression("ORM_aparece_en", this.getDetachedCriteria());
	}
	
	public orm_instagual.PublicacionDetachedCriteria createAparece_enCriteria() {
		return new orm_instagual.PublicacionDetachedCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public Etiqueta uniqueEtiqueta(PersistentSession session) {
		return (Etiqueta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Etiqueta[] listEtiqueta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Etiqueta[]) list.toArray(new Etiqueta[list.size()]);
	}
}

