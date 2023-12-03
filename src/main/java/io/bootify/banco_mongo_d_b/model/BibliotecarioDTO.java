package io.bootify.banco_mongo_d_b.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BibliotecarioDTO {

    private Long id;

    @Size(max = 255)
    private String nombre;

    @NotNull
    @Size(max = 255)
    private String zona;


    @NotNull
    @Size(max = 255)
    private String apellido;

}
