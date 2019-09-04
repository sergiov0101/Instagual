/**
 * Licensee: sergio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateA11ModeladoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm_instagual.A11ModeladoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm_instagual.Usuario oRM_instagualUsuario = orm_instagual.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			orm_instagual.UsuarioDAO.save(oRM_instagualUsuario);
			orm_instagual.Publicacion oRM_instagualPublicacion = orm_instagual.PublicacionDAO.loadPublicacionByQuery(null, null);
			// Update the properties of the persistent object
			orm_instagual.PublicacionDAO.save(oRM_instagualPublicacion);
			orm_instagual.Multimedia oRM_instagualMultimedia = orm_instagual.MultimediaDAO.loadMultimediaByQuery(null, null);
			// Update the properties of the persistent object
			orm_instagual.MultimediaDAO.save(oRM_instagualMultimedia);
			orm_instagual.Comentario oRM_instagualComentario = orm_instagual.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			orm_instagual.ComentarioDAO.save(oRM_instagualComentario);
			orm_instagual.Etiqueta oRM_instagualEtiqueta = orm_instagual.EtiquetaDAO.loadEtiquetaByQuery(null, null);
			// Update the properties of the persistent object
			orm_instagual.EtiquetaDAO.save(oRM_instagualEtiqueta);
			orm_instagual.Configuracion oRM_instagualConfiguracion = orm_instagual.ConfiguracionDAO.loadConfiguracionByQuery(null, null);
			// Update the properties of the persistent object
			orm_instagual.ConfiguracionDAO.save(oRM_instagualConfiguracion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		orm_instagual.UsuarioCriteria oRM_instagualUsuarioCriteria = new orm_instagual.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRM_instagualUsuarioCriteria.idUsuario.eq();
		System.out.println(oRM_instagualUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Publicacion by PublicacionCriteria");
		orm_instagual.PublicacionCriteria oRM_instagualPublicacionCriteria = new orm_instagual.PublicacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRM_instagualPublicacionCriteria.idPublicacion.eq();
		System.out.println(oRM_instagualPublicacionCriteria.uniquePublicacion());
		
		System.out.println("Retrieving Multimedia by MultimediaCriteria");
		orm_instagual.MultimediaCriteria oRM_instagualMultimediaCriteria = new orm_instagual.MultimediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRM_instagualMultimediaCriteria.ID.eq();
		System.out.println(oRM_instagualMultimediaCriteria.uniqueMultimedia());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		orm_instagual.ComentarioCriteria oRM_instagualComentarioCriteria = new orm_instagual.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRM_instagualComentarioCriteria.idComentario.eq();
		System.out.println(oRM_instagualComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Etiqueta by EtiquetaCriteria");
		orm_instagual.EtiquetaCriteria oRM_instagualEtiquetaCriteria = new orm_instagual.EtiquetaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRM_instagualEtiquetaCriteria.ID.eq();
		System.out.println(oRM_instagualEtiquetaCriteria.uniqueEtiqueta());
		
		System.out.println("Retrieving Configuracion by ConfiguracionCriteria");
		orm_instagual.ConfiguracionCriteria oRM_instagualConfiguracionCriteria = new orm_instagual.ConfiguracionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRM_instagualConfiguracionCriteria.idConfiguracion.eq();
		System.out.println(oRM_instagualConfiguracionCriteria.uniqueConfiguracion());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateA11ModeladoData retrieveAndUpdateA11ModeladoData = new RetrieveAndUpdateA11ModeladoData();
			try {
				retrieveAndUpdateA11ModeladoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateA11ModeladoData.retrieveByCriteria();
			}
			finally {
				orm_instagual.A11ModeladoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
