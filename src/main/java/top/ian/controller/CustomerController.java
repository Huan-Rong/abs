package top.ian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Customer Controller
 *
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @RequestMapping(value = "/customer_input", method = RequestMethod.GET)
    public String inputCustomer() {
        return "/WEB-INF/jsp/CustomerForm.jsp";
    }
}
