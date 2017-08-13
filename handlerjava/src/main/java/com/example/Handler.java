package com.example;

public class Handler {

    private Looper mLooper;
    private MessageQueue mQueue;

    //Handler的初始化，在主线程中完成
    public Handler() {
        //获取主线程的Looper对象
        mLooper = Looper.myLooper();
        this.mQueue = mLooper.mQueue;
    }

    /**
     * 发送消息，压入队列
     * @param msg
     */
    public void sendMessage(Message msg) {
        msg.target = this;
        mQueue.enqueueMessage(msg);
    }

    public void handleMessage(Message msg) {

    }

    /**
     * 转发
     * @param msg
     */
    public void dispatchMessage(Message msg) {
        handleMessage(msg);
    }
}
