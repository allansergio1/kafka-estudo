package br.com.api1.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MensagemProducer {

    @Value("${topico.request.api}")
    private String topico;
    private ObjectMapper objectMapper;
    private KafkaTemplate<String, String> kafkaTemplate;
    private int contador = 0;

    public MensagemProducer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public String sendMessage(Mensagem mensagem) throws JsonProcessingException {
        String orderAsMessage = objectMapper.writeValueAsString(mensagem);
        kafkaTemplate.send(topico, orderAsMessage);
        log.info("Mensagem enviada para o tópico {}: {}", topico, orderAsMessage);
        return "Mensagem enviada";
    }

    @Scheduled(fixedRate = 5000)
    public void sendMessage() throws JsonProcessingException {
        Mensagem mensagem = new Mensagem("Mensagem " + contador, "ENVIADA");
        String orderAsMessage = objectMapper.writeValueAsString(mensagem);
        kafkaTemplate.send(topico, orderAsMessage);
        log.info("Mensagem enviada para o tópico {}: {}", topico, orderAsMessage);
        contador++;
    }
}

