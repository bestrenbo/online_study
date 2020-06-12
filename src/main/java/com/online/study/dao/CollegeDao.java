package com.online.study.dao;

import com.online.study.entity.College;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (College)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-13 17:11:31
 */
public interface CollegeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    College queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<College> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param college 实例对象
     * @return 对象列表
     */
    List<College> queryAll(College college);

    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 影响行数
     */
    int insert(College college);

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 影响行数
     */
    int update(College college);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    int checkName(@Param("universityId") Long universityId, @Param("name") String name);
}