package net.avaguides.ems.backend.service;

import net.avaguides.ems.backend.Classes.Employees;
import net.avaguides.ems.backend.Dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeS {
    @Autowired
    EmployeeDao ED;


    public Employees addEmployee(Employees e){

        return ED.addEm(e);

    }

    public List<Employees> getAll(){

        return ED.getAllE();
    }

    public Employees getOneEm(Long id){
        return ED.getOneEM(id);
    }
    public void deleteOneEm(Long id){
         ED.deleteOneEM(id);
    }

    public  void updateH(Long id , int vh ){



        ED.validH(id, vh);

    }
}
