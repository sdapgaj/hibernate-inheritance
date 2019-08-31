package entities.joined;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "J_Readable")
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "joined_readable")
public abstract class Readable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private LocalDate publicationDate;

    private BigDecimal price;

}
