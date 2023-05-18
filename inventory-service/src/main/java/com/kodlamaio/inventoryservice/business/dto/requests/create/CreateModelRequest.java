package com.kodlamaio.inventoryservice.business.dto.requests.create;

import com.kodlamaio.inventoryservice.enums.State;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateModelRequest {
    @NotNull
    private UUID brandId;
    @NotBlank
    @Size(min = 2, max = 20)
    private String name;
}

