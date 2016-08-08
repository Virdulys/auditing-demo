package me.auditing.dao;

import me.auditing.IntegrationTestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.*;

public class AuditedEntityWithPredefinedIdRepositoryIntegrationTest extends IntegrationTestBase {

    @Autowired
    private AuditedEntityWithPredefinedIdRepository auditedEntityWithPredefinedIdRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testCreatedByAndModifiedByIsPersisted() {
        // given
        AuditedEntityWithPredefinedId entity = new AuditedEntityWithPredefinedId().setId("predefinedId");

        // when
        auditedEntityWithPredefinedIdRepository.save(entity);
        entityManager.flush();

        // then
        assertNotNull(entity.getCreatedBy().getId());
        assertNotNull(entity.getModifiedBy().getId());
    }


}