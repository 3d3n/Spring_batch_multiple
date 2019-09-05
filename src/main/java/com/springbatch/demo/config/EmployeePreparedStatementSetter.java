package com.springbatch.demo.config;


import com.springbatch.demo.model.Employee;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

final class EmployeePreparedStatementSetter implements ItemPreparedStatementSetter<Employee> {

    @Override
    public void setValues(Employee employee,
                          PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, employee.getId());
        preparedStatement.setString(2, employee.getFirstName());
        preparedStatement.setString(3, employee.getLastName());
    }
}
