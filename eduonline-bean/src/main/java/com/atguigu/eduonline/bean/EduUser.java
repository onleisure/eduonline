package com.atguigu.eduonline.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class EduUser implements Serializable{

    @Id
    @Column
    private String userId;

    @Column
    private String mobile;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String userName;

    @Column
    private String showName;

    @Column
    private boolean sex;

    @Column
    private String age;

    @Column
    private String createTime;

    @Column
    private String isAvalible;

    @Column
    private String picImg;

    @Column
    private String bannerUrl;

    @Column
    private String msgNum;

    @Column
    private String sysMsgNum;

    @Column
    private String lastSystemTime;
}
