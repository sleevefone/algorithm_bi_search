package com.algorithm.$2_java8;


import com.algorithm.$8_annotation.single.ann.Location;

@Location("函数回调demo")
public class CallBack {


//    /**
//     * 回调
//     */
//
//    public class Server {
//
//        public void getClientMsg(CSCallBack csCallBack , String msg) {
//            System.out.println("服务端：服务端接收到客户端发送的消息为:" + msg);
//
//            // 模拟服务端需要对数据处理
//            try {
//                Thread.sleep(5 * 1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("服务端:数据处理成功，返回成功状态 200");
//            String status = "200";
//            csCallBack.process(status);
//        }
//    }
}
