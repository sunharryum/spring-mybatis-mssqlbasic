package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Suppliers;
import cn.itcast.ssm.po.SuppliersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppliersMapper {
    int countByExample(SuppliersExample example);

    int deleteByExample(SuppliersExample example);

    int insert(Suppliers record);

    int insertSelective(Suppliers record);

    List<Suppliers> selectByExample(SuppliersExample example);

    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);
}