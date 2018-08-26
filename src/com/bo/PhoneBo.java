package com.bo;

import com.dao.PhoneDao;
import com.vo.Phone;

public class PhoneBo {
    private PhoneDao phoneDao = new PhoneDao();
    public boolean getAll() {
        if (phoneDao.getAll() == null) {
            return false;
        } else {
            return true;
        }
    }
    public boolean getByPage(int limit, int page) {
        if (phoneDao.getByPage(limit, page) == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean findByName(String name) {
        if (phoneDao.findByName(name) == null) {
            return false;
        } else {
            return true;
        }
    }


    public boolean DelOne(int id) {
        if (phoneDao.DelOne(id) == 1) {
            return true;
        } else {
            return false;
        }
    }


    public boolean DelPart(String[] id) {
        if (phoneDao.DelPart(id) == id.length) {
            return true;
        } else {
            return false;
        }
    }


    public boolean AddPhone(Phone phone) {
        if (phoneDao.AddPhone(phone) == 1) {
            return true;
        } else {
            return false;
        }
    }


    public boolean UpdPhone(Phone phone) {
        if (phoneDao.UpdPhone(phone) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
