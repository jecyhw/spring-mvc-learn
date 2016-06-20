package app07b.controller;

import app07b.domain.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by jecyhw on 2016/6/20.
 */
@Controller
@RequestMapping("product/")
public class ProductController {
    private static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value = "new")
    public String inputProduct(Model model) {
        model.addAttribute("product", new Product());
        return "ProductForm";
    }

    @RequestMapping(value = "save")
    public String saveProduct(@Valid @ModelAttribute Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "ProductForm";
        }
        return "ProductDetails";
    }
}
