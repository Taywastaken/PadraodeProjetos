public class TestePessoa {
    public static void main(String[] args) {
        FactoryPessoa factory = FactoryPessoa.getFactory();
        factory.getPessoa("Tayton", "M");
        factory.getPessoa("Julia", "F");
    }
}