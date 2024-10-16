package com.qiuwu.mapper;

import com.qiuwu.dto.NoteDto;
import com.qiuwu.dto.ReportDto;
import com.qiuwu.entity.Note;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiuwu.vo.NoteVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
@Repository
public interface NoteMapper extends BaseMapper<Note> {
    //获取用户日记列表
    List<NoteDto> getNoteDtoList(Integer userId);

    //通过月份获取日记数量
    List<ReportDto> queryNoteCountByMonth(@Param("userId") Integer userId);

    //通过类型查询对应的云记数量
    List<ReportDto> findNoteListByType(@Param("userId")Integer userId);
}
