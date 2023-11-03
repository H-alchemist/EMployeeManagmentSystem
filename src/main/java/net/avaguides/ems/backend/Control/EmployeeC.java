package net.avaguides.ems.backend.Control;

import net.avaguides.ems.backend.Model.Employees;
import net.avaguides.ems.backend.service.EmployeeS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class EmployeeC {

    @Autowired
    EmployeeS ES;


    @PostMapping("/api/addEm")
    public ResponseEntity<?> add(@RequestBody Employees e){

        try{
            return new ResponseEntity<Employees>(ES.addEmployee(e), HttpStatus.OK);
        }catch(Exception exp){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
    @PostMapping("/api/update/{id}/{vh}")
    public void updateHours(@PathVariable Long id , @PathVariable int vh){

        ES.updateH(id,vh);

    }



    @DeleteMapping("/api/deleteOne/{id}")

    public ResponseEntity<?> deleteOne(@PathVariable Long id){
           try {
               ES.deleteOneEm(id);
               return ResponseEntity.ok("Employee deleted successfully ");
           }catch (Exception e){
               return ResponseEntity.status(404).body("Employee not found");
           }
    }


    @GetMapping("/api/getALL")
    public List<Employees> getEMs(){
        return   ES.getAll() ;
    }

    @GetMapping("/api/getOne/{id}")
    public ResponseEntity<?> getOneEmployee(@PathVariable Long id){

        Employees res =  ES.getOneEm(id) ;
        if(res!= null){
            return new  ResponseEntity<Employees>(res , HttpStatus.OK);
        }else {
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


}
