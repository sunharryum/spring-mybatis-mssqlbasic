package cn.itcast.ssm.po;

import java.math.BigDecimal;

public class Orderdetails {
    private Integer orderid;

    private Integer productid;

    private BigDecimal unitprice;

    private Short qty;

    private BigDecimal discount;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Short getQty() {
        return qty;
    }

    public void setQty(Short qty) {
        this.qty = qty;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}