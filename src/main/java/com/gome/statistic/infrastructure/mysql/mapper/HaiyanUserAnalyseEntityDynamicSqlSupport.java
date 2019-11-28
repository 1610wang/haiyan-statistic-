package com.gome.statistic.infrastructure.mysql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HaiyanUserAnalyseEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.230+08:00", comments="Source Table: haiyan_user_analyse")
    public static final HaiyanUserAnalyseEntity haiyanUserAnalyseEntity = new HaiyanUserAnalyseEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.230+08:00", comments="Source field: haiyan_user_analyse.id")
    public static final SqlColumn<Long> id = haiyanUserAnalyseEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.231+08:00", comments="Source field: haiyan_user_analyse.quota")
    public static final SqlColumn<String> quota = haiyanUserAnalyseEntity.quota;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.231+08:00", comments="Source field: haiyan_user_analyse.number")
    public static final SqlColumn<String> number = haiyanUserAnalyseEntity.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.231+08:00", comments="Source field: haiyan_user_analyse.start_time")
    public static final SqlColumn<Date> startTime = haiyanUserAnalyseEntity.startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.231+08:00", comments="Source field: haiyan_user_analyse.end_time")
    public static final SqlColumn<Date> endTime = haiyanUserAnalyseEntity.endTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.230+08:00", comments="Source Table: haiyan_user_analyse")
    public static final class HaiyanUserAnalyseEntity extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> quota = column("quota", JDBCType.VARCHAR);

        public final SqlColumn<String> number = column("number", JDBCType.VARCHAR);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIMESTAMP);

        public HaiyanUserAnalyseEntity() {
            super("haiyan_user_analyse");
        }
    }
}