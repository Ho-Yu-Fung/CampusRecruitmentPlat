package com.ho.pojo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 学历枚举
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum EduEnum {

    UNLIMITED(1),

    HIGHSHCOOL(2),

    JUNIORCOLLEGE(3),

    UNDERGRADUATE(4),

    MASTER(5),

    DOCTOR(6);

    private Integer eduId;


}
