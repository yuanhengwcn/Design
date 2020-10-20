package com.yuanheng.ssm.po;


import lombok.Data;


/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.po
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-17 15:09
 */

@Data
public class Location {
    private Integer locationId;
    private String streetAddress;
    private Integer postalCode;
    private String city;
    private String stateProvince;
    private String countryId;
}
