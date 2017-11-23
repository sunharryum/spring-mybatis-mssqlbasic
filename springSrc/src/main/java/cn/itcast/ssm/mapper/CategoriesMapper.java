package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Categories;
import cn.itcast.ssm.po.CategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoriesMapper {
    int countByExample(CategoriesExample example);

    int deleteByExample(CategoriesExample example);

    int insert(Categories record);

    int insertSelective(Categories record);

    List<Categories> selectByExample(CategoriesExample example);

    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoriesExample example);

    int updateByExample(@Param("record") Categories record, @Param("example") CategoriesExample example);
}