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

public class PublicacionDAO {
	public static Publicacion loadPublicacionByORMID(int idPublicacion) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadPublicacionByORMID(session, idPublicacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(int idPublicacion) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getPublicacionByORMID(session, idPublicacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(int idPublicacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadPublicacionByORMID(session, idPublicacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(int idPublicacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getPublicacionByORMID(session, idPublicacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(PersistentSession session, int idPublicacion) throws PersistentException {
		try {
			return (Publicacion) session.load(orm_instagual.Publicacion.class, new Integer(idPublicacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(PersistentSession session, int idPublicacion) throws PersistentException {
		try {
			return (Publicacion) session.get(orm_instagual.Publicacion.class, new Integer(idPublicacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByORMID(PersistentSession session, int idPublicacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Publicacion) session.load(orm_instagual.Publicacion.class, new Integer(idPublicacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion getPublicacionByORMID(PersistentSession session, int idPublicacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Publicacion) session.get(orm_instagual.Publicacion.class, new Integer(idPublicacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryPublicacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryPublicacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listPublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listPublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPublicacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Publicacion as Publicacion");
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
	
	public static List queryPublicacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Publicacion as Publicacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Publicacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPublicacion(session, condition, orderBy);
			return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion[] listPublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPublicacion(session, condition, orderBy, lockMode);
			return (Publicacion[]) list.toArray(new Publicacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadPublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadPublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Publicacion[] publicacions = listPublicacionByQuery(session, condition, orderBy);
		if (publicacions != null && publicacions.length > 0)
			return publicacions[0];
		else
			return null;
	}
	
	public static Publicacion loadPublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Publicacion[] publicacions = listPublicacionByQuery(session, condition, orderBy, lockMode);
		if (publicacions != null && publicacions.length > 0)
			return publicacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iteratePublicacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iteratePublicacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePublicacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Publicacion as Publicacion");
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
	
	public static java.util.Iterator iteratePublicacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Publicacion as Publicacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Publicacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion createPublicacion() {
		return new orm_instagual.Publicacion();
	}
	
	public static boolean save(orm_instagual.Publicacion publicacion) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().saveObject(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm_instagual.Publicacion publicacion) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().deleteObject(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Publicacion publicacion)throws PersistentException {
		try {
			orm_instagual.Usuario[] lLe_gusta_as = publicacion.le_gusta_a.toArray();
			for(int i = 0; i < lLe_gusta_as.length; i++) {
				lLe_gusta_as[i].da_me_gusta_a.remove(publicacion);
			}
			orm_instagual.Usuario[] lEtiqueta_as = publicacion.etiqueta_a.toArray();
			for(int i = 0; i < lEtiqueta_as.length; i++) {
				lEtiqueta_as[i].esta_etiquetado_en.remove(publicacion);
			}
			if (publicacion.getPertenece_a() != null) {
				publicacion.getPertenece_a().publica.remove(publicacion);
			}
			
			orm_instagual.Multimedia[] lContienes = publicacion.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].setEsta_en(null);
			}
			orm_instagual.Etiqueta[] lContiene_etiquetas = publicacion.contiene_etiqueta.toArray();
			for(int i = 0; i < lContiene_etiquetas.length; i++) {
				lContiene_etiquetas[i].aparece_en.remove(publicacion);
			}
			orm_instagual.Comentario[] lTienes = publicacion.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setComentario_aparece_en(null);
			}
			return delete(publicacion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Publicacion publicacion, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm_instagual.Usuario[] lLe_gusta_as = publicacion.le_gusta_a.toArray();
			for(int i = 0; i < lLe_gusta_as.length; i++) {
				lLe_gusta_as[i].da_me_gusta_a.remove(publicacion);
			}
			orm_instagual.Usuario[] lEtiqueta_as = publicacion.etiqueta_a.toArray();
			for(int i = 0; i < lEtiqueta_as.length; i++) {
				lEtiqueta_as[i].esta_etiquetado_en.remove(publicacion);
			}
			if (publicacion.getPertenece_a() != null) {
				publicacion.getPertenece_a().publica.remove(publicacion);
			}
			
			orm_instagual.Multimedia[] lContienes = publicacion.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].setEsta_en(null);
			}
			orm_instagual.Etiqueta[] lContiene_etiquetas = publicacion.contiene_etiqueta.toArray();
			for(int i = 0; i < lContiene_etiquetas.length; i++) {
				lContiene_etiquetas[i].aparece_en.remove(publicacion);
			}
			orm_instagual.Comentario[] lTienes = publicacion.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setComentario_aparece_en(null);
			}
			try {
				session.delete(publicacion);
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
	
	public static boolean refresh(orm_instagual.Publicacion publicacion) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().refresh(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm_instagual.Publicacion publicacion) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().evict(publicacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Publicacion loadPublicacionByCriteria(PublicacionCriteria publicacionCriteria) {
		Publicacion[] publicacions = listPublicacionByCriteria(publicacionCriteria);
		if(publicacions == null || publicacions.length == 0) {
			return null;
		}
		return publicacions[0];
	}
	
	public static Publicacion[] listPublicacionByCriteria(PublicacionCriteria publicacionCriteria) {
		return publicacionCriteria.listPublicacion();
	}
}
