package br.com.api2;

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
    public ResponseEntity<String> getTesteApi2() {
        log.info("Endpoint /teste da API 2 foi chamado");
        return ResponseEntity.ok("Endpoint funcionando na API 2");
    }
}
