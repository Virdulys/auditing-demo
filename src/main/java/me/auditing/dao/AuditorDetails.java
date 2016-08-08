package me.auditing.dao;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class AuditorDetails implements Serializable {

    private static final long serialVersionUID = 3931274026105629829L;

    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.TABLE)
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;
    private String userId;
    private String divisionId;

    public String getId() {
        return id;
    }

    public AuditorDetails setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public AuditorDetails setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getDivisionId() {
        return divisionId;
    }

    public AuditorDetails setDivisionId(String divisionId) {
        this.divisionId = divisionId;
        return this;
    }
}
