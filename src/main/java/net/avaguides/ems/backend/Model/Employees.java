package net.avaguides.ems.backend.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Employees")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employees {

    @Id
    @Column(name = "id"  )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Em_Id=0L ;

    @Column(name = "full_name" )
    private  String full_name;

    @Column(name = "hoursInWeek" )
    private  int hoursInWeek =0;

    @Column(name = "moneyPerHour" )
    private  int moneyPerHour =0;

    @Column(name = "validatedHours" )
    private  int validatedHours =0;

    @Override
    public String toString() {
        return "Employees{" +
                "Em_Id=" + Em_Id +
                ", full_name='" + full_name + '\'' +
                ", hoursInWeek=" + hoursInWeek +
                ", moneyPerHour=" + moneyPerHour +
                ", validatedHours=" + validatedHours +
                '}';
    }
}
