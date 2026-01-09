package com.dimandco.srvs.web.rest;

import com.dimandco.srvs.core.HuaIdValidationService;
import com.dimandco.srvs.core.model.HuaIdValidationResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/verifyhuaid")
public class HuaIdValidationResource {

    private final HuaIdValidationService huaIdValidationService;

    public HuaIdValidationResource(HuaIdValidationService huaIdValidationService) {
        if(huaIdValidationService == null)
            throw new NullPointerException("HuaIdValidationService cannot be null");

        this.huaIdValidationService = huaIdValidationService;
    }

    /** Checks if provided Hua ID is valid */
    @GetMapping("/{huaId}")
    public ResponseEntity<HuaIdValidationResult> verifyhuaid(@PathVariable String huaId) {
        final HuaIdValidationResult valid = huaIdValidationService.validateHuaId(huaId);
        return ResponseEntity.ok(valid);
    }
}
