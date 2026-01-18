package com.dimandco.srvs.core.impl;

import com.dimandco.srvs.core.HuaIdValidationService;
import com.dimandco.srvs.core.model.HuaIdValidationResult;
import com.dimandco.srvs.core.model.PersonType;
import org.springframework.stereotype.Service;

/**
 * Implementation of {@link HuaIdValidationService}
 */
@Service
public class HuaIdValidationServiceImpl implements HuaIdValidationService {
    private static final String VALID_STUDENT_HUA_ID_REGEX = "it[0-9]{5,7}";
    private static final String VALID_STAFF_HUA_ID_REGEX = "sr[0-9]{5,7}";

    public HuaIdValidationServiceImpl() {}

    @Override
    public HuaIdValidationResult validateHuaId(String huaId) {
        if(huaId == null) throw new NullPointerException("huaId cannot be null");
        if(huaId.isEmpty()) throw new IllegalArgumentException("huaId cannot be blank");

        if(huaId.matches(VALID_STUDENT_HUA_ID_REGEX))
            return HuaIdValidationResult.success(PersonType.STUDENT);
        else if(huaId.matches(VALID_STAFF_HUA_ID_REGEX))
            return HuaIdValidationResult.success(PersonType.STAFF);

        return HuaIdValidationResult.fail();
    }
}
