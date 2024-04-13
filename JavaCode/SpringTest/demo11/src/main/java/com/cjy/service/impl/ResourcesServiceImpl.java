package com.cjy.service.impl;

import com.cjy.dao.ResourcesDao;
import com.cjy.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author cjy
 * @Date 2024/4/13 13:49
 * @Version 1.0
 * @Description:
 */
@Service
public class ResourcesServiceImpl implements ResourceService {
    @Autowired
    private ResourcesDao resourcesDao;


    @Override
    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }
}
