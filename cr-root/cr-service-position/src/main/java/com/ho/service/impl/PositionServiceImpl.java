package com.ho.service.impl;

import com.ho.pojo.dto.PositionDTO;
import com.ho.pojo.entity.PositionDO;
import com.ho.mapper.PositionMapper;
import com.ho.pojo.vo.ListPositionInfoVO;
import com.ho.pojo.vo.PositionInfoVO;
import com.ho.service.PositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ho.utils.DozerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * <p>
 * 岗位表 服务实现类
 * </p>
 *
 * @author Ho
 * @since 2021-11-13
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, PositionDO> implements PositionService {
    @Autowired
    private PositionMapper positionMapper;

    /**
     * 涉及多张表开启事务
     * @param positionDTO
     * @return
     */
    @Transactional(rollbackFor = Throwable.class)
    public boolean savePosition(PositionDTO positionDTO) {


        return super.save(new PositionDO());
    }

    /**
     * 查询所有岗位
     * @return
     */
    public ListPositionInfoVO listPositionInfo() {
        List<PositionInfoVO> infoList = positionMapper.listPositionInfo();
        infoList.stream().forEach(piv ->piv.setLabel(positionMapper.listLabelByPostId(piv.getId())));
        return new ListPositionInfoVO().setPositionInfo(infoList);
    }

    /**
     * 通过岗位id返回岗位
     * @param positionId
     * @return
     */
    public PositionInfoVO getPositionInfoById(Integer positionId) {
        PositionDO positionDO = super.getById(positionId);
        PositionInfoVO positionInfoVO = DozerUtils.ObjectTransfor(positionDO, PositionInfoVO.class);
        return positionInfoVO;
    }

}
