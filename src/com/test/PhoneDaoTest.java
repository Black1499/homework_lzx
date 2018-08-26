package com.test;

import com.dao.PhoneDao;
import com.util.JDBCUtil;
import com.util.JsonUtil;
import com.vo.Phone;

import java.text.SimpleDateFormat;
import java.util.List;

public class PhoneDaoTest {
    public static void main(String[] args) {
        PhoneDao phoneDao = new PhoneDao();
//        List<Phone> phoneList1 = phoneDao.getAll();
//        for (Phone phone : phoneList1) {
//            System.out.println(phone.toString());
//        }



//        System.out.println("===========分页查询===============");
//        List<Phone> phoneList1 = phoneDao.getByPage(20, 30);
//        for (Phone phone : phoneList1) {
//            System.out.println(phone.toString());
//        }
//
        System.out.println("\r\n===========模糊查询===============");
        List<Phone> phoneList2 = phoneDao.findByName("t");
        for (Phone phone : phoneList2) {
            System.out.println(phone.toString());
        }
//
//        System.out.println("\r\n===========添加===============");
//        Phone phone1 = new Phone(2014, "小米", "8s", 3099, JDBCUtil.date("2018-08-12"), 36);
//        System.out.println(phoneDao.AddPhone(phone1));
//
//        System.out.println("\r\n=============修改================");
//        Phone phone2 = new Phone(2012, "小米", "10s", 3099, JDBCUtil.date("2018-08-12"), 36);
//        System.out.println(phoneDao.UpdPhone(phone2));
//
//        System.out.println("\r\n===========删除一个==============");
//        System.out.println(phoneDao.DelOne(2014));
//
//        System.out.println("\r\n===========删除多个==============");
//        String[] num={"1016","1015","1017"};
//        System.out.println(phoneDao.DelPart(num));
    }
}
