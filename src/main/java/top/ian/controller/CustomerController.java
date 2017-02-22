package top.ian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Customer Controller
 *
 * @author HuanRong Zheng(huanrong.maybe@gmail.com)
 * @version 2017/2/21
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @RequestMapping(value = "/customer_input", method = RequestMethod.GET)
    public String inputCustomer() {
        return "CustomerForm";
    }
}
