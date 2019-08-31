package entities.concreteclass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "EPC_Readable")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Readable {

    @Id
    // We cannot use neither IDENTITY nor AUTO for this inheritance strategy!
    // See: https://docs.jboss.org/hibernate/stable/annotations/reference/en/html/entity.html#d0e1191
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private String title;

    private LocalDate publicationDate;

    private BigDecimal price;

}
