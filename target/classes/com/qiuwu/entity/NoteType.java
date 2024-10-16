package com.qiuwu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("tb_note_type")
public class NoteType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自动增长
     */
    @TableId(value = "typeId", type = IdType.AUTO)
    private Integer typeId;

    /**
     * 类别名，在同一个用户下唯一
     */
    @TableField("typeName")
    private String typeName;

    /**
     * 从属用户
     */
    @TableField("userId")
    private Integer userId;


}
