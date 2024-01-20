package top.kudaompq.gulimall.member.dao;

import top.kudaompq.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:41:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
