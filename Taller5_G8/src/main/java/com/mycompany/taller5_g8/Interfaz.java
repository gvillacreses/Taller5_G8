public class Interfaz {

    protected CentroControl centroControl;
    protected TareaFactory tareaFactory;
    protected PreferenciaVisualizacion preferenciaVisualizacion;

    public Interfaz(){
        this.centroControl = new CentroControl();
        this.tareaFactory = new TareaFactory();
        this.preferenciaVisualizacion = new PreferenciaVisualizacion();
    }
    
}