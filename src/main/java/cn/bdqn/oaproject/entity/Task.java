package com.sample;


public class Task {

  private long id;
  private String tName;
  private long statusId;
  private long auditId;
  private long createdby;
  private java.sql.Date createdtime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTName() {
    return tName;
  }

  public void setTName(String tName) {
    this.tName = tName;
  }


  public long getStatusId() {
    return statusId;
  }

  public void setStatusId(long statusId) {
    this.statusId = statusId;
  }


  public long getAuditId() {
    return auditId;
  }

  public void setAuditId(long auditId) {
    this.auditId = auditId;
  }


  public long getCreatedby() {
    return createdby;
  }

  public void setCreatedby(long createdby) {
    this.createdby = createdby;
  }


  public java.sql.Date getCreatedtime() {
    return createdtime;
  }

  public void setCreatedtime(java.sql.Date createdtime) {
    this.createdtime = createdtime;
  }

}
