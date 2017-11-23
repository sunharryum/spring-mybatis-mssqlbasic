package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Shippers;
import cn.itcast.ssm.po.ShippersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippersMapper {
    int countByExample(ShippersExample example);

    int deleteByExample(ShippersExample example);

    int insert(Shippers record);

    int insertSelective(Shippers record);

    List<Shippers> selectByExample(ShippersExample example);

    int updateByExampleSelective(@Param("record") Shippers record, @Param("example") ShippersExample example);

    int updateByExample(@Param("record") Shippers record, @Param("example") ShippersExample example);
}