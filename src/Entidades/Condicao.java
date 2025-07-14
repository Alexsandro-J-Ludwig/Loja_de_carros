package Entidades;

public enum Condicao {
    SIM("sim", "SIM", "s", "S"),
    NAO("nao", "NAO", "n", "N");

    private String[] condicional;

    Condicao(String... condicional){
        this.condicional = condicional;

    }

    public boolean matches(String input){
        if(input == null){
            return false;
        }
        for(String cond : condicional){
            if(cond.equals(input)){
                return true;
            }
        }
        return false;
    }

    public static Condicao fromString(String input){
        for(Condicao condicao : Condicao.values()){
            if(condicao.matches(input)){
                return condicao;
            }
        }
        throw new IllegalArgumentException("Valor inválido " +input);
    }
}
