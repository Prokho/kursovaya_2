package searchengine.db;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.concurrent.atomic.AtomicInteger;

@Table(name="pets")
@Entity


public class Test_1 {


    @Id
    @GeneratedValue
    private int id;

    @Column(name = "admin_name")
    private String name;




}
