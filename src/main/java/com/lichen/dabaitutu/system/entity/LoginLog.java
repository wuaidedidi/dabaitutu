package com.lichen.dabaitutu.system.entity;

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
 * 登录日志表
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_login_log")
@ApiModel(value="LoginLog对象", description="登录日志表")
public class LoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    @TableField("USERNAME")
    private String username;

    @ApiModelProperty(value = "登录时间")
    @TableField("LOGIN_TIME")
    private LocalDateTime loginTime;

    @ApiModelProperty(value = "登录地点")
    @TableField("LOCATION")
    private String location;

    @ApiModelProperty(value = "IP地址")
    @TableField("IP")
    private String ip;

    @ApiModelProperty(value = "操作系统")
    @TableField("SYSTEM")
    private String system;

    @ApiModelProperty(value = "浏览器")
    @TableField("BROWSER")
    private String browser;


}
