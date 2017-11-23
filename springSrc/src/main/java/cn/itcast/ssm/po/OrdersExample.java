package cn.itcast.ssm.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andCustidIsNull() {
            addCriterion("custid is null");
            return (Criteria) this;
        }

        public Criteria andCustidIsNotNull() {
            addCriterion("custid is not null");
            return (Criteria) this;
        }

        public Criteria andCustidEqualTo(Integer value) {
            addCriterion("custid =", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotEqualTo(Integer value) {
            addCriterion("custid <>", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThan(Integer value) {
            addCriterion("custid >", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThanOrEqualTo(Integer value) {
            addCriterion("custid >=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThan(Integer value) {
            addCriterion("custid <", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThanOrEqualTo(Integer value) {
            addCriterion("custid <=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidIn(List<Integer> values) {
            addCriterion("custid in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotIn(List<Integer> values) {
            addCriterion("custid not in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidBetween(Integer value1, Integer value2) {
            addCriterion("custid between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotBetween(Integer value1, Integer value2) {
            addCriterion("custid not between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("empid is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empid is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("empid =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("empid <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("empid >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("empid >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("empid <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("empid <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("empid in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("empid not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("empid between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("empid not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderdate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("orderdate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("orderdate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("orderdate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("orderdate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("orderdate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("orderdate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("orderdate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("orderdate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("orderdate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("orderdate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andRequireddateIsNull() {
            addCriterion("requireddate is null");
            return (Criteria) this;
        }

        public Criteria andRequireddateIsNotNull() {
            addCriterion("requireddate is not null");
            return (Criteria) this;
        }

        public Criteria andRequireddateEqualTo(Date value) {
            addCriterion("requireddate =", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotEqualTo(Date value) {
            addCriterion("requireddate <>", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateGreaterThan(Date value) {
            addCriterion("requireddate >", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateGreaterThanOrEqualTo(Date value) {
            addCriterion("requireddate >=", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateLessThan(Date value) {
            addCriterion("requireddate <", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateLessThanOrEqualTo(Date value) {
            addCriterion("requireddate <=", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateIn(List<Date> values) {
            addCriterion("requireddate in", values, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotIn(List<Date> values) {
            addCriterion("requireddate not in", values, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateBetween(Date value1, Date value2) {
            addCriterion("requireddate between", value1, value2, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotBetween(Date value1, Date value2) {
            addCriterion("requireddate not between", value1, value2, "requireddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateIsNull() {
            addCriterion("shippeddate is null");
            return (Criteria) this;
        }

        public Criteria andShippeddateIsNotNull() {
            addCriterion("shippeddate is not null");
            return (Criteria) this;
        }

        public Criteria andShippeddateEqualTo(Date value) {
            addCriterion("shippeddate =", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateNotEqualTo(Date value) {
            addCriterion("shippeddate <>", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateGreaterThan(Date value) {
            addCriterion("shippeddate >", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("shippeddate >=", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateLessThan(Date value) {
            addCriterion("shippeddate <", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateLessThanOrEqualTo(Date value) {
            addCriterion("shippeddate <=", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateIn(List<Date> values) {
            addCriterion("shippeddate in", values, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateNotIn(List<Date> values) {
            addCriterion("shippeddate not in", values, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateBetween(Date value1, Date value2) {
            addCriterion("shippeddate between", value1, value2, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateNotBetween(Date value1, Date value2) {
            addCriterion("shippeddate not between", value1, value2, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShipperidIsNull() {
            addCriterion("shipperid is null");
            return (Criteria) this;
        }

        public Criteria andShipperidIsNotNull() {
            addCriterion("shipperid is not null");
            return (Criteria) this;
        }

        public Criteria andShipperidEqualTo(Integer value) {
            addCriterion("shipperid =", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidNotEqualTo(Integer value) {
            addCriterion("shipperid <>", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidGreaterThan(Integer value) {
            addCriterion("shipperid >", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipperid >=", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidLessThan(Integer value) {
            addCriterion("shipperid <", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidLessThanOrEqualTo(Integer value) {
            addCriterion("shipperid <=", value, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidIn(List<Integer> values) {
            addCriterion("shipperid in", values, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidNotIn(List<Integer> values) {
            addCriterion("shipperid not in", values, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidBetween(Integer value1, Integer value2) {
            addCriterion("shipperid between", value1, value2, "shipperid");
            return (Criteria) this;
        }

        public Criteria andShipperidNotBetween(Integer value1, Integer value2) {
            addCriterion("shipperid not between", value1, value2, "shipperid");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(BigDecimal value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(BigDecimal value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(BigDecimal value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(BigDecimal value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<BigDecimal> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<BigDecimal> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNull() {
            addCriterion("shipname is null");
            return (Criteria) this;
        }

        public Criteria andShipnameIsNotNull() {
            addCriterion("shipname is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameEqualTo(String value) {
            addCriterion("shipname =", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotEqualTo(String value) {
            addCriterion("shipname <>", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThan(String value) {
            addCriterion("shipname >", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameGreaterThanOrEqualTo(String value) {
            addCriterion("shipname >=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThan(String value) {
            addCriterion("shipname <", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLessThanOrEqualTo(String value) {
            addCriterion("shipname <=", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameLike(String value) {
            addCriterion("shipname like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotLike(String value) {
            addCriterion("shipname not like", value, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameIn(List<String> values) {
            addCriterion("shipname in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotIn(List<String> values) {
            addCriterion("shipname not in", values, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameBetween(String value1, String value2) {
            addCriterion("shipname between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipnameNotBetween(String value1, String value2) {
            addCriterion("shipname not between", value1, value2, "shipname");
            return (Criteria) this;
        }

        public Criteria andShipaddressIsNull() {
            addCriterion("shipaddress is null");
            return (Criteria) this;
        }

        public Criteria andShipaddressIsNotNull() {
            addCriterion("shipaddress is not null");
            return (Criteria) this;
        }

        public Criteria andShipaddressEqualTo(String value) {
            addCriterion("shipaddress =", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotEqualTo(String value) {
            addCriterion("shipaddress <>", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressGreaterThan(String value) {
            addCriterion("shipaddress >", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipaddress >=", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLessThan(String value) {
            addCriterion("shipaddress <", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLessThanOrEqualTo(String value) {
            addCriterion("shipaddress <=", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressLike(String value) {
            addCriterion("shipaddress like", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotLike(String value) {
            addCriterion("shipaddress not like", value, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressIn(List<String> values) {
            addCriterion("shipaddress in", values, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotIn(List<String> values) {
            addCriterion("shipaddress not in", values, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressBetween(String value1, String value2) {
            addCriterion("shipaddress between", value1, value2, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipaddressNotBetween(String value1, String value2) {
            addCriterion("shipaddress not between", value1, value2, "shipaddress");
            return (Criteria) this;
        }

        public Criteria andShipcityIsNull() {
            addCriterion("shipcity is null");
            return (Criteria) this;
        }

        public Criteria andShipcityIsNotNull() {
            addCriterion("shipcity is not null");
            return (Criteria) this;
        }

        public Criteria andShipcityEqualTo(String value) {
            addCriterion("shipcity =", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotEqualTo(String value) {
            addCriterion("shipcity <>", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityGreaterThan(String value) {
            addCriterion("shipcity >", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityGreaterThanOrEqualTo(String value) {
            addCriterion("shipcity >=", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLessThan(String value) {
            addCriterion("shipcity <", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLessThanOrEqualTo(String value) {
            addCriterion("shipcity <=", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityLike(String value) {
            addCriterion("shipcity like", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotLike(String value) {
            addCriterion("shipcity not like", value, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityIn(List<String> values) {
            addCriterion("shipcity in", values, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotIn(List<String> values) {
            addCriterion("shipcity not in", values, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityBetween(String value1, String value2) {
            addCriterion("shipcity between", value1, value2, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipcityNotBetween(String value1, String value2) {
            addCriterion("shipcity not between", value1, value2, "shipcity");
            return (Criteria) this;
        }

        public Criteria andShipregionIsNull() {
            addCriterion("shipregion is null");
            return (Criteria) this;
        }

        public Criteria andShipregionIsNotNull() {
            addCriterion("shipregion is not null");
            return (Criteria) this;
        }

        public Criteria andShipregionEqualTo(String value) {
            addCriterion("shipregion =", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionNotEqualTo(String value) {
            addCriterion("shipregion <>", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionGreaterThan(String value) {
            addCriterion("shipregion >", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionGreaterThanOrEqualTo(String value) {
            addCriterion("shipregion >=", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionLessThan(String value) {
            addCriterion("shipregion <", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionLessThanOrEqualTo(String value) {
            addCriterion("shipregion <=", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionLike(String value) {
            addCriterion("shipregion like", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionNotLike(String value) {
            addCriterion("shipregion not like", value, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionIn(List<String> values) {
            addCriterion("shipregion in", values, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionNotIn(List<String> values) {
            addCriterion("shipregion not in", values, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionBetween(String value1, String value2) {
            addCriterion("shipregion between", value1, value2, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShipregionNotBetween(String value1, String value2) {
            addCriterion("shipregion not between", value1, value2, "shipregion");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeIsNull() {
            addCriterion("shippostalcode is null");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeIsNotNull() {
            addCriterion("shippostalcode is not null");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeEqualTo(String value) {
            addCriterion("shippostalcode =", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeNotEqualTo(String value) {
            addCriterion("shippostalcode <>", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeGreaterThan(String value) {
            addCriterion("shippostalcode >", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("shippostalcode >=", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeLessThan(String value) {
            addCriterion("shippostalcode <", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeLessThanOrEqualTo(String value) {
            addCriterion("shippostalcode <=", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeLike(String value) {
            addCriterion("shippostalcode like", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeNotLike(String value) {
            addCriterion("shippostalcode not like", value, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeIn(List<String> values) {
            addCriterion("shippostalcode in", values, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeNotIn(List<String> values) {
            addCriterion("shippostalcode not in", values, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeBetween(String value1, String value2) {
            addCriterion("shippostalcode between", value1, value2, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShippostalcodeNotBetween(String value1, String value2) {
            addCriterion("shippostalcode not between", value1, value2, "shippostalcode");
            return (Criteria) this;
        }

        public Criteria andShipcountryIsNull() {
            addCriterion("shipcountry is null");
            return (Criteria) this;
        }

        public Criteria andShipcountryIsNotNull() {
            addCriterion("shipcountry is not null");
            return (Criteria) this;
        }

        public Criteria andShipcountryEqualTo(String value) {
            addCriterion("shipcountry =", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotEqualTo(String value) {
            addCriterion("shipcountry <>", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryGreaterThan(String value) {
            addCriterion("shipcountry >", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryGreaterThanOrEqualTo(String value) {
            addCriterion("shipcountry >=", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLessThan(String value) {
            addCriterion("shipcountry <", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLessThanOrEqualTo(String value) {
            addCriterion("shipcountry <=", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryLike(String value) {
            addCriterion("shipcountry like", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotLike(String value) {
            addCriterion("shipcountry not like", value, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryIn(List<String> values) {
            addCriterion("shipcountry in", values, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotIn(List<String> values) {
            addCriterion("shipcountry not in", values, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryBetween(String value1, String value2) {
            addCriterion("shipcountry between", value1, value2, "shipcountry");
            return (Criteria) this;
        }

        public Criteria andShipcountryNotBetween(String value1, String value2) {
            addCriterion("shipcountry not between", value1, value2, "shipcountry");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}