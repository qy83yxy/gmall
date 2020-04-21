package com.ketai.gmall.pms.vo;

import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;

@Data
public class ListGroupById implements Serializable {
  // 分类编号
  private Integer catId;
  // 每页显示几条
  private Integer limit;
  // 当前第几页
  private Integer page;
  // 毫秒级时间戳
  private Double t;
  // 正常时间
  private String time;

  public void setT(Double t) {
    if (t != 0 && t > 0) {
      this.t = t;
      this.time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(t);
    }
  }
}
