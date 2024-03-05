package br.com.alurafood.pedidos.amqp;

import br.com.alurafood.pedidos.dto.PagamentoDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {

    @RabbitListener(queues = "pagamentos.detalhes-pedido")
    public  void recebendoMensagem(PagamentoDto pagamento){
        System.out.println(pagamento.getId());
        System.out.println(pagamento.getNumero());

        if (pagamento.getNumero().equals("0000")) {
            throw new RuntimeException("não consegui processar");
        }

        String mensagem = """
                Dados do pagamento: %s
                Número do Pedido: %s
                Valor: R$ %s
                Status: %s
                """.formatted(pagamento.getId(), pagamento.getPedidoId(), pagamento.getValor(), pagamento.getStatus());

        System.out.println("Recebi a mensagem " + mensagem.toString());
    }
}
