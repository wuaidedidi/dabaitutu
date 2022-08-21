package com.lichen.dabaitutu.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 代码生成配置表
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_generator_config")
@ApiModel(value="GeneratorConfig对象", description="代码生成配置表")
public class GeneratorConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "作者")
    private String author;

    @ApiModelProperty(value = "基础包名")
    private String basePackage;

    @ApiModelProperty(value = "entity文件存放路径")
    private String entityPackage;

    @ApiModelProperty(value = "mapper文件存放路径")
    private String mapperPackage;

    @ApiModelProperty(value = "mapper xml文件存放路径")
    private String mapperXmlPackage;

    @ApiModelProperty(value = "servcie文件存放路径")
    private String servicePackage;

    @ApiModelProperty(value = "serviceImpl文件存放路径")
    private String serviceImplPackage;

    @ApiModelProperty(value = "controller文件存放路径")
    private String controllerPackage;

    @ApiModelProperty(value = "是否去除前缀 1是 0否")
    private String isTrim;

    @ApiModelProperty(value = "前缀内容")
    private String trimValue;


}
