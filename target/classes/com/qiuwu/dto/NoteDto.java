package com.qiuwu.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 丘戊
 * @package com.qiuwu.dto
 * @title
 * @date 27/5/2022 下午 3:54
 */
@Data
public class NoteDto implements Serializable {
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
    private Integer typeId;
    /**
     * 发布时间
     */
    private Date pubTime;
    /**
     * 经度
     */
    private Float lon;
    /**
     * 纬度
     */
    private Float lat;

    //日记类型
    private String typeName;
}
