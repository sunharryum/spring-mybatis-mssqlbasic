package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Employees;
import cn.itcast.ssm.po.EmployeesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeesMapper {
    int countByExample(EmployeesExample example);

    int deleteByExample(EmployeesExample example);

    int insert(Employees record);

    int insertSelective(Employees record);

    List<Employees> selectByExample(EmployeesExample example);

    int updateByExampleSelective(@Param("record") Employees record, @Param("example") EmployeesExample example);

    int updateByExample(@Param("record") Employees record, @Param("example") EmployeesExample example);
}