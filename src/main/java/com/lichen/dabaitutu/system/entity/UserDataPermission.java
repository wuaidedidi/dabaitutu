package com.lichen.dabaitutu.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户数据权限关联表
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user_data_permission")
@ApiModel(value="UserDataPermission对象", description="用户数据权限关联表")
public class UserDataPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ID")
    private Long userId;

    @TableField("DEPT_ID")
    private Long deptId;


}
