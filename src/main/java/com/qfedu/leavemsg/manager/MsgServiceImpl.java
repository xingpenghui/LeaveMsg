package com.qfedu.leavemsg.manager;

import com.qfedu.leavemsg.domain.Msg;
import com.qfedu.leavemsg.mapper.MsgMapper;
import com.qfedu.leavemsg.service.MsgService;
import com.qfedu.leavemsg.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/10/11 14:50
 */
@Service
public class MsgServiceImpl implements MsgService {
    @Autowired
    private MsgMapper msgMapper;
    @Override
    public R save(Msg record) {
        if(msgMapper.insert(record)>0){
            return R.setOK();
        }else {
            return R.setERROR();
        }
    }

    @Override
    public List<Msg> queryAll() {
        return msgMapper.selectAll();
    }
}
