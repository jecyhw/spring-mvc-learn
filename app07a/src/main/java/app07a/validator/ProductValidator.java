package app07a.validator;

import app07a.domain.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Date;

/**
 * Created by jecyhw on 2016/6/20.
 */
public class ProductValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Product.class.isAssignableFrom(aClass);
    }

    public void validate(Object target, Errors errors) {
        Product product = (Product)target;
        ValidationUtils.rejectIfEmpty(errors, "name", "productname.required");
        ValidationUtils.rejectIfEmpty(errors, "price", "price.required");
        ValidationUtils.rejectIfEmpty(errors, "productionDate","productiondate.required" );
        Float price = product.getPrice();
        if (price != null && price < 0) {
            errors.rejectValue("price", "price.negative");
        }
        Date productionDate = product.getProductionDate();
        if (productionDate != null) {
            if (productionDate.after(new Date())) {
                errors.rejectValue("productionDate", "productiondate.invalid");
            }
        }
    }
}
