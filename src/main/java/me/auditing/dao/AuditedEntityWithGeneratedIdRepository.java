package me.auditing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditedEntityWithGeneratedIdRepository extends JpaRepository<AuditedEntityWithGeneratedId, String> {
}
