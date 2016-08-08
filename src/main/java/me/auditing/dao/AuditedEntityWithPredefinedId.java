package me.auditing.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuditedEntityWithPredefinedId extends AuditableEntity {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public AuditedEntityWithPredefinedId setId(String id) {
        this.id = id;
        return this;
    }
}
