package com.example.demo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
 
 
/**
 * @author raidentrance
 *
 */
@Component
public class UserLegacyDao {
    @Autowired
    @Qualifier("jdbcSlave")
    private JdbcTemplate jdbcTemplate;
 
    public List<Countries> findAll() {
        return jdbcTemplate.query(querys.query2, new RowMapper<Countries>() {
            @Override
            public Countries mapRow(ResultSet rs, int arg1) throws SQLException {
                return new Countries(rs.getString("segmento"), rs.getString("cant"), rs.getString("dep_id"));
            }
        });
    }
 
    public List<Query1> query1() {
        return jdbcTemplate.query(querys.query1, new RowMapper<Query1>() {
            @Override
            public Query1 mapRow(ResultSet rs, int arg1) throws SQLException {
                return new Query1(rs.getString("segmento"), rs.getString("cant"));
            }
        });
    }
 
    public List<Employee> query3() {
        return jdbcTemplate.query(querys.query3, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
                return new Employee(rs.getString("EMPLOYEE_ID")
                		   , rs.getString("FIRST_NAME")
                		   , rs.getString("LAST_NAME")
                		   , rs.getString("EMAIL")
                		   , rs.getString("PHONE_NUMBER")
                		   , rs.getString("HIRE_DATE")
                		   , rs.getString("JOB_ID")
                		   , rs.getString("SALARY")
                		   , rs.getString("COMMISSION_PCT")
                		   , rs.getString("MANAGER_ID")
                		   , rs.getString("DEPARTMENT_ID"));
            }
        });
    }
 
    public List<Employee> query4() {
        return jdbcTemplate.query(querys.query4, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
                return new Employee(rs.getString("EMPLOYEE_ID")
                		   , rs.getString("FIRST_NAME")
                		   , rs.getString("LAST_NAME")
                		   , rs.getString("EMAIL")
                		   , rs.getString("PHONE_NUMBER")
                		   , rs.getString("HIRE_DATE")
                		   , rs.getString("JOB_ID")
                		   , rs.getString("SALARY")
                		   , rs.getString("COMMISSION_PCT")
                		   , rs.getString("MANAGER_ID")
                		   , rs.getString("DEPARTMENT_ID"));
            }
        });
    }
 
    public List<Query5> query5() {
        return jdbcTemplate.query(querys.query5, new RowMapper<Query5>() {
            @Override
            public Query5 mapRow(ResultSet rs, int arg1) throws SQLException {
                return new Query5(rs.getString("CANT")
                		   , rs.getString("SALARY")
                		   , rs.getString("DEPARTMENT_ID"));
            }
        });
    }
 
    public List<Query6> query6() {
        return jdbcTemplate.query(querys.query6, new RowMapper<Query6>() {
            @Override
            public Query6 mapRow(ResultSet rs, int arg1) throws SQLException {
                return new Query6(rs.getString("cantidad_empleados")
                		   , rs.getString("salario_promedio")
                		   , rs.getString("salario_minimo")
                		   , rs.getString("salario_maximo")
                		   , rs.getString("promedio_anios"));
            }
        });
    }
}