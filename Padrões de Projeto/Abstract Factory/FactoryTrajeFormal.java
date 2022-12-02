public class FactoryTrajeFormal extends FactoryTraje {
    private static FactoryTraje factory = null;
    public static FactoryTraje getFactory() {
        if(factory == null){
            factory = new FactoryTrajeFormal();
        }
        return factory;
    }
    @Override
    public InterfaceTronco criarRoupaTronco() {
        return new Camisa();
    }
    @Override
    public InterfaceCabeca criarRoupaCabeca() {
        return new Chapeu();
    }
    @Override
    public InterfacePernas criarRoupaPernas() {
        return new Calca();
    }
}