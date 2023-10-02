package javaapplication61;

import java.util.logging.Logger;



public class ProxyLibro implements ILibro {

	private ILibro libroReal;
	
	public ProxyLibro(ILibro libroReal) {
		this.libroReal = libroReal;
	}

    @Override
    public String leer() {
        System.out.println("VErificando Credenciales");
        return this.libroReal.leer();
        
    }
	

}
