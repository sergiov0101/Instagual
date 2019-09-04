/**
 * Licensee: sergio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateA11ModeladoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm_instagual.A11ModeladoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm_instagual.Usuario oRM_instagualUsuario = orm_instagual.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : da_me_gusta_a_coment, comenta, es_bloqueado_por, publica, esta_etiquetado_en, da_me_gusta_a, sigue_a, bloquea_a, es_seguidor_de, edad, configuracion
			orm_instagual.UsuarioDAO.save(oRM_instagualUsuario);
			orm_instagual.Publicacion oRM_instagualPublicacion = orm_instagual.PublicacionDAO.createPublicacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene, contiene_etiqueta, contiene, pertenece_a, etiqueta_a, le_gusta_a
			orm_instagual.PublicacionDAO.save(oRM_instagualPublicacion);
			orm_instagual.Multimedia oRM_instagualMultimedia = orm_instagual.MultimediaDAO.createMultimedia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : duracion, size, Esta_en
			orm_instagual.MultimediaDAO.save(oRM_instagualMultimedia);
			orm_instagual.Comentario oRM_instagualComentario = orm_instagual.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : le_gusta_a, comentario_aparece_en, pertenece_a_usuario
			orm_instagual.ComentarioDAO.save(oRM_instagualComentario);
			orm_instagual.Etiqueta oRM_instagualEtiqueta = orm_instagual.EtiquetaDAO.createEtiqueta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : aparece_en
			orm_instagual.EtiquetaDAO.save(oRM_instagualEtiqueta);
			orm_instagual.Configuracion oRM_instagualConfiguracion = orm_instagual.ConfiguracionDAO.createConfiguracion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : configurado_por, mostrarSeguidores, cuentaPrivada, notificarSolicitud, notificarSeguimiento, notificarComentario, notificarMeGustab
			orm_instagual.ConfiguracionDAO.save(oRM_instagualConfiguracion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateA11ModeladoData createA11ModeladoData = new CreateA11ModeladoData();
			try {
				createA11ModeladoData.createTestData();
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
