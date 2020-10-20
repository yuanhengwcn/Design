package com.yuanheng.mybatis.relation;

import java.io.IOException;
import java.io.InputStream;

import com.yuanheng.mybatis.relation.mapper.EmployeeMapper;
import com.yuanheng.mybatis.relation.mapper.PassengersMapper;
import com.yuanheng.mybatis.relation.mapper.PassportsMapper;
import com.yuanheng.mybatis.relation.pojo.Employee;
import com.yuanheng.mybatis.relation.pojo.Passengers;
import com.yuanheng.mybatis.relation.pojo.Passports;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mybatis.relation
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-20 11:18
 */
public class MyApplication {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        // PassengersMapper mapper = sqlSession.getMapper(PassengersMapper.class);
        // Passengers passengers = mapper.findById(1001);

        // PassportsMapper mapper = sqlSession.getMapper(PassportsMapper.class);
        // Passports passports = mapper.findById(1);

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.findById(100);

        System.out.println(employee);
    }
}
