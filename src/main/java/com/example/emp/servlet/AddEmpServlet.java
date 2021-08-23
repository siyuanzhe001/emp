package com.example.emp.servlet;

import com.example.emp.dao.EmpDao;
import com.example.emp.dao.impl.EmpDaoImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/add")
public class AddEmpServlet extends HttpServlet {
    private EmpDao empDao = new EmpDaoImpl();
}
