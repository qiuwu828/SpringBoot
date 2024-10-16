package com.qiuwu.service.impl;

import com.qiuwu.entity.NoteType;
import com.qiuwu.mapper.NoteTypeMapper;
import com.qiuwu.service.NoteTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
@Service
public class NoteTypeServiceImpl extends ServiceImpl<NoteTypeMapper, NoteType> implements NoteTypeService {
    @Autowired
    NoteTypeMapper noteTypeMapper;

    @Override
    public List<NoteType> getList(Integer userId) {
        return noteTypeMapper.getList(userId);
    }
}
