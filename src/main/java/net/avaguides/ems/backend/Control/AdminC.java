package net.avaguides.ems.backend.Control;


import net.avaguides.ems.backend.Model.Admin;
import net.avaguides.ems.backend.service.AdminS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class AdminC {

    @Autowired
    AdminS AS;

    @PostMapping("/api/AdminAdd")
    public ResponseEntity<?> add(@RequestBody Admin a) {

        boolean res = AS.addADmin(a);

        if(res = true)
             return new ResponseEntity<>(HttpStatus.OK);
         else
            return ResponseEntity.status(404).body("the email already  exist ");

    }

    @PostMapping("/api/checkA")
    public ResponseEntity<?> check(@RequestBody Admin a){
        if(AS.checkEmail(a)==true){

            return new ResponseEntity<>(HttpStatus.OK);

        }else

             return  ResponseEntity.status(404).body("the email already  exist ");
    }

}
