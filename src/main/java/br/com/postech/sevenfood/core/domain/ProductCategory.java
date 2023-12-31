package br.com.postech.sevenfood.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Tag(name = "Resident object")
public class ProductCategory implements Serializable {
    private Long id;
    private String name;

    public void update(Long id, ProductCategory product) {
        this.id = id;
        this.name = product.getName();
    }
}
