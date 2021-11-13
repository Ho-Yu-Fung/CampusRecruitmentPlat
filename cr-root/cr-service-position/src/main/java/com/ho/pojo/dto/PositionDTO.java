package com.ho.pojo.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.HashSet;

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
    private HashSet<String> area;

    private HashSet<Integer> label;


}
