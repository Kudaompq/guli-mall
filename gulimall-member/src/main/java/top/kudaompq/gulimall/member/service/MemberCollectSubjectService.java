package top.kudaompq.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.kudaompq.common.utils.PageUtils;
import top.kudaompq.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author kudaompq
 * @email kudaompq@foxmail.com
 * @date 2024-01-20 12:41:41
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

