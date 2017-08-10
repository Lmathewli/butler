package com.mathew.butler.order.flag;

import java.util.Date;

public class Flag {
    private int flag;
    private Date time;
    
    public int getFlag() {
        return flag;
    }
    
    public void setFlag(int flag) {
        this.flag = flag;
    }
    
    public Date getTime() {
        return time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
        return "Flag{" +
                "flag=" + flag +
                ", time=" + time +
                '}';
    }
}
