package com.qiuwu.service;

import com.qiuwu.dto.NoteDto;
import com.qiuwu.entity.Note;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
public interface NoteService extends IService<Note> {
    //获取用户日记列表
    List<NoteDto> getNoteDtoList(Integer userId);

    //通过日期查询对应的云记数量
    Map<String, Object> queryNoteCountByMonth(Integer userId);

    //通过类型查询对应的云记数量
    Map<String, Object> findNoteListByType(Integer userId);
}
