package br.nom.penha.bruno.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class OurPrincipalProduct {


    private Long id;

    @NotBlank(message = "Description field can not be empty")
    private String description;

    @NotBlank(message = "Label field can not be empty")
    private String label;

    @Min(message = "Quantity can not be zero", value = 1)
    private Integer quantity;

    @Min(message = "Price have to be higher than zero", value = 1)
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
