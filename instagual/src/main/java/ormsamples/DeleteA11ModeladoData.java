/**
 * Licensee: sergio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteA11ModeladoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm_instagual.A11ModeladoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm_instagual.Usuario oRM_instagualUsuario = orm_instagual.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			orm_instagual.UsuarioDAO.delete(oRM_instagualUsuario);
			orm_instagual.Publicacion oRM_instagualPublicacion = orm_instagual.PublicacionDAO.loadPublicacionByQuery(null, null);
			// Delete the persistent object
			orm_instagual.PublicacionDAO.delete(oRM_instagualPublicacion);
			orm_instagual.Multimedia oRM_instagualMultimedia = orm_instagual.MultimediaDAO.loadMultimediaByQuery(null, null);
			// Delete the persistent object
			orm_instagual.MultimediaDAO.delete(oRM_instagualMultimedia);
			orm_instagual.Comentario oRM_instagualComentario = orm_instagual.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			orm_instagual.ComentarioDAO.delete(oRM_instagualComentario);
			orm_instagual.Etiqueta oRM_instagualEtiqueta = orm_instagual.EtiquetaDAO.loadEtiquetaByQuery(null, null);
			// Delete the persistent object
			orm_instagual.EtiquetaDAO.delete(oRM_instagualEtiqueta);
			orm_instagual.Configuracion oRM_instagualConfiguracion = orm_instagual.ConfiguracionDAO.loadConfiguracionByQuery(null, null);
			// Delete the persistent object
			orm_instagual.ConfiguracionDAO.delete(oRM_instagualConfiguracion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteA11ModeladoData deleteA11ModeladoData = new DeleteA11ModeladoData();
			try {
				deleteA11ModeladoData.deleteTestData();
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
