package com.yuanheng.annotation.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;


/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.annotation.bean
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 16:00
 */

@Data
public class Address {

    @Value("上海")
    private String city;

    @Value("上海")
    private String province;

    @Value("宝山")
    private String area;

}

