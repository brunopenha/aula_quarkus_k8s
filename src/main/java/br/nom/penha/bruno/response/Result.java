package br.nom.penha.bruno.response;

import jakarta.validation.ConstraintViolation;

import java.util.Set;
import java.util.stream.Collectors;

public class Result {
    private String message;
    private boolean success;

    public Result(String message) {
        this.message = message;
        this.success = true;
    }

    /**
     * Validation from Hibernate
     * @param validationErrors
     */
    public Result(Set<? extends ConstraintViolation<?>> validationErrors) {
        success = false;
        message = validationErrors.stream()
                .map(error -> error.getMessage())
                .collect(Collectors.joining(", "));
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }

}
