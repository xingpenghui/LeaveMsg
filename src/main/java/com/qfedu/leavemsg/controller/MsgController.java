package com.qfedu.leavemsg.controller;

import com.qfedu.leavemsg.domain.Msg;
import com.qfedu.leavemsg.service.MsgService;
import com.qfedu.leavemsg.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/10/11 14:53
 */
@RestController
public class MsgController {

    @Autowired
    private MsgService service;

    //新增留言
    @RequestMapping("msgadd.do")
    public R save(Msg msg, HttpServletRequest request){
        msg.setIp(request.getRemoteAddr());
        return service.save(msg);
    }
    //查询留言
    @RequestMapping("msgall.do")
    public List<Msg> query(){
        return service.queryAll();
    }

}
