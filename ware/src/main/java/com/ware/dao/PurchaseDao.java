package com.ware.dao;

import com.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author kxy
 * @email polygonumkxy@163.com
 * @date 2023-06-14 14:44:11
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
