package com.valderez.br.marketplace_lojas.domain.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clients {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String cpf;
}
