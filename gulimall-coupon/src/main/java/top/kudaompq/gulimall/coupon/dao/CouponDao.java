package top.kudaompq.gulimall.coupon.dao;

import top.kudaompq.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:33:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
