package modelo;

import java.util.List;

public class ApiDB {
	
	
	DB platos;
	
	public ApiDB(DB arg0) {
		
		platos = arg0;
	}
	
	public void add( Plato arg0) {
		this.platos.add(arg0);
	}
	
	public List<Plato> get() {
		return this.platos.get();
	}
	

}
