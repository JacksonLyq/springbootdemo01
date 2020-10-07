package com.lyq.enity;

public class Student {
    private String stuId;
    private String sex;
    private String stuName;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", sex='" + sex + '\'' +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
