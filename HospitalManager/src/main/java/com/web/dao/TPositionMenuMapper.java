package com.web.dao;

import com.web.entity.TPositionMenu;
import com.web.entity.TPositionMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPositionMenuMapper {
    long countByExample(TPositionMenuExample example);

    int deleteByExample(TPositionMenuExample example);

    int deleteByPrimaryKey(Integer pmId);

    int insert(TPositionMenu record);

    int insertSelective(TPositionMenu record);

    List<TPositionMenu> selectByExample(TPositionMenuExample example);

    TPositionMenu selectByPrimaryKey(Integer pmId);

    int updateByExampleSelective(@Param("record") TPositionMenu record, @Param("example") TPositionMenuExample example);

    int updateByExample(@Param("record") TPositionMenu record, @Param("example") TPositionMenuExample example);

    int updateByPrimaryKeySelective(TPositionMenu record);

    int updateByPrimaryKey(TPositionMenu record);
}