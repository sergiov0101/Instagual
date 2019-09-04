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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ConfiguracionDAO {
	public static Configuracion loadConfiguracionByORMID(int idConfiguracion) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadConfiguracionByORMID(session, idConfiguracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion getConfiguracionByORMID(int idConfiguracion) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getConfiguracionByORMID(session, idConfiguracion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByORMID(int idConfiguracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadConfiguracionByORMID(session, idConfiguracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion getConfiguracionByORMID(int idConfiguracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getConfiguracionByORMID(session, idConfiguracion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByORMID(PersistentSession session, int idConfiguracion) throws PersistentException {
		try {
			return (Configuracion) session.load(orm_instagual.Configuracion.class, new Integer(idConfiguracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion getConfiguracionByORMID(PersistentSession session, int idConfiguracion) throws PersistentException {
		try {
			return (Configuracion) session.get(orm_instagual.Configuracion.class, new Integer(idConfiguracion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByORMID(PersistentSession session, int idConfiguracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Configuracion) session.load(orm_instagual.Configuracion.class, new Integer(idConfiguracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion getConfiguracionByORMID(PersistentSession session, int idConfiguracion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Configuracion) session.get(orm_instagual.Configuracion.class, new Integer(idConfiguracion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConfiguracion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryConfiguracion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConfiguracion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryConfiguracion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion[] listConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion[] listConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConfiguracion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Configuracion as Configuracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryConfiguracion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Configuracion as Configuracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Configuracion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion[] listConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryConfiguracion(session, condition, orderBy);
			return (Configuracion[]) list.toArray(new Configuracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion[] listConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryConfiguracion(session, condition, orderBy, lockMode);
			return (Configuracion[]) list.toArray(new Configuracion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Configuracion[] configuracions = listConfiguracionByQuery(session, condition, orderBy);
		if (configuracions != null && configuracions.length > 0)
			return configuracions[0];
		else
			return null;
	}
	
	public static Configuracion loadConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Configuracion[] configuracions = listConfiguracionByQuery(session, condition, orderBy, lockMode);
		if (configuracions != null && configuracions.length > 0)
			return configuracions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConfiguracionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iterateConfiguracionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConfiguracionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iterateConfiguracionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConfiguracionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Configuracion as Configuracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateConfiguracionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Configuracion as Configuracion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Configuracion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion createConfiguracion() {
		return new orm_instagual.Configuracion();
	}
	
	public static boolean save(orm_instagual.Configuracion configuracion) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().saveObject(configuracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm_instagual.Configuracion configuracion) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().deleteObject(configuracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Configuracion configuracion)throws PersistentException {
		try {
			if (configuracion.getConfigurado_por() != null) {
				configuracion.getConfigurado_por().setConfiguracion(null);
			}
			
			return delete(configuracion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Configuracion configuracion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (configuracion.getConfigurado_por() != null) {
				configuracion.getConfigurado_por().setConfiguracion(null);
			}
			
			try {
				session.delete(configuracion);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm_instagual.Configuracion configuracion) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().refresh(configuracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm_instagual.Configuracion configuracion) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().evict(configuracion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Configuracion loadConfiguracionByCriteria(ConfiguracionCriteria configuracionCriteria) {
		Configuracion[] configuracions = listConfiguracionByCriteria(configuracionCriteria);
		if(configuracions == null || configuracions.length == 0) {
			return null;
		}
		return configuracions[0];
	}
	
	public static Configuracion[] listConfiguracionByCriteria(ConfiguracionCriteria configuracionCriteria) {
		return configuracionCriteria.listConfiguracion();
	}
}
