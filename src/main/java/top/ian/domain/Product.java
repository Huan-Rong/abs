package top.ian.domain;

/**
 * Product
 *
 * @author HuanRong Zheng(huanrong.maybe@gmail.com)
 * @version 2017/2/21
 */
public class Product {
    private String productName;
    private Double productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Product() {
    }

    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
