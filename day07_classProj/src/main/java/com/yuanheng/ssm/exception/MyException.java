package com.yuanheng.ssm.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.exception
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 23:14
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends RuntimeException{
    private String message;
}
