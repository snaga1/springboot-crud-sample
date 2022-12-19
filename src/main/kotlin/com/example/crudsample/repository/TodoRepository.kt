package com.example.crudsample.repository

import com.example.crudsample.model.Todo
import org.apache.ibatis.annotations.*
import org.springframework.stereotype.Repository


@Mapper
@Repository
interface TodoRepository {
    @Select("SELECT * FROM todos;")
    fun findAll(): List<Todo>

    @Select("SELECT * FROM todos where id = #{id};")
    fun findById(id: Long): Todo

    @Insert("INSERT INTO todos(content) values(#{content});")
    fun save(todo: Todo): Int

    @Update("UPDATE todos SET content=#{content} WHERE id=#{id}")
    fun update(todo: Todo): Int

    @Delete("DELETE FROM todos WHERE id=#{id}")
    fun delete(@Param("id") id: Long): Int
}