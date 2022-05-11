import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();//Instanciação da lista;

        //Adicionando Dados;
        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add(2, "Marcos");//Adicionar em posição dois;

        for(String x:lista) {
            System.out.println(x);//imprima todo objeto string
        }

        System.out.println("-----------------------------");
        System.out.println("Tamanho da Lista: " + lista.size());//Tamanho da Lista;

        //Remover Dados
        System.out.println();
        System.out.println("REMOVER: \nPosição 1: " + lista.get(1) + "\nRemover: Nome Anna");
        System.out.println("Letra M na posição 0.");
        System.out.println();
        //lista.remove(1);//posição 1
        //lista.remove("Anna");//Anna
        lista.removeIf(x-> x.charAt(0) == 'M');
        //X tal que x posição 0
        //Remova da lista todo char que tiver na posiçaõ 0 um 'M'

        for(String x:lista) {
            System.out.println(x);//imprima todo objeto string
        }

        System.out.println("-----------------------------");
        System.out.println("Tamnaho da lista: " + lista.size());

        System.out.println();
        System.out.println("POSIÇÃO");

        System.out.println();
        System.out.println("Bob - Posição: " + lista.indexOf("Bob"));
        System.out.println("Mario** - (Nome não existe na lista), retorna: "+ lista.indexOf("Mario"));

        System.out.println();
        System.out.println("Filtro de lista: ");

        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        //Nova Lista que usa stream/filter(condição) e depois a coleta de volta para uma lista;

        for(String x: resultado){
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        System.out.println("Tamnaho da lista Filtro: " + resultado.size());

        System.out.println();
        System.out.println("Encontrar o primeiro elemento com a letra 'A': ");

        String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        //Varivale nome = lista/stream/filtro(condição)/primeiro elemento/ se não volta nulo.
        System.out.println(nome);
    }
}
