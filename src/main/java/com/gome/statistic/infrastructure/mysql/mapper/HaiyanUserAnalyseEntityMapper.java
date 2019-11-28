package com.gome.statistic.infrastructure.mysql.mapper;

import static com.gome.statistic.infrastructure.mysql.mapper.HaiyanUserAnalyseEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.gome.statistic.infrastructure.mysql.entity.HaiyanUserAnalyseEntity;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface HaiyanUserAnalyseEntityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.232+08:00", comments="Source Table: haiyan_user_analyse")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.233+08:00", comments="Source Table: haiyan_user_analyse")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.233+08:00", comments="Source Table: haiyan_user_analyse")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT replace(uuid(),'-','') FROM dual", keyProperty="record.id", before=true, resultType=Long.class)
    int insert(InsertStatementProvider<HaiyanUserAnalyseEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.235+08:00", comments="Source Table: haiyan_user_analyse")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HaiyanUserAnalyseEntityResult")
    HaiyanUserAnalyseEntity selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.235+08:00", comments="Source Table: haiyan_user_analyse")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HaiyanUserAnalyseEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="quota", property="quota", jdbcType=JdbcType.VARCHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<HaiyanUserAnalyseEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.236+08:00", comments="Source Table: haiyan_user_analyse")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.237+08:00", comments="Source Table: haiyan_user_analyse")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(haiyanUserAnalyseEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.237+08:00", comments="Source Table: haiyan_user_analyse")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanUserAnalyseEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.238+08:00", comments="Source Table: haiyan_user_analyse")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanUserAnalyseEntity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.239+08:00", comments="Source Table: haiyan_user_analyse")
    default int insert(HaiyanUserAnalyseEntity record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanUserAnalyseEntity)
                .map(id).toProperty("id")
                .map(quota).toProperty("quota")
                .map(number).toProperty("number")
                .map(startTime).toProperty("startTime")
                .map(endTime).toProperty("endTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.240+08:00", comments="Source Table: haiyan_user_analyse")
    default int insertSelective(HaiyanUserAnalyseEntity record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanUserAnalyseEntity)
                .map(id).toProperty("id")
                .map(quota).toPropertyWhenPresent("quota", record::getQuota)
                .map(number).toPropertyWhenPresent("number", record::getNumber)
                .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
                .map(endTime).toPropertyWhenPresent("endTime", record::getEndTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.241+08:00", comments="Source Table: haiyan_user_analyse")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanUserAnalyseEntity>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, quota, number, startTime, endTime)
                .from(haiyanUserAnalyseEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.242+08:00", comments="Source Table: haiyan_user_analyse")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanUserAnalyseEntity>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, quota, number, startTime, endTime)
                .from(haiyanUserAnalyseEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.242+08:00", comments="Source Table: haiyan_user_analyse")
    default HaiyanUserAnalyseEntity selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, quota, number, startTime, endTime)
                .from(haiyanUserAnalyseEntity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.243+08:00", comments="Source Table: haiyan_user_analyse")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HaiyanUserAnalyseEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanUserAnalyseEntity)
                .set(id).equalTo(record::getId)
                .set(quota).equalTo(record::getQuota)
                .set(number).equalTo(record::getNumber)
                .set(startTime).equalTo(record::getStartTime)
                .set(endTime).equalTo(record::getEndTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.244+08:00", comments="Source Table: haiyan_user_analyse")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HaiyanUserAnalyseEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanUserAnalyseEntity)
                .set(id).equalToWhenPresent(record::getId)
                .set(quota).equalToWhenPresent(record::getQuota)
                .set(number).equalToWhenPresent(record::getNumber)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(endTime).equalToWhenPresent(record::getEndTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.245+08:00", comments="Source Table: haiyan_user_analyse")
    default int updateByPrimaryKey(HaiyanUserAnalyseEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanUserAnalyseEntity)
                .set(quota).equalTo(record::getQuota)
                .set(number).equalTo(record::getNumber)
                .set(startTime).equalTo(record::getStartTime)
                .set(endTime).equalTo(record::getEndTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-09-23T15:13:50.246+08:00", comments="Source Table: haiyan_user_analyse")
    default int updateByPrimaryKeySelective(HaiyanUserAnalyseEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanUserAnalyseEntity)
                .set(quota).equalToWhenPresent(record::getQuota)
                .set(number).equalToWhenPresent(record::getNumber)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(endTime).equalToWhenPresent(record::getEndTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}