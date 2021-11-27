package com.ho.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BriefPositionInfoVO {

        private Integer id;

        private String enterpriseName;

        private Float salaryMax;

        private Float salaryMin;

        private String qualification;

        private String area;

        private Set<String> label;
}
