package com.sprint1.onlineshop.userentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Profile {
@Id
@GeneratedValue
private long prid;
private String prname;
private String premail;
private String prpassword;
private long prphno;
private String praddress;
public long getPrid() {
return prid;
}
public void setPrid(long prid) {
this.prid = prid;
}
public String getPrname() {
return prname;
}
public void setPrname(String prname) {
this.prname = prname;
}
public String getPremail() {
return premail;
}
public void setPremail(String premail) {
this.premail = premail;
}
public String getPrpassword() {
return prpassword;
}
public void setPrpassword(String prpassword) {
this.prpassword = prpassword;
}
public long getPrphno() {
return prphno;
}
public void setPrphno(long prphno) {
this.prphno = prphno;
}
public String getPraddress() {
return praddress;
}
public void setPraddress(String praddress) {
this.praddress = praddress;
}
public Profile(long prid,String prname, String premail, String prpassword, long prphno, String praddress) {
super();
this.prid=prid;
this.prname = prname;
this.premail = premail;
this.prpassword = prpassword;
this.prphno = prphno;
this.praddress = praddress;
}
public Profile() {
super();
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Profile [prid=" + prid + ", prname=" + prname + ", premail=" + premail + ", prpassword=" + prpassword
+ ", prphno=" + prphno + ", praddress=" + praddress + "]";
}
}