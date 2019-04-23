package com.cheer.dao.impl;

import com.cheer.dao.EmpDao;
import com.cheer.model.Emp;

import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {
    @Override
    public List<Emp>  getList(){
        List<Emp> empList=new ArrayList<>();
        Emp emp=new Emp(7778,"scott","teacher",7788,"1980-09-12",300.0,400.00,40);
        empList.add(emp);
        return empList;
    }

}
