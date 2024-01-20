package top.kudaompq.gulimall.coupon.dao;

import top.kudaompq.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:33:46
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
