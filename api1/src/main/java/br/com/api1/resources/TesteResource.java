package br.com.api1.resources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
@Slf4j
public class TesteResource {

    @GetMapping
    public ResponseEntity<String> getTesteApi1() {
        log.info("Endpoint /teste da API 1 foi chamado");
        return ResponseEntity.ok("Endpoint funcionando na API 1");
    }
}
