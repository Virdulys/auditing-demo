package me.auditing.dao;

import me.auditing.IntegrationTestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.assertNotNull;

public class AuditedEntityIntegrationTest extends IntegrationTestBase {

    @Autowired
    private AuditedEntityWithPredefinedIdRepository predefinedIdRepository;

    @Autowired
    private AuditedEntityWithGeneratedIdRepository generatedIdRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testCreatedByAndModifiedByIsPersistedWhithPredefinedId() {
        // given
        AuditedEntityWithPredefinedId entity = new AuditedEntityWithPredefinedId().setId("predefinedId");

        // when
        predefinedIdRepository.save(entity);
        entityManager.flush();

        // then
        assertNotNull(entity.getCreatedBy().getId());
        assertNotNull(entity.getModifiedBy().getId());
    }

    @Test
    public void testCreatedByAndModifiedByIsPersistedWhithGeneratedId() {
        // given
        AuditedEntityWithGeneratedId entity = new AuditedEntityWithGeneratedId();

        // when
        generatedIdRepository.save(entity);
        entityManager.flush();

        // then
        assertNotNull(entity.getCreatedBy().getId());
        assertNotNull(entity.getModifiedBy().getId());
    }


}