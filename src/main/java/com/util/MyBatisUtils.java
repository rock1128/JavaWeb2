package com.util;




import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;



import java.io.IOException;

import java.io.InputStream;



public class MyBatisUtils {

    private static SqlSessionFactory sqlSessionFactory;



    // 静态代码块 在jvm加载的时候执行 并且只执行一次

    static {

        InputStream in = null;

        try {

            in = Resources.getResourceAsStream("mybatis-config.xml");

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        } catch (IOException e) {

            e.printStackTrace();

        }

        finally {

            try {

                if (in == null) {

                    in.close();

                }

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

    }



    public static SqlSession getSession() {

        return sqlSessionFactory.openSession();

    }

}
