
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    private static final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("InheritanceExamples");
    private static final EntityManager entityManager =
            entityManagerFactory.createEntityManager();

    public static void main(String[] args) {
        singleTableBookAndEbook();
        joinedBookAndEbook();
        tablePerClassBookAndEbook();
    }

    private static void singleTableBookAndEbook() {
        entities.single.Book book = new entities.single.Book();
        book.setCover("Paperback");
        book.setPageNumber(608);
        book.setSize("A5");
        book.setPrice(BigDecimal.valueOf(143.79));
        book.setPublicationDate(LocalDate.of(2015, 11, 8    ));
        book.setTitle("Java Persistence with Hibernate");

        entities.single.Ebook ebook = new entities.single.Ebook();
        ebook.setFormat("mobi");
        ebook.setSizeInKb(662.0);
        ebook.setPrice(BigDecimal.valueOf(137.50));
        ebook.setPublicationDate(LocalDate.of(2016, 11, 10));
        ebook.setTitle("Beginning Hibernate: For Hibernate 5");

        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.persist(ebook);
        entityManager.getTransaction().commit();
    }

    private static void joinedBookAndEbook() {
        entities.joined.Book book = new entities.joined.Book();
        book.setCover("Paperback");
        book.setPageNumber(608);
        book.setSize("A5");
        book.setPrice(BigDecimal.valueOf(143.79));
        book.setPublicationDate(LocalDate.of(2015, 11, 8    ));
        book.setTitle("Java Persistence with Hibernate");

        entities.joined.Ebook ebook = new entities.joined.Ebook();
        ebook.setFormat("mobi");
        ebook.setSizeInKb(662.0);
        ebook.setPrice(BigDecimal.valueOf(137.50));
        ebook.setPublicationDate(LocalDate.of(2016, 11, 10));
        ebook.setTitle("Beginning Hibernate: For Hibernate 5");

        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.persist(ebook);
        entityManager.getTransaction().commit();
    }

    private static void tablePerClassBookAndEbook() {
        entities.concreteclass.Book book = new entities.concreteclass.Book();
        book.setCover("Paperback");
        book.setPageNumber(608);
        book.setSize("A5");
        book.setPrice(BigDecimal.valueOf(143.79));
        book.setPublicationDate(LocalDate.of(2015, 11, 8    ));
        book.setTitle("Java Persistence with Hibernate");

        entities.concreteclass.Ebook ebook = new entities.concreteclass.Ebook();
        ebook.setFormat("mobi");
        ebook.setSizeInKb(662.0);
        ebook.setPrice(BigDecimal.valueOf(137.50));
        ebook.setPublicationDate(LocalDate.of(2016, 11, 10));
        ebook.setTitle("Beginning Hibernate: For Hibernate 5");

        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.persist(ebook);
        entityManager.getTransaction().commit();
    }

}
