package com.ccw.share.lease.bussiness.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ccw.share.lease.service.BusinessService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @projectName:com.ccw.share.lease.bussiness.controller
 * @packageName:share
 * @className:BussinessController
 * @Description:[一句话描述该类的功能]
 * @Author:qhj
 * @CreateDate:2021/3/2 15:54
 * @blog:[方法具体上行/下行参数文档]
 */
@RestController
public class BussinessController {
    @Reference
    BusinessService bussinessService;
    @RequestMapping("/test")
    public String gettest(){
        return bussinessService.getBusiness();
    }

}
