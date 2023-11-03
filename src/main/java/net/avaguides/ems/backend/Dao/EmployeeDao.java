package net.avaguides.ems.backend.Dao;

import net.avaguides.ems.backend.Model.Employees;
import net.avaguides.ems.backend.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDao {


      @Autowired
    EmployeeRepo ER;


      public Employees addEm(Employees e){

         return  ER.save(e);
      }
      public List<Employees> getAllE(){
          return ER.findAll();
      }

     public Employees getOneEM(Long id){

          return ER.findById(id).get();

     }
    public void deleteOneEM(Long id){

        ER.deleteById(id);

    }
    public void validH(Long id  , int vh){
          ER.updateValidatedHoursById(id , vh);
    }
}
