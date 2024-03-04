package br.com.alurafood.pagamentos.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PagamentoAMQPConfiguration {

    @Bean
    public Queue criaFila() {
        return QueueBuilder.nonDurable("pagamento.concluido").build();
    }

    @Bean
    public RabbitAdmin criaAdmin(ConnectionFactory conn){
        return new RabbitAdmin(conn);
    }

    @Bean
    public ApplicationListener<ApplicationReadyEvent>  inicializacao(RabbitAdmin admin){
        return event -> admin.initialize();
    }
}
