package com.lichen.dabaitutu.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 角色菜单关联表
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_role_menu")
@ApiModel(value="RoleMenu对象", description="角色菜单关联表")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色ID")
    @TableField("ROLE_ID")
    private Long roleId;

    @ApiModelProperty(value = "菜单/按钮ID")
    @TableField("MENU_ID")
    private Long menuId;


}
