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
@Table(name = "transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private Long from_user_id;
    private Long to_user_id;
    private Integer amount;
    private String details;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "from_user_id")
    private User fromUser;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "to_user_id")
    private User toUser;


}
