package br.nom.penha.bruno.resource;

import br.nom.penha.bruno.dto.OurPrincipalProduct;
import br.nom.penha.bruno.response.Result;
import jakarta.inject.Inject;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.Set;

@Path("/product")
public class OurProductResource {

    @Inject
    Validator validator;

    @POST
    public Result addProduct(@Valid OurPrincipalProduct product){

        return new Result("Product added");

    }

    @Path("/add")
    @POST
    public Result addProductWithBodyValidation(OurPrincipalProduct product){

        Set<ConstraintViolation<OurPrincipalProduct>> errors = validator.validate(product);
        if(errors.isEmpty()){
            return new Result("Product added");
        }
        return new Result(errors);

    }
}
