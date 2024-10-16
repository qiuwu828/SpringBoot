package com.qiuwu.mapper;

import com.qiuwu.entity.NoteType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface NoteTypeMapper extends BaseMapper<NoteType> {
    //查看用户日记类型列表
    List<NoteType> getList(@Param("userId") Integer userId);
}
