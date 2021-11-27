package com.ho.mapper;

import com.ho.pojo.entity.PositionDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ho.pojo.vo.PositionInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * <p>
 * 岗位表 Mapper 接口
 * </p>
 *
 * @author Ho
 * @since 2021-11-13
 */
@Mapper
@Repository
public interface PositionMapper extends BaseMapper<PositionDO> {
    List<PositionInfoVO> listPositionInfo();
    //通过岗位id查询对应的标签
    Set<String> listLabelByPostId(Integer id);
    //存储企业对应的标签
    Boolean savePostLabelsByPostId(Integer id,Set<String> labels);
}
