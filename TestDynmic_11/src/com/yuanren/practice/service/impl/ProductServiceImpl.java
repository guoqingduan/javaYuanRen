package com.yuanren.practice.service.impl;

import com.yuanren.practice.pojo.Business;
import com.yuanren.practice.pojo.Product;
import com.yuanren.practice.service.ProductService;
import com.yuanren.practice.util.DataUtil;

import java.util.Arrays;

public class ProductServiceImpl  extends ProductService {

    /**
     * 商家添加商品
     * @param product
     */
    @Override
    public void addProduct(Business business, Product product) {
        business.setProducts(product);
    }
    /**
     * 商家修改产品信息
     */
    @Override
    public void updateProduct(Business business,Product product) {
        business.setProducts(product);
    }
    /**
     * 商家根据名字来查询产品
     * @return
     */
    @Override
    public Product[] getByAll(Business business,int[] ints) {
        Product[] products=new Product[0];
        for (int i = 0; i < ints.length; i++) {
            products=DataUtil.changeProductsLength(products);
            products[products.length-1]=business.getProducts()[ints[i]];
        }
        return  products;
    }


    /**
     * 商家可以根据产品的生产时间来查询满足条件的商品
     *
     */
    @Override
    public Product[] getAllByDate(String date) {
        return new Product[0];
    }

    /**
     * 根据产品id来删除
     * @param pid
     */
    @Override
    public void deleteProduct(Business business,String pid) {
        Product[] products = business.getProducts();
        for (int i = 0; i < products.length; i++) {
            if(pid.equals(products[i].getPid())){
                products[i]=null;
                for (int j = i; j < products.length-1; j++) {
                    Product temp=products[j];
                    products[j]=products[j+1];
                    products[j+1]=temp;
                }
                break;
            }
        }
        DataUtil.del(products);
    }
}
