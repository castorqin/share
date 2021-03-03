package com.ccw.share.lease.business.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ccw.share.lease.service.BusinessService;

/**
 * @version 1.0
 * @projectName:com.ccw.share.lease.business.service.impl
 * @packageName:share
 * @className:BusinessServiceimpl
 * @Description:[一句话描述该类的功能]
 * @Author:qhj
 * @CreateDate:2021/3/2 15:44
 * @blog:[方法具体上行/下行参数文档]
 */
@Service
public class BusinessServiceimpl implements BusinessService {

    @Override
    public String getBusiness() {
        return "reeeeadwa";
    }
}
