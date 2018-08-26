package com.control;

import com.bo.PhoneBo;
import com.dao.PhoneDao;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/findByName")
public class PhoneByName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String name=req.getParameter("name");
        PhoneBo phoneBo=new PhoneBo();
        PhoneDao phoneDao=new PhoneDao();
        if(phoneBo.findByName(name)){
            resp.getWriter().write(JsonUtil.toJson(phoneDao.findByName(name)));
        }
    }
}
