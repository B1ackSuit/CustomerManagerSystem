package cn.ean.service.impl;

import cn.ean.dao.BaseDictDao;
import cn.ean.pojo.BaseDict;
import cn.ean.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName:BaseDictServiceImpl
 * Author:ean
 * Date:2021/8/8 12:29 上午
 **/
@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {

    private BaseDictDao baseDictDao;
    @Autowired
    private void setBaseDictDao(BaseDictDao baseDictDao){
        this.baseDictDao = baseDictDao;
    }

    @Override
    public List<BaseDict> findBaseDictByTypeCode(String typecode) {
        return baseDictDao.selectBaseDictByTypeCode(typecode);
    }
}
