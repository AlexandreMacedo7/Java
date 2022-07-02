import java.util.ArrayList;
import java.util.List;

public class Ex_PrintServer<T> {//TIPO T = Transformando a classe tipo generico

    List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }
    public T first(){

        if(list.isEmpty()){//Verificação se a lista esta vazia
            throw new IllegalStateException("List is empty! ");
        }
        return list.get(0);
    }
    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){//Se a lista não estiver vazia
            System.out.print(list.get(0));//imprimir posição 0
        }
        for (int i = 1; i < list.size(); i++){//Enquanto i for menor que o tamanho da lista
            System.out.print(", " + list.get(i));//Lista posição do valor de i
        }
        System.out.println("]");
    }
}
