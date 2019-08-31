package entities.joined;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "J_Ebook")
@PrimaryKeyJoinColumn(name = "readable_id")
@Table(name = "joined_ebook")
public class Ebook extends Readable {

    private String format;

    private Double sizeInKb;

}
