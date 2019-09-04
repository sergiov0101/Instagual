/**
 * Licensee: sergio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListA11ModeladoData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		orm_instagual.Usuario[] oRM_instagualUsuarios = orm_instagual.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(oRM_instagualUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRM_instagualUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Publicacion...");
		orm_instagual.Publicacion[] oRM_instagualPublicacions = orm_instagual.PublicacionDAO.listPublicacionByQuery(null, null);
		length = Math.min(oRM_instagualPublicacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRM_instagualPublicacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Multimedia...");
		orm_instagual.Multimedia[] oRM_instagualMultimedias = orm_instagual.MultimediaDAO.listMultimediaByQuery(null, null);
		length = Math.min(oRM_instagualMultimedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRM_instagualMultimedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		orm_instagual.Comentario[] oRM_instagualComentarios = orm_instagual.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(oRM_instagualComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRM_instagualComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Etiqueta...");
		orm_instagual.Etiqueta[] oRM_instagualEtiquetas = orm_instagual.EtiquetaDAO.listEtiquetaByQuery(null, null);
		length = Math.min(oRM_instagualEtiquetas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRM_instagualEtiquetas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Configuracion...");
		orm_instagual.Configuracion[] oRM_instagualConfiguracions = orm_instagual.ConfiguracionDAO.listConfiguracionByQuery(null, null);
		length = Math.min(oRM_instagualConfiguracions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRM_instagualConfiguracions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario by Criteria...");
		orm_instagual.UsuarioCriteria oRM_instagualUsuarioCriteria = new orm_instagual.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRM_instagualUsuarioCriteria.idUsuario.eq();
		oRM_instagualUsuarioCriteria.setMaxResults(ROW_COUNT);
		orm_instagual.Usuario[] oRM_instagualUsuarios = oRM_instagualUsuarioCriteria.listUsuario();
		int length =oRM_instagualUsuarios== null ? 0 : Math.min(oRM_instagualUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRM_instagualUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Publicacion by Criteria...");
		orm_instagual.PublicacionCriteria oRM_instagualPublicacionCriteria = new orm_instagual.PublicacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRM_instagualPublicacionCriteria.idPublicacion.eq();
		oRM_instagualPublicacionCriteria.setMaxResults(ROW_COUNT);
		orm_instagual.Publicacion[] oRM_instagualPublicacions = oRM_instagualPublicacionCriteria.listPublicacion();
		length =oRM_instagualPublicacions== null ? 0 : Math.min(oRM_instagualPublicacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRM_instagualPublicacions[i]);
		}
		System.out.println(length + " Publicacion record(s) retrieved."); 
		
		System.out.println("Listing Multimedia by Criteria...");
		orm_instagual.MultimediaCriteria oRM_instagualMultimediaCriteria = new orm_instagual.MultimediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRM_instagualMultimediaCriteria.ID.eq();
		oRM_instagualMultimediaCriteria.setMaxResults(ROW_COUNT);
		orm_instagual.Multimedia[] oRM_instagualMultimedias = oRM_instagualMultimediaCriteria.listMultimedia();
		length =oRM_instagualMultimedias== null ? 0 : Math.min(oRM_instagualMultimedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRM_instagualMultimedias[i]);
		}
		System.out.println(length + " Multimedia record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		orm_instagual.ComentarioCriteria oRM_instagualComentarioCriteria = new orm_instagual.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRM_instagualComentarioCriteria.idComentario.eq();
		oRM_instagualComentarioCriteria.setMaxResults(ROW_COUNT);
		orm_instagual.Comentario[] oRM_instagualComentarios = oRM_instagualComentarioCriteria.listComentario();
		length =oRM_instagualComentarios== null ? 0 : Math.min(oRM_instagualComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRM_instagualComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Etiqueta by Criteria...");
		orm_instagual.EtiquetaCriteria oRM_instagualEtiquetaCriteria = new orm_instagual.EtiquetaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRM_instagualEtiquetaCriteria.ID.eq();
		oRM_instagualEtiquetaCriteria.setMaxResults(ROW_COUNT);
		orm_instagual.Etiqueta[] oRM_instagualEtiquetas = oRM_instagualEtiquetaCriteria.listEtiqueta();
		length =oRM_instagualEtiquetas== null ? 0 : Math.min(oRM_instagualEtiquetas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRM_instagualEtiquetas[i]);
		}
		System.out.println(length + " Etiqueta record(s) retrieved."); 
		
		System.out.println("Listing Configuracion by Criteria...");
		orm_instagual.ConfiguracionCriteria oRM_instagualConfiguracionCriteria = new orm_instagual.ConfiguracionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRM_instagualConfiguracionCriteria.idConfiguracion.eq();
		oRM_instagualConfiguracionCriteria.setMaxResults(ROW_COUNT);
		orm_instagual.Configuracion[] oRM_instagualConfiguracions = oRM_instagualConfiguracionCriteria.listConfiguracion();
		length =oRM_instagualConfiguracions== null ? 0 : Math.min(oRM_instagualConfiguracions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRM_instagualConfiguracions[i]);
		}
		System.out.println(length + " Configuracion record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListA11ModeladoData listA11ModeladoData = new ListA11ModeladoData();
			try {
				listA11ModeladoData.listTestData();
				//listA11ModeladoData.listByCriteria();
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
