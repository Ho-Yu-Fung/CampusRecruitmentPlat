package com.ho.service;

import com.ho.pojo.entity.PositionDO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ho.pojo.vo.ListPositionInfoVO;

import java.util.Set;

/**
 * <p>
 * 岗位表 服务类
 * </p>
 *
 * @author Ho
 * @since 2021-11-13
 */
public interface PositionService extends IService<PositionDO> {
    //通过公司名查询岗位简略信息
    ListPositionInfoVO listAllPositionBriefInfoByEnterpiseName(String enterpriseName,String PageNum);
    //岗位s简略信息
    ListPositionInfoVO listAllPositionBriefInfo(String PageNum);
    //获取公司ID对应的岗位信息
    ListPositionInfoVO listPostBriefInfoByEnterpiseId(Integer id);
    //得到岗位的具体信息
    PositionDO GetPositionInfoById(String id);
    //查询岗位的标签信息
    Set listPostLabelById(Integer id);

}
