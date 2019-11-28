package com.gome.statistic.infrastructure.mysql.mapper.ext;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @Author: wenjie
 * @Date: 2019/9/23 8:38 PM
 */
@Mapper
public interface HaiyanUserAnalyseEntityExtMapper {

    @SelectProvider(type = SqlBuilder.class, method = "getLoginCount")
    @MapKey(value = "LoginCountVO")
    List<LoginCountVO> getLoginCount(String startTime, String endTime);

    @SelectProvider(type = SqlBuilder.class, method = "getUserCount")
    @MapKey(value = "UserCountVO")
    List<UserCountVO> getUserCount(String startTime, String endTime);

    @Data
    class LoginCountVO {
        private Integer count;
        //@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
        //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
        private String startTime;
    }

    @Data
    class UserCountVO {
        private Integer count;
        private String startTime;
    }

    class SqlBuilder {
        public String getLoginCount(String startTime, String endTime) {
            StringBuilder sql = new StringBuilder()
                    .append("select number 'count',DATE_FORMAT(start_time,'%Y-%m-%d %H:%i:%s') 'startTime' from haiyan_user_analyse where start_time >= '"+ startTime +"'  and end_time\n" +
                            "<= '"+ endTime +"' and quota = \"login_count\" order by start_time asc ");
            System.out.println(sql.toString());
            return sql.toString();
        }
        public String getUserCount(String startTime, String endTime) {
            StringBuilder sql = new StringBuilder()
                    .append("select number 'count',DATE_FORMAT(start_time,'%Y-%m-%d %H:%i:%s') 'startTime' from haiyan_user_analyse where start_time >= '"+ startTime +"'  and end_time\n" +
                            "<= '"+ endTime +"' and quota = \"login_user\" order by start_time asc ");
            System.out.println(sql.toString());
            return sql.toString();
        }
    }
}
