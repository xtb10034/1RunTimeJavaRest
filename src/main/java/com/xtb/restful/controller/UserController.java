package com.xtb.restful.controller;

import com.xtb.restful.Dao.UserDao;
import com.xtb.restful.Service.Cc;
import com.xtb.restful.Service.Service;
import com.xtb.restful.Service.ServiceInterface;
import com.xtb.restful.Service.UserService;
import com.xtb.restful.model.User;
//import org.apache.el.lang.FunctionMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@RestController
@RequestMapping("user")
public class UserController {
    private static Log logger = LogFactory.getLog(UserController.class);

    @Autowired
    UserDao dao;

//    @Autowired
//    UserService service;
//    @Autowired
//    @Qualifier("aaa")
//    Method qureyUserById;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    ServiceInterface ss2;

    @Autowired
    Cc getMsg;

    @GetMapping("id1")
    public void list() throws Exception {

        try {
//            dao.getDataSourceUserId();
//            service.qureyUserById();
//            qureyUserById;
//            System.out.println("ss "+ ss2.doIt());
            getMsg.printInfo("lala");

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

    }
    @GetMapping("id")
    public void list1() throws Exception {
        String sql = "SELECT * FROM user";
        System.out.println(sql);
        try {
            List<Map<String,Object>> result = jdbcTemplate.queryForList(sql);

            if(result.size() ==0 ){
                logger.warn("No data in your query.===");
            }else{
                logger.warn("Data Rows: "+result.size());
                for ( Map<String, Object> o:result ) {
                    logger.warn(o.get("id") + " " + o.get("username") + " " + o.get("password"));
                }
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return ;
    }


}