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

public class EtiquetaDAO {
	public static Etiqueta loadEtiquetaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadEtiquetaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta getEtiquetaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getEtiquetaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta loadEtiquetaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadEtiquetaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta getEtiquetaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getEtiquetaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta loadEtiquetaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Etiqueta) session.load(orm_instagual.Etiqueta.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta getEtiquetaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Etiqueta) session.get(orm_instagual.Etiqueta.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta loadEtiquetaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Etiqueta) session.load(orm_instagual.Etiqueta.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta getEtiquetaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Etiqueta) session.get(orm_instagual.Etiqueta.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEtiqueta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryEtiqueta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEtiqueta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryEtiqueta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta[] listEtiquetaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listEtiquetaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta[] listEtiquetaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listEtiquetaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEtiqueta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Etiqueta as Etiqueta");
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
	
	public static List queryEtiqueta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Etiqueta as Etiqueta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Etiqueta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta[] listEtiquetaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEtiqueta(session, condition, orderBy);
			return (Etiqueta[]) list.toArray(new Etiqueta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta[] listEtiquetaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEtiqueta(session, condition, orderBy, lockMode);
			return (Etiqueta[]) list.toArray(new Etiqueta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta loadEtiquetaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadEtiquetaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta loadEtiquetaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadEtiquetaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta loadEtiquetaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Etiqueta[] etiquetas = listEtiquetaByQuery(session, condition, orderBy);
		if (etiquetas != null && etiquetas.length > 0)
			return etiquetas[0];
		else
			return null;
	}
	
	public static Etiqueta loadEtiquetaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Etiqueta[] etiquetas = listEtiquetaByQuery(session, condition, orderBy, lockMode);
		if (etiquetas != null && etiquetas.length > 0)
			return etiquetas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEtiquetaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iterateEtiquetaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEtiquetaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iterateEtiquetaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEtiquetaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Etiqueta as Etiqueta");
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
	
	public static java.util.Iterator iterateEtiquetaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Etiqueta as Etiqueta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Etiqueta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta createEtiqueta() {
		return new orm_instagual.Etiqueta();
	}
	
	public static boolean save(orm_instagual.Etiqueta etiqueta) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().saveObject(etiqueta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm_instagual.Etiqueta etiqueta) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().deleteObject(etiqueta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Etiqueta etiqueta)throws PersistentException {
		try {
			orm_instagual.Publicacion[] lAparece_ens = etiqueta.aparece_en.toArray();
			for(int i = 0; i < lAparece_ens.length; i++) {
				lAparece_ens[i].contiene_etiqueta.remove(etiqueta);
			}
			return delete(etiqueta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Etiqueta etiqueta, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm_instagual.Publicacion[] lAparece_ens = etiqueta.aparece_en.toArray();
			for(int i = 0; i < lAparece_ens.length; i++) {
				lAparece_ens[i].contiene_etiqueta.remove(etiqueta);
			}
			try {
				session.delete(etiqueta);
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
	
	public static boolean refresh(orm_instagual.Etiqueta etiqueta) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().refresh(etiqueta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm_instagual.Etiqueta etiqueta) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().evict(etiqueta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Etiqueta loadEtiquetaByCriteria(EtiquetaCriteria etiquetaCriteria) {
		Etiqueta[] etiquetas = listEtiquetaByCriteria(etiquetaCriteria);
		if(etiquetas == null || etiquetas.length == 0) {
			return null;
		}
		return etiquetas[0];
	}
	
	public static Etiqueta[] listEtiquetaByCriteria(EtiquetaCriteria etiquetaCriteria) {
		return etiquetaCriteria.listEtiqueta();
	}
}
