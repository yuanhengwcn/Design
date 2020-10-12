package com.yuanheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String sex;
    private String state;
    private String code;
    private Integer role;
}
