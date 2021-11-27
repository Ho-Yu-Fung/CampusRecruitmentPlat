package com.ho.pojo.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositionDTO {

    @NotNull
    private Integer enterpriseId;
    @NotNull
    private String title;
    @NotNull
    private String poDescribe;

    private String duty;

    private Float salaryMax;

    private Float salaryMin;
    @NotNull
    private Integer qualificationId;
    @NotNull
    private String industryType;
    @NotNull
    private String type;

    private Integer ban;
    @NotNull
    private Set<String> area;

    private Set<String> label;


}
