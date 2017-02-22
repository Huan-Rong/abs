package top.ian.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.ian.domain.Product;

import javax.servlet.http.HttpServletRequest;

/**
 * Product Controller
 *
 * @author HuanRong Zheng(huanrong.maybe@gmail.com)
 * @version 2017/2/21
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    private static final Logger logger =
            LoggerFactory.getLogger(ProductController.class);

    @RequestMapping(value = "/product_input", method = RequestMethod.GET)
    public String inputProduct() {
        logger.info("inputProduct called.");
        return "ProductForm";
    }

    @RequestMapping(value = "/product_save", method = RequestMethod.POST)
    public String saveProduct(HttpServletRequest request, Model model) {
        logger.info("saveProduct called.");
        Product product = new Product();
        product.setProductName(request.getParameter("productName"));
        try {
            product.setProductPrice(Double.valueOf(request.getParameter("productPrice")));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        }

        // add product
        model.addAttribute("product", product);
        return "ProductDetails";
    }
}
