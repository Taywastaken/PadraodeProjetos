public class FactoryPessoa {
    private static FactoryPessoa factory = null;
    public static FactoryPessoa getFactory() {
        if(factory == null){
            factory = new FactoryPessoa();
        }
        return factory;
    }

    public Pessoa getPessoa(String nome, String sexo){
        switch(sexo){
            case "M":
                return new Homem(nome);
            case "F":
                return new Mulher(nome);
            default:
                return null;
        }
    }
}