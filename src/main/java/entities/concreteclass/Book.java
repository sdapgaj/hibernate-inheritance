package entities.concreteclass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "EPC_Book")
@Table(name = "table_per_class_book")
public class Book extends Readable {

    private Integer pageNumber;

    private String size;

    private String cover;

}
