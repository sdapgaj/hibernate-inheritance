package entities.joined;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "J_Book")
@PrimaryKeyJoinColumn(name = "readable_id")
@Table(name = "joined_book")
public class Book extends Readable {

    private Integer pageNumber;

    private String size;

    private String cover;

}
