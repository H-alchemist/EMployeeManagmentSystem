package net.avaguides.ems.backend.service;

import net.avaguides.ems.backend.Dao.AdminDao;
import net.avaguides.ems.backend.Model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminS {

    @Autowired
    AdminDao AD;
    public boolean addADmin(Admin a){
        return AD.addA(a);
    }

    public boolean checkEmail(Admin e){
        return AD.checkAdmin(e);
    }
}
