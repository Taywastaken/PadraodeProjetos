public abstract class FactoryTraje {
    public static FactoryTraje getFactory(String tipo) {
        if (tipo.equals("casual")) {
            return FactoryTrajeCasual.getFactory();
        } else if (tipo.equals("formal")) {
            return FactoryTrajeFormal.getFactory();
        } else {
            return null;
        }
    }

    public abstract InterfaceTronco criarRoupaTronco();
    public abstract InterfacePernas criarRoupaPernas();
    public abstract InterfaceCabeca criarRoupaCabeca();
}