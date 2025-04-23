package br.com.api1.controller;

import br.com.api1.domain.Mensagem;
import br.com.api1.domain.MensagemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    private final MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService) {
        this.mensagemService = mensagemService;
    }

    @PostMapping
    public String criar (@RequestBody Mensagem mensagem) {
        return mensagemService.criar(mensagem);
    }
}
