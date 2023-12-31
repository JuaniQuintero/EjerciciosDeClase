package modeloVistaControlador;

public class Controlador {
	private Modelo modelo;
	private Vista vista;
	
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}


	public void obtenerYMostrarClientes() {
		vista.mostrarClientes(modelo.obtenerDatosClientes());
        modelo.cerrarConexion();
	}

}
