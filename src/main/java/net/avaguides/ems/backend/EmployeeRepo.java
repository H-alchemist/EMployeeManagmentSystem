package net.avaguides.ems.backend;


import net.avaguides.ems.backend.Classes.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employees,Long> {


    @Transactional
    @Modifying
    @Query("UPDATE Employees e SET e.validatedHours = e.validatedHours + :validatedH WHERE e.Em_Id = :id")
    void updateValidatedHoursById(Long id, int validatedH);

}
