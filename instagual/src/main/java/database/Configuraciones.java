package database;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import orm_instagual.Configuracion;

public class Configuraciones {
	public Vector<Configuracion> _cont_conf = new Vector<Configuracion>();
	public BD_Principal _c_bd_conf;

	public static void NotificarMeGusta(int aIdUsuario, boolean aValue) throws PersistentException {
		PersistentTransaction t =  orm_instagual.A11ModeladoPersistentManager.instance().getSession().beginTransaction();
		Configuracion conf = orm_instagual.ConfiguracionDAO.createConfiguracion();

		/*Cliente cl = citas.ClienteDAO.createCliente();
		cl.setNombre(Nombre);
		cl.setDireccion(Direccion);
		cl.setTelefono(Telefono);
		citas.ClienteDAO.save(cl);
		id_cliente = cl.getORMID();
		t.commit();*/
		throw new UnsupportedOperationException();
	}

	public void NotificarComentarios(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void NotificarSeguimiento(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void NotificarSolicitudes(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void CuentaPrivada(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}

	public void MostrarSeguidores(int aIdUsuario, boolean aValue) {
		throw new UnsupportedOperationException();
	}
}