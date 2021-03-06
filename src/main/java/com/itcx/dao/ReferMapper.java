package com.itcx.dao;

import com.itcx.po.Refer;

import java.util.List;

public interface ReferMapper {
    List<Refer> selectAll();
    List<Refer> demandRefer(Refer refer);
    void deleteRefer(int id);
    List<Refer> referCreate(Refer refer);
    List<Refer> updateRefer(Refer refer);
    Refer selectById(int id);
}
