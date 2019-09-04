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

public class MultimediaDAO {
	public static Multimedia loadMultimediaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadMultimediaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia getMultimediaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getMultimediaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadMultimediaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia getMultimediaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getMultimediaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Multimedia) session.load(orm_instagual.Multimedia.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia getMultimediaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Multimedia) session.get(orm_instagual.Multimedia.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Multimedia) session.load(orm_instagual.Multimedia.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia getMultimediaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Multimedia) session.get(orm_instagual.Multimedia.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMultimedia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryMultimedia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMultimedia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryMultimedia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia[] listMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia[] listMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMultimedia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Multimedia as Multimedia");
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
	
	public static List queryMultimedia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Multimedia as Multimedia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Multimedia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia[] listMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMultimedia(session, condition, orderBy);
			return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia[] listMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMultimedia(session, condition, orderBy, lockMode);
			return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Multimedia[] multimedias = listMultimediaByQuery(session, condition, orderBy);
		if (multimedias != null && multimedias.length > 0)
			return multimedias[0];
		else
			return null;
	}
	
	public static Multimedia loadMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Multimedia[] multimedias = listMultimediaByQuery(session, condition, orderBy, lockMode);
		if (multimedias != null && multimedias.length > 0)
			return multimedias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMultimediaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iterateMultimediaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMultimediaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iterateMultimediaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMultimediaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Multimedia as Multimedia");
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
	
	public static java.util.Iterator iterateMultimediaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Multimedia as Multimedia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Multimedia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia createMultimedia() {
		return new orm_instagual.Multimedia();
	}
	
	public static boolean save(orm_instagual.Multimedia multimedia) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().saveObject(multimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm_instagual.Multimedia multimedia) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().deleteObject(multimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Multimedia multimedia)throws PersistentException {
		try {
			if (multimedia.getEsta_en() != null) {
				multimedia.getEsta_en().contiene.remove(multimedia);
			}
			
			return delete(multimedia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Multimedia multimedia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (multimedia.getEsta_en() != null) {
				multimedia.getEsta_en().contiene.remove(multimedia);
			}
			
			try {
				session.delete(multimedia);
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
	
	public static boolean refresh(orm_instagual.Multimedia multimedia) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().refresh(multimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm_instagual.Multimedia multimedia) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().evict(multimedia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Multimedia loadMultimediaByCriteria(MultimediaCriteria multimediaCriteria) {
		Multimedia[] multimedias = listMultimediaByCriteria(multimediaCriteria);
		if(multimedias == null || multimedias.length == 0) {
			return null;
		}
		return multimedias[0];
	}
	
	public static Multimedia[] listMultimediaByCriteria(MultimediaCriteria multimediaCriteria) {
		return multimediaCriteria.listMultimedia();
	}
}
