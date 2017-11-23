package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.ProductsCustom;
import cn.itcast.ssm.po.ProductsQueryVo;

public interface ProductsService {
	public List<ProductsCustom> findProductsByPrice(ProductsQueryVo productsQueryVo);
}
