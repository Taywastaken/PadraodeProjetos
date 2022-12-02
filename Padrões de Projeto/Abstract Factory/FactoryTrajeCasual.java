public class FactoryTrajeCasual extends FactoryTraje {
    private static FactoryTraje factory = null;
    public static FactoryTraje getFactory() {
        if(factory == null){
            factory = new FactoryTrajeCasual();
        }
        return factory;
    }
    
    @Override
    public InterfaceCabeca criarRoupaCabeca() {
        return new Bone();
    }
    @Override
    public InterfacePernas criarRoupaPernas() {
        return new Bermuda();
    }
    @Override
    public InterfaceTronco criarRoupaTronco() {
        return new Camiseta();
    }
}