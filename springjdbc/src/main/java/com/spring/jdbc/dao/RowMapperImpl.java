package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.spring.jdbc.entity.Student;

public class RowMapperImpl implements RowMapper {

    @Override
    @Nullable
    public Student mapRow(ResultSet result, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(result.getInt(1));
        student.setName(result.getString(2));
        student.setCity(result.getString(3));

        return student;
    }

}
