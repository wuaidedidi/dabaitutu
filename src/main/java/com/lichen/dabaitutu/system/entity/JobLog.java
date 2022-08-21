package com.lichen.dabaitutu.system.entity;

import java.math.BigDecimal;
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
 * 调度日志表
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_job_log")
@ApiModel(value="JobLog对象", description="调度日志表")
public class JobLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "任务日志id")
    @TableId(value = "LOG_ID", type = IdType.AUTO)
    private Long logId;

    @ApiModelProperty(value = "任务id")
    @TableField("JOB_ID")
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

    @ApiModelProperty(value = "任务状态    0：成功    1：失败")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "失败信息")
    @TableField("ERROR")
    private String error;

    @ApiModelProperty(value = "耗时(单位：毫秒)")
    @TableField("TIMES")
    private BigDecimal times;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
