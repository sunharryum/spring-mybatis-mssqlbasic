package cn.itcast.ssm.po;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer orderid;

    private Integer custid;

    private Integer empid;

    private Date orderdate;

    private Date requireddate;

    private Date shippeddate;

    private Integer shipperid;

    private BigDecimal freight;

    private String shipname;

    private String shipaddress;

    private String shipcity;

    private String shipregion;

    private String shippostalcode;

    private String shipcountry;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getCustid() {
        return custid;
    }

    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getRequireddate() {
        return requireddate;
    }

    public void setRequireddate(Date requireddate) {
        this.requireddate = requireddate;
    }

    public Date getShippeddate() {
        return shippeddate;
    }

    public void setShippeddate(Date shippeddate) {
        this.shippeddate = shippeddate;
    }

    public Integer getShipperid() {
        return shipperid;
    }

    public void setShipperid(Integer shipperid) {
        this.shipperid = shipperid;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

    public String getShipaddress() {
        return shipaddress;
    }

    public void setShipaddress(String shipaddress) {
        this.shipaddress = shipaddress == null ? null : shipaddress.trim();
    }

    public String getShipcity() {
        return shipcity;
    }

    public void setShipcity(String shipcity) {
        this.shipcity = shipcity == null ? null : shipcity.trim();
    }

    public String getShipregion() {
        return shipregion;
    }

    public void setShipregion(String shipregion) {
        this.shipregion = shipregion == null ? null : shipregion.trim();
    }

    public String getShippostalcode() {
        return shippostalcode;
    }

    public void setShippostalcode(String shippostalcode) {
        this.shippostalcode = shippostalcode == null ? null : shippostalcode.trim();
    }

    public String getShipcountry() {
        return shipcountry;
    }

    public void setShipcountry(String shipcountry) {
        this.shipcountry = shipcountry == null ? null : shipcountry.trim();
    }
}