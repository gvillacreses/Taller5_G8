public class TareaSimpleFactory extends TareaFactory{
    @Override
    public Tarea crearTarea(){
        return new TareaSimple();
    }
}
