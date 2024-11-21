package com.maybank.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_EGL_LOG")
public class AuditLog {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LOG_ID;
    @Column(name="LOG_DATE")
    private LocalDateTime LOG_DATE;
    @Column(name="FUN_NAME")
    private String FUN_NAME;

    @Column(name="DEV_MESSAGE")
    private String DEV_MESSAGE;
    @Column(name="USER_ID")
    private  String USER_ID;
    @Column(name="DB_ACTION")
    private String DB_ACTION;
    @Column(name="EXP_MESSAGE")
    private String EXP_MESSAGE;

    public Long getLOG_ID() {
        return LOG_ID;
    }

    public void setLOG_ID(Long LOG_ID) {
        this.LOG_ID = LOG_ID;
    }

    public LocalDateTime getLOG_DATE() {
        return LOG_DATE;
    }

    public void setLOG_DATE(LocalDateTime LOG_DATE) {
        this.LOG_DATE = LOG_DATE;
    }

    public String getFUN_NAME() {
        return FUN_NAME;
    }

    public void setFUN_NAME(String FUN_NAME) {
        this.FUN_NAME = FUN_NAME;
    }

    public String getDEV_MESSAGE() {
        return DEV_MESSAGE;
    }

    public void setDEV_MESSAGE(String DEV_MESSAGE) {
        this.DEV_MESSAGE = DEV_MESSAGE;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getDB_ACTION() {
        return DB_ACTION;
    }

    public void setDB_ACTION(String DB_ACTION) {
        this.DB_ACTION = DB_ACTION;
    }

    public String getEXP_MESSAGE() {
        return EXP_MESSAGE;
    }

    public void setEXP_MESSAGE(String EXP_MESSAGE) {
        this.EXP_MESSAGE = EXP_MESSAGE;
    }
}
