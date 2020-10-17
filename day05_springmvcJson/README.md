# 本节内容

主要讲了几个知识点：

1. JSON序列化

    `@JsonSerialize(using = MySerializer.class)`
    
    第一步：编写MySerializer.java类，继承JsonSerializer类，覆写`void serialize(String value, JsonGenerator gen, SerializerProvider serializers)`方法
    
    第二步：在属性上添加注解
    
2. JSON是否被写进属性中

    `@JsonInclude(JsonInclude.Include.NON_EMPTY)`
    
3. 将JSON对象，转变成为字符串的JSON

    `JSON.stringify(json)`