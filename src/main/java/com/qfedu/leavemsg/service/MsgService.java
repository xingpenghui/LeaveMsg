package com.qfedu.leavemsg.service;


import com.qfedu.leavemsg.domain.Msg;
import com.qfedu.leavemsg.vo.R;

import java.util.List;

public interface MsgService {

    R save(Msg record);

    List<Msg> queryAll();
}