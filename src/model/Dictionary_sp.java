package model;

import java.util.ListResourceBundle;

public class Dictionary_sp extends ListResourceBundle{
	Object obj[][]= {
			{"username","nombre de usuario"},{"password","contraseņa"}
	};
	
	@Override
	protected Object[][] getContents() {
		return obj;
	}
	
}
