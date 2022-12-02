public class Client {
    public static void main(String[] args) {
        FactoryTraje factory_casual = FactoryTraje.getFactory("Casual");
        FactoryTraje factory_formal = FactoryTraje.getFactory("Formal");
        Manequim manequim = new Manequim();
        manequim.colocarRoupa(factory_casual);
        manequim.mostraRoupa();
        manequim.colocarRoupa(factory_formal);
        manequim.mostraRoupa();
    }
}