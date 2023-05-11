package com.xtb.restful.Service;


import com.xtb.restful.Dao.UserDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Service {
    private static Log logger = LogFactory.getLog(Service.class);


    public Cc getMsg() throws Exception{

        Cc cc = new Cc();
        return cc;
    }


}
