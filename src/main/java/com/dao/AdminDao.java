package com.dao;

import com.pojo.Admin;

import java.util.List;

/**
 * @author JFMACS
 */
public interface AdminDao {

    /**
     * 获取所有的Admin
     * @return 所有Admin列表
     */
    public List<Admin> getAll();

}
