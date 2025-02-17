package com.aprendendo.usuario.infrascture.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collation = "usuario_entity")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioEntity {

    @Id
    private String id;
    private String nome;
    private String email;
    private String document;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;

}
