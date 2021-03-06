package com.example.emp.servlet;

import com.example.emp.dao.EmpDao;
import com.example.emp.dao.impl.EmpDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class DeleteEmpServlet extends HttpServlet {
    private EmpDao empDao = new EmpDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        empDao.delete(Integer.parseInt(req.getParameter("empNo")));
        resp.sendRedirect("findAll");
    }
}
