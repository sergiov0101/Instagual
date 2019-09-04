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

public class UsuarioDAO {
	public static Usuario loadUsuarioByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int idUsuario) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getUsuarioByORMID(session, idUsuario);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return getUsuarioByORMID(session, idUsuario, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario) session.load(orm_instagual.Usuario.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int idUsuario) throws PersistentException {
		try {
			return (Usuario) session.get(orm_instagual.Usuario.class, new Integer(idUsuario));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.load(orm_instagual.Usuario.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int idUsuario, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.get(orm_instagual.Usuario.class, new Integer(idUsuario), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Usuario as Usuario");
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
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm_instagual.A11ModeladoPersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Usuario as Usuario");
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
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm_instagual.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario createUsuario() {
		return new orm_instagual.Usuario();
	}
	
	public static boolean save(orm_instagual.Usuario usuario) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().saveObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm_instagual.Usuario usuario) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().deleteObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Usuario usuario)throws PersistentException {
		try {
			if (usuario.getConfiguracion() != null) {
				usuario.getConfiguracion().setConfigurado_por(null);
			}
			
			orm_instagual.Usuario[] lEs_seguidor_des = usuario.es_seguidor_de.toArray();
			for(int i = 0; i < lEs_seguidor_des.length; i++) {
				lEs_seguidor_des[i].sigue_a.remove(usuario);
			}
			orm_instagual.Usuario[] lBloquea_as = usuario.bloquea_a.toArray();
			for(int i = 0; i < lBloquea_as.length; i++) {
				lBloquea_as[i].es_bloqueado_por.remove(usuario);
			}
			orm_instagual.Usuario[] lSigue_as = usuario.sigue_a.toArray();
			for(int i = 0; i < lSigue_as.length; i++) {
				lSigue_as[i].es_seguidor_de.remove(usuario);
			}
			orm_instagual.Publicacion[] lDa_me_gusta_as = usuario.da_me_gusta_a.toArray();
			for(int i = 0; i < lDa_me_gusta_as.length; i++) {
				lDa_me_gusta_as[i].le_gusta_a.remove(usuario);
			}
			orm_instagual.Publicacion[] lEsta_etiquetado_ens = usuario.esta_etiquetado_en.toArray();
			for(int i = 0; i < lEsta_etiquetado_ens.length; i++) {
				lEsta_etiquetado_ens[i].etiqueta_a.remove(usuario);
			}
			orm_instagual.Publicacion[] lPublicas = usuario.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setPertenece_a(null);
			}
			orm_instagual.Usuario[] lEs_bloqueado_pors = usuario.es_bloqueado_por.toArray();
			for(int i = 0; i < lEs_bloqueado_pors.length; i++) {
				lEs_bloqueado_pors[i].bloquea_a.remove(usuario);
			}
			orm_instagual.Comentario[] lComentas = usuario.comenta.toArray();
			for(int i = 0; i < lComentas.length; i++) {
				lComentas[i].setPertenece_a_usuario(null);
			}
			orm_instagual.Comentario[] lDa_me_gusta_a_coments = usuario.da_me_gusta_a_coment.toArray();
			for(int i = 0; i < lDa_me_gusta_a_coments.length; i++) {
				lDa_me_gusta_a_coments[i].le_gusta_a.remove(usuario);
			}
			return delete(usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm_instagual.Usuario usuario, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (usuario.getConfiguracion() != null) {
				usuario.getConfiguracion().setConfigurado_por(null);
			}
			
			orm_instagual.Usuario[] lEs_seguidor_des = usuario.es_seguidor_de.toArray();
			for(int i = 0; i < lEs_seguidor_des.length; i++) {
				lEs_seguidor_des[i].sigue_a.remove(usuario);
			}
			orm_instagual.Usuario[] lBloquea_as = usuario.bloquea_a.toArray();
			for(int i = 0; i < lBloquea_as.length; i++) {
				lBloquea_as[i].es_bloqueado_por.remove(usuario);
			}
			orm_instagual.Usuario[] lSigue_as = usuario.sigue_a.toArray();
			for(int i = 0; i < lSigue_as.length; i++) {
				lSigue_as[i].es_seguidor_de.remove(usuario);
			}
			orm_instagual.Publicacion[] lDa_me_gusta_as = usuario.da_me_gusta_a.toArray();
			for(int i = 0; i < lDa_me_gusta_as.length; i++) {
				lDa_me_gusta_as[i].le_gusta_a.remove(usuario);
			}
			orm_instagual.Publicacion[] lEsta_etiquetado_ens = usuario.esta_etiquetado_en.toArray();
			for(int i = 0; i < lEsta_etiquetado_ens.length; i++) {
				lEsta_etiquetado_ens[i].etiqueta_a.remove(usuario);
			}
			orm_instagual.Publicacion[] lPublicas = usuario.publica.toArray();
			for(int i = 0; i < lPublicas.length; i++) {
				lPublicas[i].setPertenece_a(null);
			}
			orm_instagual.Usuario[] lEs_bloqueado_pors = usuario.es_bloqueado_por.toArray();
			for(int i = 0; i < lEs_bloqueado_pors.length; i++) {
				lEs_bloqueado_pors[i].bloquea_a.remove(usuario);
			}
			orm_instagual.Comentario[] lComentas = usuario.comenta.toArray();
			for(int i = 0; i < lComentas.length; i++) {
				lComentas[i].setPertenece_a_usuario(null);
			}
			orm_instagual.Comentario[] lDa_me_gusta_a_coments = usuario.da_me_gusta_a_coment.toArray();
			for(int i = 0; i < lDa_me_gusta_a_coments.length; i++) {
				lDa_me_gusta_a_coments[i].le_gusta_a.remove(usuario);
			}
			try {
				session.delete(usuario);
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
	
	public static boolean refresh(orm_instagual.Usuario usuario) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().refresh(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm_instagual.Usuario usuario) throws PersistentException {
		try {
			orm_instagual.A11ModeladoPersistentManager.instance().getSession().evict(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
