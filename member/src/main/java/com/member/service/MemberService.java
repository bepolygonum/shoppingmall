package com.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author kxy
 * @email polygonumkxy@163.com
 * @date 2023-06-14 14:31:50
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

