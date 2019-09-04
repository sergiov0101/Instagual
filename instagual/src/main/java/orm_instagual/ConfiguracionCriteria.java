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

public class ConfiguracionCriteria extends AbstractORMCriteria {
	public final IntegerExpression idConfiguracion;
	public final BooleanExpression notificarMeGustab;
	public final BooleanExpression notificarComentario;
	public final BooleanExpression notificarSeguimiento;
	public final BooleanExpression notificarSolicitud;
	public final BooleanExpression cuentaPrivada;
	public final BooleanExpression mostrarSeguidores;
	public final IntegerExpression configurado_porId;
	public final AssociationExpression configurado_por;
	
	public ConfiguracionCriteria(Criteria criteria) {
		super(criteria);
		idConfiguracion = new IntegerExpression("idConfiguracion", this);
		notificarMeGustab = new BooleanExpression("notificarMeGustab", this);
		notificarComentario = new BooleanExpression("notificarComentario", this);
		notificarSeguimiento = new BooleanExpression("notificarSeguimiento", this);
		notificarSolicitud = new BooleanExpression("notificarSolicitud", this);
		cuentaPrivada = new BooleanExpression("cuentaPrivada", this);
		mostrarSeguidores = new BooleanExpression("mostrarSeguidores", this);
		configurado_porId = new IntegerExpression("configurado_por.idConfiguracion", this);
		configurado_por = new AssociationExpression("configurado_por", this);
	}
	
	public ConfiguracionCriteria(PersistentSession session) {
		this(session.createCriteria(Configuracion.class));
	}
	
	public ConfiguracionCriteria() throws PersistentException {
		this(orm_instagual.A11ModeladoPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createConfigurado_porCriteria() {
		return new UsuarioCriteria(createCriteria("configurado_por"));
	}
	
	public Configuracion uniqueConfiguracion() {
		return (Configuracion) super.uniqueResult();
	}
	
	public Configuracion[] listConfiguracion() {
		java.util.List list = super.list();
		return (Configuracion[]) list.toArray(new Configuracion[list.size()]);
	}
}

