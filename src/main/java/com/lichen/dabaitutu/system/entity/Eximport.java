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
 * Excel导入导出测试
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_eximport")
@ApiModel(value="Eximport对象", description="Excel导入导出测试")
public class Eximport implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "字段1")
    @TableField("FIELD1")
    private String field1;

    @ApiModelProperty(value = "字段2")
    @TableField("FIELD2")
    private Integer field2;

    @ApiModelProperty(value = "字段3")
    @TableField("FIELD3")
    private String field3;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
