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

public class MultimediaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression Esta_enId;
	public final AssociationExpression Esta_en;
	public final StringExpression url;
	public final FloatExpression size;
	public final FloatExpression duracion;
	
	public MultimediaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		Esta_enId = new IntegerExpression("Esta_en.idPublicacion", this);
		Esta_en = new AssociationExpression("Esta_en", this);
		url = new StringExpression("url", this);
		size = new FloatExpression("size", this);
		duracion = new FloatExpression("duracion", this);
	}
	
	public MultimediaCriteria(PersistentSession session) {
		this(session.createCriteria(Multimedia.class));
	}
	
	public MultimediaCriteria() throws PersistentException {
		this(orm_instagual.A11ModeladoPersistentManager.instance().getSession());
	}
	
	public PublicacionCriteria createEsta_enCriteria() {
		return new PublicacionCriteria(createCriteria("Esta_en"));
	}
	
	public Multimedia uniqueMultimedia() {
		return (Multimedia) super.uniqueResult();
	}
	
	public Multimedia[] listMultimedia() {
		java.util.List list = super.list();
		return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
	}
}

