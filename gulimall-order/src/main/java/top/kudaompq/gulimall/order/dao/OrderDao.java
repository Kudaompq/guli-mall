package top.kudaompq.gulimall.order.dao;

import top.kudaompq.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:51:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
