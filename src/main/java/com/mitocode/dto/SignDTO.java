package com.mitocode.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SignDTO {

    @EqualsAndHashCode.Include
    private Integer idSign;

    @NotNull
    private PatientDTO patient;

    @NotNull
    private LocalDateTime signDate;

    @NotNull
    @NotEmpty
    @Size(max = 5, message = "La temperatura debe ser de máximo 5 caracteres")
    private String temperature;

    @NotNull
    @NotEmpty
    @Size(max = 3, message = "La temperatura debe ser de máximo 3 caracteres")
    private String pulse;

    @NotNull
    @NotEmpty
    @Size(max = 3, message = "La temperatura debe ser de máximo 3 caracteres")
    private String heartRate;
}
