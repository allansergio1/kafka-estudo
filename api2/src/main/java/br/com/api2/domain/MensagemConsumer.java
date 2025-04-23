package br.com.api2.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MensagemConsumer {

    @KafkaListener(topics = "${topico.request.api}")
    public void consumeMessage(Mensagem mensagem) {
        log.info("Mensagem recebida=========\n" + mensagem.toString());
    }
}
