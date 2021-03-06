package com.mysuperscore.mapper;

import com.mysuperscore.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserMapper implements org.springframework.jdbc.core.RowMapper<User>{

        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setPasswordConfirm(rs.getString("passwordConfirm"));
            user.setTinyint(rs.getInt("enabled"));
            return user;
        }
}
