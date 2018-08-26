package com.control;

import com.bo.PhoneBo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deletePhone")
public class PhoneDelete extends HttpServlet {
    private PhoneBo phoneBo=new PhoneBo();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String[] id=request.getParameterValues("id");
        if(phoneBo.DelPart(id)){
            response.sendRedirect("myPage/phone_list.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        int id= Integer.parseInt(request.getParameter("id"));
        if(phoneBo.DelOne(id)){
            response.getWriter().write("{\"msg\":\"删除成功\"}");
        }else{
            response.getWriter().write("{\"msg\":\"删除失败\"}");
        }
    }
}
