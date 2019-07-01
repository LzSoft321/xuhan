package pers.xuhan.java.designpattern_设计模式.proxypattern_代理.静态代理模式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//测试类
public class ProxyPattern {

    public static void main(String[] args) {
//        IService service = new Service();
//        //传入被代理类的对象
//        ProxyService proxyService = new ProxyService(service);
//        proxyService.service();

        Map<String,Object> map = new HashMap<>();
        map.put("time",System.currentTimeMillis());
        List<String> contractIdList = new ArrayList<>();

        contractIdList.add("JSB-ZX201906202019382919");
        map.put("contractIdList",contractIdList);
        /***************获取PDF地址****************/
        System.out.println(HttpApiUtil.apiGet("http://data.paat.net/data/contractInfo/v1.0/getContract",
                "gEVBcH7yBMMX47mCTNUw2V2hk3VNonHL35e5c76539d343d4bf886ad80daffa06",
                "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCo8Ti+HH3iz9pgBgES8AzNSlJf2KB0T2HiEi9gLVBPH09hEi7p3eAKbyxI5n91hMML3xlRCxmCeSnyi9fKsWTjIjB8LiPOyJkMkNgu3aPeHmLk9gaQ88dtPPvqM43AherWOmThy6fygY2H2exYeBsORWRhqhxHf0px7J/JF0TckwIDAQAB",
                map));
    }
}