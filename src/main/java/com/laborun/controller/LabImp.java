package com.laborun.controller;

import com.laborun.dao.LabDaoImp;
import com.laborun.dao.LabDaoInt;
import com.laborun.entity.Course;
import com.laborun.entity.Lab;
import java.util.List;

/**
 * Created by Rainfall on 3/24/2015.
 */
public class LabImp implements LabInt {
    @Override
    public List<Lab> getLabs(Course course) {
        return null;
    }

    @Override
    public Lab getLab(Lab lab) {
        LabDaoInt labDao = new LabDaoImp();
        return labDao.getLab(lab);
    }

    @Override
    public void insertLab(Lab lab) {
        LabDaoInt LDI = new LabDaoImp();
        LDI.insertLab(lab);
    }
}
