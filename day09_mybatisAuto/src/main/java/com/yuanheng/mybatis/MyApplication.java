package com.yuanheng.mybatis;

import com.yuanheng.mybatis.mapper.DepartmentsMapper;
import com.yuanheng.mybatis.po.Departments;
import com.yuanheng.mybatis.po.DepartmentsExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mybatis
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-20 19:10
 */
public class MyApplication {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        DepartmentsMapper mapper = sqlSession.getMapper(DepartmentsMapper.class);

        Departments departments = mapper.selectByPrimaryKey(90);

        System.out.println(departments);

        DepartmentsExample example = new DepartmentsExample();
        DepartmentsExample.Criteria criteria = example.createCriteria();

        criteria.andDepartmentNameLike("%co%");
        criteria.andDepartmentIdEqualTo(180);

        List<Departments> list = mapper.selectByExample(example);

        System.out.println(list);

    }
}
