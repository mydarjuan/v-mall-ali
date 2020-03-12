package com.mall.service.impl;

import org.apache.dubbo.rpc.RpcContext;
import com.mall.interfaces.EchoService;

@org.apache.dubbo.config.annotation.Service()
public class EchoServiceImpl implements EchoService {

    @Override
    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [host :%s, port : %d] %s(\"%s\") : Hello,%s",
                rpcContext.getLocalHost(),
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}
