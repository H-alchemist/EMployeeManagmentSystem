package net.avaguides.ems.backend.Dao;

import net.avaguides.ems.backend.AdminRepo;
import net.avaguides.ems.backend.Model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminDao {
    @Autowired
    AdminRepo AR;

    public boolean addA(Admin a){

        try {
            AR.save(a);
            return true;

        } catch (DataIntegrityViolationException e) {
            return false;
        }
    }


    public boolean checkAdmin(Admin a){
       try {
           Admin res= AR.findById(a.getEmail().toString()).get();
           if(res.getEmail().toString()==a.getEmail().toString()){
               return true;

           }else{
               return false;
           }
       }catch (Exception e){
           return false;
       }


    }

}
