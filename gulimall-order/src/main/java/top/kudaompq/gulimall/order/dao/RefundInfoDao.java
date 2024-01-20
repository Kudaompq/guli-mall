package top.kudaompq.gulimall.order.dao;

import top.kudaompq.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:51:28
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
