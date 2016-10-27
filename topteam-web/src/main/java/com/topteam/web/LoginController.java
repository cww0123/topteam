package com.topteam.web;

import com.topteam.annotation.LoginCheck;
import com.topteam.commons.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chengwenwen on 2016/10/18.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @LoginCheck
    @ResponseBody
    @RequestMapping(value = "/login.json")
    public AjaxResult test(){
        Map map = new HashMap();
        map.put("ok","test");
        return AjaxResult.successResult(map);
    }
}
