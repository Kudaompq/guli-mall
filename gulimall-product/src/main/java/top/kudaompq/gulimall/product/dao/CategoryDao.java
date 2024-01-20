package top.kudaompq.gulimall.product.dao;

import top.kudaompq.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 11:28:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
