package top.kudaompq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.kudaompq.common.utils.PageUtils;
import top.kudaompq.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 11:28:04
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

