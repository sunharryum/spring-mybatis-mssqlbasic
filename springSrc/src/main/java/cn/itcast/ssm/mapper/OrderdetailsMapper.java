package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Orderdetails;
import cn.itcast.ssm.po.OrderdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailsMapper {
    int countByExample(OrderdetailsExample example);

    int deleteByExample(OrderdetailsExample example);

    int insert(Orderdetails record);

    int insertSelective(Orderdetails record);

    List<Orderdetails> selectByExample(OrderdetailsExample example);

    int updateByExampleSelective(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);

    int updateByExample(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);
}