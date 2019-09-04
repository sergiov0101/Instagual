/**
 * Licensee: sergio(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateA11ModeladoDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(orm_instagual.A11ModeladoPersistentManager.instance());
			orm_instagual.A11ModeladoPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
