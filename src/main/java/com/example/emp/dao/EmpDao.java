package com.example.emp.dao;

import com.example.emp.domain.Emp;

import java.util.List;

public interface EmpDao {
    int save(Emp emp); //添加一个新用户
    int delete(int empNo); //删除一个用户
    List<Emp> findAll();  //查找所有用户
    int update(Emp emp);  //更改用户
    Emp findByEmpNo (int emoNo); //找到一个用户
}
