package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.ProductsCustom;
import cn.itcast.ssm.po.ProductsQueryVo;

public interface ProductsMapperCustom {
	
	public List<ProductsCustom> findProductsByPrice(ProductsQueryVo productsQueryVo);
}
