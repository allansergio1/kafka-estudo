package br.com.api1.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MensagemService {

    private final MensagemProducer mensagemProducer;

    public MensagemService(MensagemProducer mensagemProducer) {
        this.mensagemProducer = mensagemProducer;
    }

    public String criar(Mensagem mensagem) {
        try {
            return mensagemProducer.sendMessage(mensagem);
        } catch (JsonProcessingException e) {
            log.error("Erro ao enviar mensagem: {}", e.getMessage());
            return "Ocorreu um erro na request " + e.getMessage();
        }
    }
}
