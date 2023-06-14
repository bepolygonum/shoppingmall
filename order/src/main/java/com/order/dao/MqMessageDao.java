package com.order.dao;

import com.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author kxy
 * @email polygonumkxy@163.com
 * @date 2023-06-14 14:39:13
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
