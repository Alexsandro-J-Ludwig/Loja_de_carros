package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Carros {
    private List<String> carros = new ArrayList<>();

    public List<String> getCarros() {
        return carros;
    }

    public void setCarros(List<String> carros) {
        this.carros = carros;
    }

    public void listarCarros(){
        for(String carro: carros){
            System.out.println(carro);
        }
    }

    public void addCarro(String carro) {
        System.out.println(carro+" adicionado com sucesso");
        carros.add(carro);
    }

    public void removeCarro(String carro) {
        System.out.println(carro+" removido com sucesso");
        carros.remove(carro);
    }

    public void substituirCarro(String carro, String troca) {
        System.out.println(carro+" substituido por "+troca+" com sucesso!");
        int index = carros.indexOf(carro);
        carros.remove(index);
        carros.add(index, troca);
    }
}
