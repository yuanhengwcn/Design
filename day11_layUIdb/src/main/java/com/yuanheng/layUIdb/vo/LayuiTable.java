package com.yuanheng.layUIdb.vo;

import lombok.Data;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.layUIdb.vo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-22 19:44
 */

@Data
public class LayuiTable<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private List<T> data;
}
