package com.dao;

import com.util.JDBCUtil;
import com.vo.Phone;

import java.util.List;

public class PhoneDao implements PhoneDataBaseDao{

    @Override
    public List<Phone> getAll() {
        String sql="select * from phoneinfo";
        List<Phone> phoneList= JDBCUtil.queryForList(sql,Phone.class,null);
        return phoneList;
    }

    @Override
    public List<Phone> getByPage(int limit, int page) {
        int start=(page-1)*limit+1;
        int end=page*limit;
        String sql="select * from phoneinfo limit ?,?";
        List<Phone> phoneList= JDBCUtil.queryForList(sql,Phone.class,start,end);
        return phoneList;
    }

    @Override
    public List<Phone> findByName(String name) {
        String sql="select * from phoneinfo where name like '%"+name+"%'";
        List<Phone> phoneList=JDBCUtil.queryForList(sql,Phone.class,null);
        return phoneList;
    }

    @Override
    public int DelOne(int id) {
       String sql="delete from phoneinfo where id=?";
       int num=JDBCUtil.excuteUpdate(sql,id);
       return num;
    }

    @Override
    public int DelPart(String[] id) {
        String sql="delete from phoneinfo where id in (";
        String link="";
        for (int i = 0; i <id.length ; i++) {
            sql+=link+"?";
            link=",";
        }
        sql+=")";
        int num=JDBCUtil.excuteUpdates(sql,id);
        return num;
    }

    @Override
    public int AddPhone(Phone phone) {
        String sql="insert into phoneinfo values(?,?,?,?,?,?)";
        int num=JDBCUtil.excuteUpdate(sql,phone.getId(),phone.getBrand(),phone.getName(),phone.getPrice(),phone.getDate(),phone.getStock());
        return num;
    }

    @Override
    public int UpdPhone(Phone phone) {
        String sql="update phoneinfo set brand=?,name=?,price=?,date=?,stock=? where id=?";
        int num=JDBCUtil.excuteUpdate(sql,phone.getBrand(),phone.getName(),phone.getPrice(),phone.getDate(),phone.getStock(),phone.getId());
        return num;
    }

}
