package cn.itcast.ssm.po;

/**
 * 
 * @ClassName: OrderDetailsQueryVo 
 * @Description: TODO(商品包装对象) 
 * @author SunYu A18ccms a18ccms_gmail_com 
 * @date Nov 20, 2017 4:40:13 AM 
 *
 */
public class ProductsQueryVo {
	private Products products;
	private ProductsCustom productsCustom;
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public ProductsCustom getProductsCustom() {
		return productsCustom;
	}
	public void setProductsCustom(ProductsCustom productsCustom) {
		this.productsCustom = productsCustom;
	}
	
	
}
