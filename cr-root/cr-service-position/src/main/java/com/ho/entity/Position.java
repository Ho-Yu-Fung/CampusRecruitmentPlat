package com.ho.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 企业id
     */
    private Integer enterpriseId;

    /**
     * 岗位标题
     */
    private String titile;

    /**
     * 岗位描述
     */
    private String desc;

    /**
     * 岗位职责
     */
    private String duty;

    /**
     * 最高薪水
     */
    private Float salaryMax;

    /**
     * 最低薪水
     */
    private Float salaryMin;

    /**
     * 学历要求
     */
    private Integer edu;

    /**
     * 行业类型
     */
    private Integer industryType;

    private Integer type;

    /**
     * 岗位发布状态
     */
    private Integer ban;

      @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

      @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime;


}
