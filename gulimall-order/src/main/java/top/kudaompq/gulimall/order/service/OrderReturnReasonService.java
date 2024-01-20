package top.kudaompq.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.kudaompq.common.utils.PageUtils;
import top.kudaompq.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:51:28
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

