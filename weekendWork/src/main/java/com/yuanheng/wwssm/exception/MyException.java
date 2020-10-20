package com.yuanheng.wwssm.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.exception
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 13:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends RuntimeException{
    private String message;
}
