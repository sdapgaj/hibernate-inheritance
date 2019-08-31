package entities.concreteclass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "EPC_Ebook")
@Table(name = "table_per_class_ebook")
public class Ebook extends Readable {

    private String format;

    private Double sizeInKb;

}
