package cn.task1.entity;

import java.util.Date;

public class User {
    private int userId;
    private String userName;
    private Date userCreate_at;
    private Date userUpdate_at;
    private String userQq;
    private int userChoiceType;
    private Date userEntranceTime;
    private String userGraduationSchool;
    private String userDailyUrl;
    private String userDesire;
    private String usersBrother;

    public User() {
    }

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getUserCreate_at() {
        return userCreate_at;
    }

    public void setUserCreate_at(Date userCreate_at) {
        this.userCreate_at = userCreate_at;
    }

    public Date getUserUpdate_at() {
        return userUpdate_at;
    }

    public void setUserUpdate_at(Date userUpdate_at) {
        this.userUpdate_at = userUpdate_at;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public int getUserChoiceType() {
        return userChoiceType;
    }

    public void setUserChoiceType(int userChoiceType) {
        this.userChoiceType = userChoiceType;
    }

    public Date getUserEntranceTime() {
        return userEntranceTime;
    }

    public void setUserEntranceTime(Date userEntranceTime) {
        this.userEntranceTime = userEntranceTime;
    }

    public String getUserGraduationSchool() {
        return userGraduationSchool;
    }

    public void setUserGraduationSchool(String userGraduationSchool) {
        this.userGraduationSchool = userGraduationSchool;
    }

    public String getUserDailyUrl() {
        return userDailyUrl;
    }

    public void setUserDailyUrl(String userDailyUrl) {
        this.userDailyUrl = userDailyUrl;
    }

    public String getUserDesire() {
        return userDesire;
    }

    public void setUserDesire(String userDesire) {
        this.userDesire = userDesire;
    }

    public String getUsersBrother() {
        return usersBrother;
    }

    public void setUsersBrother(String usersBrother) {
        this.usersBrother = usersBrother;
    }
}
