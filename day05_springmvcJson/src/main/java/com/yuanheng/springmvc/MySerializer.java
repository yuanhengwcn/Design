package com.yuanheng.springmvc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-15 17:50
 */
public class MySerializer extends JsonSerializer<String> {
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        String number =value.length() > 5 ? value.substring(0 ,5) : value;
        gen.writeNumber(number);
    }
}
