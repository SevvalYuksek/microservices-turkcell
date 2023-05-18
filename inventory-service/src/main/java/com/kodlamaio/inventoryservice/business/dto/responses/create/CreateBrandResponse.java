package com.kodlamaio.inventoryservice.business.dto.responses.create;

import com.kodlamaio.inventoryservice.enums.State;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
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
public class CreateBrandResponse {

    private UUID id;
    private String name;
}

