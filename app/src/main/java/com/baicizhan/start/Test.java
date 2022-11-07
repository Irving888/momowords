package com.baicizhan.start;

public class Test {
    public static void main(String[] args) {
        SerialNumberEnums[] values = SerialNumberEnums.values();
        for (SerialNumberEnums serialNumberEnum : values) {
            // 输出： USABLE OCCUPY USED
            System.out.println(serialNumberEnum);
            // 输出： 待使用 其他活动占用 已经兑换
            System.out.println(serialNumberEnum.getDesc());
            // 输出： 1 2 3
            System.out.println(serialNumberEnum.getCode());
        }
    }
}
