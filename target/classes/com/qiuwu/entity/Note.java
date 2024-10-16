package com.qiuwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_note")
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增
     */
    @TableId(value = "noteId", type = IdType.AUTO)
    private Integer noteId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 外键，从属tb_note_type
     */
    @TableField("typeId")
    private Integer typeId;

    /**
     * 发布时间
     */
    @TableField("pubTime")
    private Date pubTime;

    /**
     * 经度
     */
    private Float lon;

    /**
     * 纬度
     */
    private Float lat;


}
