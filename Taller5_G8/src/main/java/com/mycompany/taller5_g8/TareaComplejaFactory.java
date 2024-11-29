public class TareaComplejaFactory extends TareaFactory {
    @Override
    public Tarea crearTarea(){
        return new TareaCompleja();
    }
}
