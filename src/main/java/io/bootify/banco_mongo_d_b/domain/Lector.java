package io.bootify.banco_mongo_d_b.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("lectors")
@Getter
@Setter
public class Lector extends Biblioteca {

    @NotNull
    @Size(max = 255)
    private String apellido;

}
