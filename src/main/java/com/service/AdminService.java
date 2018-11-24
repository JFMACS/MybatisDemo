package com.service;

import com.dao.AdminDao;
import com.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JFMACS
 */
@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    public List<Admin> getAll() {
        return adminDao.getAll();
    }
}
