package top.kudaompq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.kudaompq.common.utils.PageUtils;
import top.kudaompq.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 11:28:04
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

