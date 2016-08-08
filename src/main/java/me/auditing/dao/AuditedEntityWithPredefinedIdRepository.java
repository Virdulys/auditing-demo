package me.auditing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditedEntityWithPredefinedIdRepository extends JpaRepository<AuditedEntityWithPredefinedId, String> {
}
