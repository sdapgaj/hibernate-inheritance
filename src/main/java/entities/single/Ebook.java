package entities.single;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "ST_Ebook")
@DiscriminatorValue("type_ebook")
public class Ebook extends Readable {

    private String format;

    private Double sizeInKb;

}
