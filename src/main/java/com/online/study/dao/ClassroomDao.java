package com.online.study.dao;

import com.online.study.entity.Classroom;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Classroom)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-13 17:11:10
 */
public interface ClassroomDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Classroom queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Classroom> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param classroom 实例对象
     * @return 对象列表
     */
    List<Classroom> queryAll(Classroom classroom);

    /**
     * 新增数据
     *
     * @param classroom 实例对象
     * @return 影响行数
     */
    int insert(Classroom classroom);

    /**
     * 修改数据
     *
     * @param classroom 实例对象
     * @return 影响行数
     */
    int update(Classroom classroom);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}