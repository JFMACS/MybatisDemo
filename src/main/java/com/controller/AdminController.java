package com.controller;

import com.pojo.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author JFMACS
 */
@Controller
@RequestMapping(value = "/Admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/getAll")
    public
    @ResponseBody
    Map<String,Object>
    getAll(HttpServletRequest request) {
        Map<String, Object> resultMap = new HashMap<>();
        List<Admin> allAdmin = adminService.getAll();
        resultMap.put("allAdmin", allAdmin);
        return resultMap;
    }
}
