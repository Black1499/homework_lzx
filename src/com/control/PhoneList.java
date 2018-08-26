package com.control;

import com.bo.PhoneBo;
import com.dao.PhoneDao;
import com.util.JsonUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/phoneList")
public class PhoneList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;utf-8");
        PhoneBo phoneBo=new PhoneBo();
        PhoneDao phoneDao=new PhoneDao();
        if(phoneBo.getAll()){
            response.getWriter().write(JsonUtil.toJson(phoneDao.getAll()));
        }
    }
}
