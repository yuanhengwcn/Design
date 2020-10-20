package com.yuanheng.wwssm.po;

import lombok.Data;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.po
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 13:28
 */

@Data
public class Location {

    private String locationId;

    private String streetAddress;

    private String postalCode;

    private String city;

    private String stateProvince;

    private String countryName;

}
