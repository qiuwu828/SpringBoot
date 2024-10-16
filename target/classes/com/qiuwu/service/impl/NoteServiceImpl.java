package com.qiuwu.service.impl;

import com.qiuwu.dto.NoteDto;
import com.qiuwu.dto.ReportDto;
import com.qiuwu.entity.Note;
import com.qiuwu.mapper.NoteMapper;
import com.qiuwu.service.NoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
@Service
public class NoteServiceImpl extends ServiceImpl<NoteMapper, Note> implements NoteService {
    @Autowired
    NoteMapper noteMapper;

    /*
     * 获取用户日记列表
     * */
    @Override
    public List<NoteDto> getNoteDtoList(Integer userId) {
        return noteMapper.getNoteDtoList(userId);
    }

    /*
     *通过日期查询对应的云日记数量
     * */
    @Override
    public Map<String, Object> queryNoteCountByMonth(Integer userId) {
        //获取每月日记数据
        List<ReportDto> list = noteMapper.queryNoteCountByMonth(userId);
        //把ReportDto集合，转成map结构
        Map<String, Object> result = new HashMap<>();
        List<String> monthArray = new ArrayList<>();
        List<Integer> dataArray = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (ReportDto reportDto : list) {
                monthArray.add(reportDto.getGroupName());
                dataArray.add(reportDto.getNoteCount());
            }
        }
        result.put("monthArray", monthArray);
        result.put("dataArray", dataArray);
        return result;
    }

    /*
     * 通过类型查询对应的云日记数量
     * */
    @Override
    public Map<String, Object> findNoteListByType(Integer userId) {
        //获取每月日记数据
        List<ReportDto> list = noteMapper.findNoteListByType(userId);
        //把ReportDto集合 转成map结构
        Map<String, Object> result = new HashMap<>();
        List<String> monthArray = new ArrayList<>();
        List<Integer> dataArray = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (ReportDto reportDto : list) {
                monthArray.add(reportDto.getGroupName());
                dataArray.add(reportDto.getNoteCount());
            }
        }
        result.put("monthArray", monthArray);
        result.put("dataArray", dataArray);
        return result;
    }
}
