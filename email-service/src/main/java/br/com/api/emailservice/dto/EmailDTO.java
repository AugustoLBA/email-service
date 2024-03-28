package br.com.api.emailservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDTO {

    @NotBlank(message = "O email não pode ser nulo")
    @Email(message = "Formato do email invalido")
    private String to;

    @NotBlank(message = "O assunto do email não pode ser nulo")
    private String subject;

    @NotBlank(message = "O corpo do email não pode ser nulo")
    private String body;
}
