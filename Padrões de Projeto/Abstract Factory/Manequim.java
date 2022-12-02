public class Manequim {
    InterfaceTronco tronco;
    InterfacePernas pernas;
    InterfaceCabeca cabeca;

    public Manequim() {
        System.out.println("\nCriando manequim sem roupa");
    }

    
    public void colocarRoupa(FactoryTraje factory) {
        System.out.println("\nColocando roupa no manequim");
        this.cabeca = factory.criarRoupaCabeca();
        this.tronco = factory.criarRoupaTronco();
        this.pernas = factory.criarRoupaPernas();
    }

    
    public void mostraRoupa() {
        System.out.println("Cabeca:  " + this.cabeca);
        System.out.println("Tronco: " + this.tronco);
        System.out.println("Pernas: " + this.pernas);
    }

}