package com.lichen.dabaitutu.system.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 操作日志表
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_log")
@ApiModel(value="Log对象", description="操作日志表")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "操作用户")
    @TableField("USERNAME")
    private String username;

    @ApiModelProperty(value = "操作内容")
    @TableField("OPERATION")
    private String operation;

    @ApiModelProperty(value = "耗时")
    @TableField("TIME")
    private BigDecimal time;

    @ApiModelProperty(value = "操作方法")
    @TableField("METHOD")
    private String method;

    @ApiModelProperty(value = "方法参数")
    @TableField("PARAMS")
    private String params;

    @ApiModelProperty(value = "操作者IP")
    @TableField("IP")
    private String ip;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "操作地点")
    private String location;


}
