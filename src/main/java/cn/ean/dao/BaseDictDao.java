package cn.ean.dao;

import cn.ean.pojo.BaseDict;

import java.util.List;

/**
 * FileName:BaseDictDao
 * Author:ean
 * Date:2021/8/7 11:44 下午
 **/
public interface BaseDictDao {
    //根据类别代码查询数据字典
    List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
























