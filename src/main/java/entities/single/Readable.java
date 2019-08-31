package entities.single;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
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
@Entity(name = "ST_Readable")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "readable_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "single_table_readable")
public abstract class Readable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private LocalDate publicationDate;

    private BigDecimal price;

}
