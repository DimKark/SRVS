package com.dimandco.srvs.core.impl;

import com.dimandco.srvs.core.HuaIdValidationService;
import com.dimandco.srvs.core.model.HuaIdValidationResult;
import org.springframework.stereotype.Service;

/**
 * Implementation of {@link HuaIdValidationService}
 */
@Service
public class HuaIdValidationServiceImpl implements HuaIdValidationService {
    private static final String VALID_HUA_ID_REGEX = "it[0-9]{5,7}";

    public HuaIdValidationServiceImpl() {}

    @Override
    public HuaIdValidationResult validateHuaId(String huaId) {
        if(huaId == null) throw new NullPointerException("huaId cannot be null");
        if(huaId.isEmpty()) throw new IllegalArgumentException("huaId cannot be blank");

        return new HuaIdValidationResult(huaId.matches(VALID_HUA_ID_REGEX));
    }
}
