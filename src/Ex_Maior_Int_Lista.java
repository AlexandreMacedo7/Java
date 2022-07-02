import java.security.InvalidParameterException;
import java.util.List;

public class Ex_CalculationService {

    public static Integer max(List<Integer> list){

        if(list.isEmpty()){
            throw new InvalidParameterException("Lista vazia! ");
        }

        //metodo para lista de inteiros
        Integer max = list.get(0);
        for (Integer item : list){
            if(item.compareTo(max) < 0){//o resultado de compareto for maior que zero, ou seja o item é maior que max, por numero positivos são sinal de maior
                max = item;//max recebe item
            }
        }
        return max;
    }
}
