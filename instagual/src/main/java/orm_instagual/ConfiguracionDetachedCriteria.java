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

public class ConfiguracionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idConfiguracion;
	public final BooleanExpression notificarMeGustab;
	public final BooleanExpression notificarComentario;
	public final BooleanExpression notificarSeguimiento;
	public final BooleanExpression notificarSolicitud;
	public final BooleanExpression cuentaPrivada;
	public final BooleanExpression mostrarSeguidores;
	public final IntegerExpression configurado_porId;
	public final AssociationExpression configurado_por;
	
	public ConfiguracionDetachedCriteria() {
		super(orm_instagual.Configuracion.class, orm_instagual.ConfiguracionCriteria.class);
		idConfiguracion = new IntegerExpression("idConfiguracion", this.getDetachedCriteria());
		notificarMeGustab = new BooleanExpression("notificarMeGustab", this.getDetachedCriteria());
		notificarComentario = new BooleanExpression("notificarComentario", this.getDetachedCriteria());
		notificarSeguimiento = new BooleanExpression("notificarSeguimiento", this.getDetachedCriteria());
		notificarSolicitud = new BooleanExpression("notificarSolicitud", this.getDetachedCriteria());
		cuentaPrivada = new BooleanExpression("cuentaPrivada", this.getDetachedCriteria());
		mostrarSeguidores = new BooleanExpression("mostrarSeguidores", this.getDetachedCriteria());
		configurado_porId = new IntegerExpression("configurado_por.idConfiguracion", this.getDetachedCriteria());
		configurado_por = new AssociationExpression("configurado_por", this.getDetachedCriteria());
	}
	
	public ConfiguracionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm_instagual.ConfiguracionCriteria.class);
		idConfiguracion = new IntegerExpression("idConfiguracion", this.getDetachedCriteria());
		notificarMeGustab = new BooleanExpression("notificarMeGustab", this.getDetachedCriteria());
		notificarComentario = new BooleanExpression("notificarComentario", this.getDetachedCriteria());
		notificarSeguimiento = new BooleanExpression("notificarSeguimiento", this.getDetachedCriteria());
		notificarSolicitud = new BooleanExpression("notificarSolicitud", this.getDetachedCriteria());
		cuentaPrivada = new BooleanExpression("cuentaPrivada", this.getDetachedCriteria());
		mostrarSeguidores = new BooleanExpression("mostrarSeguidores", this.getDetachedCriteria());
		configurado_porId = new IntegerExpression("configurado_por.idConfiguracion", this.getDetachedCriteria());
		configurado_por = new AssociationExpression("configurado_por", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createConfigurado_porCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("configurado_por"));
	}
	
	public Configuracion uniqueConfiguracion(PersistentSession session) {
		return (Configuracion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Configuracion[] listConfiguracion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Configuracion[]) list.toArray(new Configuracion[list.size()]);
	}
}

