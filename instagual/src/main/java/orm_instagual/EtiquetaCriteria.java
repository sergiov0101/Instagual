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

public class EtiquetaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression etiqueta;
	public final CollectionExpression aparece_en;
	
	public EtiquetaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		etiqueta = new StringExpression("etiqueta", this);
		aparece_en = new CollectionExpression("ORM_aparece_en", this);
	}
	
	public EtiquetaCriteria(PersistentSession session) {
		this(session.createCriteria(Etiqueta.class));
	}
	
	public EtiquetaCriteria() throws PersistentException {
		this(orm_instagual.A11ModeladoPersistentManager.instance().getSession());
	}
	
	public orm_instagual.PublicacionCriteria createAparece_enCriteria() {
		return new orm_instagual.PublicacionCriteria(createCriteria("ORM_aparece_en"));
	}
	
	public Etiqueta uniqueEtiqueta() {
		return (Etiqueta) super.uniqueResult();
	}
	
	public Etiqueta[] listEtiqueta() {
		java.util.List list = super.list();
		return (Etiqueta[]) list.toArray(new Etiqueta[list.size()]);
	}
}

