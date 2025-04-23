package br.com.api2.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mensagem {

    private Long id;
    private String descricao;
    private String status;
}
