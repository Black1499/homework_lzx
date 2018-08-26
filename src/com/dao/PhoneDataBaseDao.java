package com.dao;

import com.vo.Phone;

import java.util.List;

public interface PhoneDataBaseDao {
    List<Phone> getAll();
    List<Phone> getByPage(int start, int end);
    List<Phone> findByName(String name);
    int DelOne(int id);
    int DelPart(String[] id);
    int AddPhone(Phone phone);
    int UpdPhone(Phone phone);
}
