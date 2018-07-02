package com.app.Spring.JDBC;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@Repository
public class SpringJdbcApplication {

        private static JdbcTemplate jdbcTemplate;
        
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
                System.out.println("HELLO WORLD");
                String query ="insert into employee (EmpId, EmpName, department) values (?,?,?)";
                jdbcTemplate.update(query, new Object[]{500, "TEST","TEST"});
	}
        
        @Autowired
        public void setJdbcTemplate(DataSource dataSource){
            this.jdbcTemplate = new JdbcTemplate(dataSource);
        }
}
