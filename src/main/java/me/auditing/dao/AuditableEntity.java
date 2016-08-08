package me.auditing.dao;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditableEntity implements Serializable {

    private static final long serialVersionUID = -7541732975935355789L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @CreatedBy
    private AuditorDetails createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @LastModifiedBy
    private AuditorDetails modifiedBy;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public AuditorDetails getCreatedBy() {
        return createdBy;
    }

    public AuditableEntity setCreatedBy(AuditorDetails createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public AuditableEntity setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public AuditorDetails getModifiedBy() {
        return modifiedBy;
    }

    public AuditableEntity setModifiedBy(AuditorDetails modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public AuditableEntity setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }
}
