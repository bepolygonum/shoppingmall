package com.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author kxy
 * @email polygonumkxy@163.com
 * @date 2023-06-14 14:44:11
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

