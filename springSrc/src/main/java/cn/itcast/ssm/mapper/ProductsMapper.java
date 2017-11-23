package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Products;
import cn.itcast.ssm.po.ProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductsMapper {
    int countByExample(ProductsExample example);

    int deleteByExample(ProductsExample example);

    int insert(Products record);

    int insertSelective(Products record);

    List<Products> selectByExample(ProductsExample example);

    int updateByExampleSelective(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByExample(@Param("record") Products record, @Param("example") ProductsExample example);
}