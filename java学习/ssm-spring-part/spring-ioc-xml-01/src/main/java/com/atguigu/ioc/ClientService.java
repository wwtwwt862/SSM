package com.atguigu.ioc;

//工厂方法调用
public class ClientService {
    private static ClientService clientService= new ClientService();

    private ClientService(){}

    public static ClientService createInstance(){
        return  clientService;
    }
}
