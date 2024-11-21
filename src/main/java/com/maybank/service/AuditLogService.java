package com.maybank.service;

import com.maybank.entity.AuditLog;
import com.maybank.repo.AuditLogRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuditLogService {

    private final AuditLogRepository auditLogRepository;

    public AuditLogService(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    @Async
//    public void log(String appName, String level, String message, String threadName, String loggerName, String stackTrace) {
//        AuditLog auditLog = new AuditLog();
////    set all entity class field her
//    }
    public void log( String funName, String devMessage, String userId, String dbAction, String stackTrace) {
        AuditLog auditLog = new AuditLog();
        auditLog.setLOG_DATE(LocalDateTime.now());
        auditLog.setFUN_NAME(funName);
        auditLog.setDEV_MESSAGE(devMessage);
        auditLog.setUSER_ID(userId);
        auditLog.setDB_ACTION(dbAction);
        auditLog.setEXP_MESSAGE(stackTrace);
        auditLogRepository.save(auditLog);
    }
}
