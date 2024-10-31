package com.gsj.springbootmp;

import com.gsj.springbootmp.common.utils.JwtUtil;

import com.gsj.springbootmp.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class JwtUtilTest {

    @Autowired
    private JwtUtil jwtUtil;

    @Test
    public void testCreateJwt(){
        User user = new User();
        user.setName("lzx");
        user.setPassword("1777777");
        String token = jwtUtil.createToken(user);
        System.out.println(token);
    }

    @Test
    public  void  testCreateJwt2(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIyMWFjNGU5OC01ZTI2LTQ4Y2ItYmY2Yy05NTg4YjM1MWU0NzkiLCJzdWIiOiJ7XCJuYW1lXCI6XCJsenhcIixcInBhc3N3b3JkXCI6XCIxNzc3Nzc3XCJ9IiwiaXNzIjoic3lzdGVtIiwiaWF0IjoxNzMwMzY2MTQ5LCJleHAiOjE3MzAzNjc5NDl9.s_gsZ9YVTciDOjWqGa0RNi2J2IQIH8LDxsoZo0eqAes";
        User user = jwtUtil.parseToken(token, User.class);
        System.out.println(user);
    }
}
