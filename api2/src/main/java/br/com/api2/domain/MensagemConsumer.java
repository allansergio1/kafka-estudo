package br.com.api2.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MensagemConsumer {

    @KafkaListener(topics = "${topico.request.api}")
    public void consumeMessage(String payload) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Mensagem mensagem = mapper.readValue(payload, Mensagem.class);
        log.info("Mensagem recebida: " + mensagem.toString());
    }
}
