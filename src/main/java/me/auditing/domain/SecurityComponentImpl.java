package me.auditing.domain;

import me.auditing.dao.AuditorDetails;
import org.springframework.stereotype.Component;

@Component
class SecurityComponentImpl implements SecurityComponent {

    @Override
    public AuditorDetails getCurrentAuditor() {
        return new AuditorDetails()
                .setId(null)
                .setUserId("someUserId")
                .setDivisionId("someDivisionId");
    }
}
