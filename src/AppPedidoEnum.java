import java.util.Date;

public class AppPedidoEnum {
    public static void main(String[] args) {

        //intanciando o pedido = usando valor, data atual e o status.
        EntPedidoEnum pedido = new EntPedidoEnum(1080, new Date(), StatusPedidoEnum.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido);

        StatusPedidoEnum os1 = StatusPedidoEnum.ENTREGUE;
        StatusPedidoEnum os2 = StatusPedidoEnum.valueOf("ENTREGUE");//passando como String

        System.out.println(os1);
        System.out.println(os2);
    }
}
