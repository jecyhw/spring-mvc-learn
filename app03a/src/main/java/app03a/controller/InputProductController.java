package app03a.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jecyhw on 2016/6/12.
 */
public class InputProductController implements Controller {
    private static final Log logger = LogFactory.getLog(InputProductController.class);

    @RequestMapping(value = "/product_input")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("InputProductController called");
        return new ModelAndView("ProductForm");
    }
}
