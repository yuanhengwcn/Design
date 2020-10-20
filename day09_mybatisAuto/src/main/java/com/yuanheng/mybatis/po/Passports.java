package com.yuanheng.mybatis.po;

import java.util.Date;

public class Passports {
    private Integer id;

    private String nationality;

    private Date expire;

    private Integer passagersId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public Integer getPassagersId() {
        return passagersId;
    }

    public void setPassagersId(Integer passagersId) {
        this.passagersId = passagersId;
    }
}