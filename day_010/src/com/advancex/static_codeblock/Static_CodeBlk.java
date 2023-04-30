package com.advancex.static_codeblock;

public class Static_CodeBlk {
    int param;

    public Static_CodeBlk() {
        System.out.println("无参构造");
    }


    /*
     *  构造代码块，次于静态代码块执行，new一次执行一次
     * */ {
        System.out.println("构造代码块");
    }

    /*
     * 静态代码块最优先执行，并且不管new多少次，都只执行一次
     * */
    static {
        System.out.println("静态代码块");
    }
}
