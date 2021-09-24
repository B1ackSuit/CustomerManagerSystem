package cn.ean.service;

import cn.ean.pojo.BaseDict;

import java.util.List;

/**
 * FileName:BaseDictService
 * Author:ean
 * Date:2021/8/8 12:28 上午
 **/
public interface BaseDictService {
    //根据类别代码查询数据字典
    List<BaseDict> findBaseDictByTypeCode(String typecode);
}
