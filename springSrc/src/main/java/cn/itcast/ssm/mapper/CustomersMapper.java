package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Customers;
import cn.itcast.ssm.po.CustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomersMapper {
    int countByExample(CustomersExample example);

    int deleteByExample(CustomersExample example);

    int insert(Customers record);

    int insertSelective(Customers record);

    List<Customers> selectByExample(CustomersExample example);

    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);
}