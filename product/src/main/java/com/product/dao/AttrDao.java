package com.product.dao;

import com.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author kxy
 * @email polygonumkxy@163.com
 * @date 2023-06-13 13:50:43
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
