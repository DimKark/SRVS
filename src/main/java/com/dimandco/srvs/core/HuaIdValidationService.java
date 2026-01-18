package com.dimandco.srvs.core;

import com.dimandco.srvs.core.model.HuaIdValidationResult;
import com.dimandco.srvs.core.model.PersonType;

public interface HuaIdValidationService {
    HuaIdValidationResult validateHuaId(final String huaId);
}
