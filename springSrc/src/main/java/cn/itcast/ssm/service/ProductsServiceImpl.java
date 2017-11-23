package cn.itcast.ssm.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.ProductsMapper;
import cn.itcast.ssm.mapper.ProductsMapperCustom;
import cn.itcast.ssm.po.ProductsCustom;
import cn.itcast.ssm.po.ProductsQueryVo;

/**
 * 
 * <p>Title: ItemsServiceImpl</p>
 * <p>Description: 商品管理</p>
 * <p>Company: www.itcast.com</p> 
 * @author	sunyu
 * @date	2015-4-13下午3:49:54
 * @version 1.0
 */
public class ProductsServiceImpl implements ProductsService{
	
	@Autowired
	private ProductsMapperCustom productsMapperCustom;
	
	@Autowired
	private ProductsMapper productsMapper;


	@Override
	public List<ProductsCustom> findProductsByPrice(ProductsQueryVo productsQueryVo) {
		// 通过ItemsMapperCustom查询数据库
		return productsMapperCustom.findProductsByPrice(productsQueryVo);
	}


}
