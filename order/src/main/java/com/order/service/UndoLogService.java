package com.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author kxy
 * @email polygonumkxy@163.com
 * @date 2023-06-14 14:39:13
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

