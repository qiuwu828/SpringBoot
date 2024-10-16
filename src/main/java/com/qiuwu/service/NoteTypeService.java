package com.qiuwu.service;

import com.qiuwu.entity.NoteType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author hunter
 * @since 2022-05-25
 */
public interface NoteTypeService extends IService<NoteType> {
    //    查看用户日记类型列表
    List<NoteType> getList(Integer userId);
}
