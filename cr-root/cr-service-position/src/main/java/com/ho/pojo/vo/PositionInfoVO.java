package com.ho.pojo.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PositionInfoVO {

    private Integer id;

    private Integer enterpriseId;

    private String title;

    private String poDescribe;

    private String duty;

    private Float salaryMax;

    private Float salaryMin;

    private String qualification;

    private String industryType;

    private String type;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

    private Set<String> area;

    private Set<String> label;

}
