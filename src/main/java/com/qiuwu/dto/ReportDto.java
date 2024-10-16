package com.qiuwu.dto;

import lombok.Data;

/**
 * @author 丘戊
 * @package com.qiuwu.dto
 * @title
 * @date 27/5/2022 下午 4:22
 */
@Data
public class ReportDto {
    private String groupName;
    private Integer noteCount;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getNoteCount() {
        return noteCount;
    }

    public void setNoteCount(Integer noteCount) {
        this.noteCount = noteCount;
    }
}
