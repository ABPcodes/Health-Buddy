package com.example.dashboard;

public class Model
{


    private String header;
    private String desc;
    private String desc3;
    private int imgname;

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImgname() {
        return imgname;
    }

    public String get3(){
        return header + desc + desc3;
    }

    public void setImgname(int imgname) {
        this.imgname = imgname;
    }
}
