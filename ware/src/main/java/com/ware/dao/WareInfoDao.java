package com.ware.dao;

import com.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author kxy
 * @email polygonumkxy@163.com
 * @date 2023-06-14 14:44:11
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
