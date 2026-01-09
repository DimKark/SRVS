package com.dimandco.srvs.core;

import com.dimandco.srvs.core.model.HuaIdValidationResult;

public interface HuaIdValidationService {
    HuaIdValidationResult validateHuaId(final String huaId);
}
