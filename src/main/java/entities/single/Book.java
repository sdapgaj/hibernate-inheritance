package entities.single;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "ST_Book")
@DiscriminatorValue("type_book")
public class Book extends Readable {

    private Integer pageNumber;

    private String size;

    private String cover;

}
