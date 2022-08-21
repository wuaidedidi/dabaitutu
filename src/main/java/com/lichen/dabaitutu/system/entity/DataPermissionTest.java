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
 * 用户权限测试
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_data_permission_test")
@ApiModel(value="DataPermissionTest对象", description="用户权限测试")
public class DataPermissionTest implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("FIELD1")
    private String field1;

    @TableField("FIELD2")
    private String field2;

    @TableField("FIELD3")
    private String field3;

    @TableField("FIELD4")
    private String field4;

    @TableField("DEPT_ID")
    private Integer deptId;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
