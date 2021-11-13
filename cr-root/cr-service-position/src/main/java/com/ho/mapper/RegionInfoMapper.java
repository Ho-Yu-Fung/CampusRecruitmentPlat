package com.ho.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RegionInfoMapper {
    //通过省份ID查找下属城市
    List<String> listCitiesByProvinceId(Integer id);
    //通过城市ID查找下属区县
    List<String> listAreasByCityId(Integer id);
    //通过岗位id查询工作地
    List<String> listPositionAreaByPostId(Integer postId);
}
