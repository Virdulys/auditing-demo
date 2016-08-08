package me.auditing.domain;

import me.auditing.dao.AuditorDetails;
import org.springframework.data.domain.AuditorAware;

interface SecurityComponent extends AuditorAware<AuditorDetails> {

    @Override
    AuditorDetails getCurrentAuditor();
}
