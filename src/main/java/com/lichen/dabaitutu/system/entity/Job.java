package com.lichen.dabaitutu.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 定时任务表
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_job")
@ApiModel(value="Job对象", description="定时任务表")
public class Job implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "任务id")
    @TableId(value = "JOB_ID", type = IdType.AUTO)
    private Long jobId;

    @ApiModelProperty(value = "spring bean名称")
    @TableField("BEAN_NAME")
    private String beanName;

    @ApiModelProperty(value = "方法名")
    @TableField("METHOD_NAME")
    private String methodName;

    @ApiModelProperty(value = "参数")
    @TableField("PARAMS")
    private String params;

    @ApiModelProperty(value = "cron表达式")
    @TableField("CRON_EXPRESSION")
    private String cronExpression;

    @ApiModelProperty(value = "任务状态  0：正常  1：暂停")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
