package com.qfedu.leavemsg.mapper;


import com.qfedu.leavemsg.domain.Msg;

import java.util.List;

public interface MsgMapper {

    int insert(Msg record);

    List<Msg> selectAll();
}