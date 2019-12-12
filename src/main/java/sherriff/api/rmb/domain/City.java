package sherriff.api.rmb.domain;

import javax.persistence.*;

/**
 * Created by Sherriff.Agboola on 12/12/19.
 */
@Entity
@Table(name = "random_city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
