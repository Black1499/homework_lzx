package com.control;

import com.bo.PhoneBo;
import com.util.JDBCUtil;
import com.vo.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addPhone")
public class PhoneAdd extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        int id= Integer.parseInt(req.getParameter("id"));
        String brand=req.getParameter("brand");
        String name=req.getParameter("name");
        int price= Integer.parseInt(req.getParameter("price"));
        String date=req.getParameter("date");
        int stock= Integer.parseInt(req.getParameter("stock"));
        Phone phone=new Phone(id,brand,name,price, JDBCUtil.date(date),stock);
        PhoneBo phoneBo=new PhoneBo();
        if(phoneBo.AddPhone(phone)){
            resp.getWriter().write("{\"msg\":\"添加成功\"}");
        }else{
            resp.getWriter().write("{\"msg\":\"添加失败\"}");
        }
    }
}
