package top.kudaompq.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.kudaompq.common.utils.PageUtils;
import top.kudaompq.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:33:47
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

