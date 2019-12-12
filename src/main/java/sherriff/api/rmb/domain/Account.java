package sherriff.api.rmb.domain;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * Created by Sherriff.Agboola on 12/12/19.
 */
@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private Long user_id;
    private String account_name;
    private String account_number;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "user_id")
    private User user;


}
