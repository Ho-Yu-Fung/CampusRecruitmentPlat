package com.ho.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 岗位表
 * </p>
 *
 * @author Ho
 * @since 2021-11-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("crp_position")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PositionDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer enterpriseId;

    private String title;

    private String poDescribe;

    private String duty;

    private Float salaryMax;

    private Float salaryMin;

    private Integer qualificationId;

    private Integer industryType;

    private Integer type;

    private Integer ban;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime;

}
