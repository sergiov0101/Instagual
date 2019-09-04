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

public class MultimediaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression Esta_enId;
	public final AssociationExpression Esta_en;
	public final StringExpression url;
	public final FloatExpression size;
	public final FloatExpression duracion;
	
	public MultimediaDetachedCriteria() {
		super(orm_instagual.Multimedia.class, orm_instagual.MultimediaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Esta_enId = new IntegerExpression("Esta_en.idPublicacion", this.getDetachedCriteria());
		Esta_en = new AssociationExpression("Esta_en", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		size = new FloatExpression("size", this.getDetachedCriteria());
		duracion = new FloatExpression("duracion", this.getDetachedCriteria());
	}
	
	public MultimediaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm_instagual.MultimediaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Esta_enId = new IntegerExpression("Esta_en.idPublicacion", this.getDetachedCriteria());
		Esta_en = new AssociationExpression("Esta_en", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		size = new FloatExpression("size", this.getDetachedCriteria());
		duracion = new FloatExpression("duracion", this.getDetachedCriteria());
	}
	
	public PublicacionDetachedCriteria createEsta_enCriteria() {
		return new PublicacionDetachedCriteria(createCriteria("Esta_en"));
	}
	
	public Multimedia uniqueMultimedia(PersistentSession session) {
		return (Multimedia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Multimedia[] listMultimedia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
	}
}

