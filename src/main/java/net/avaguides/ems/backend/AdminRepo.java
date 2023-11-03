package net.avaguides.ems.backend;


import net.avaguides.ems.backend.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin , String> {
}
