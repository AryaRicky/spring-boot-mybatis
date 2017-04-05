package com.mapper;

import com.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * Created by lijianguo on 2017/3/28.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findById(int id);

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(User user);
}
