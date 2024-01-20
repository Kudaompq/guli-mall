package top.kudaompq.gulimall.ware.dao;

import top.kudaompq.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:55:07
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
