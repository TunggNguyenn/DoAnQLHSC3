package pojos;
// Generated Aug 5, 2020 10:41:27 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account  implements java.io.Serializable {


     private Long id;
     private Role role;
     private String username;
     private String password;
     private Boolean isdeleted;
     private Date createddate;
     private String createdby;
     private Date modifieddate;
     private String modifiedby;
     private Set hrstaffs = new HashSet(0);
     private Set verificationtokens = new HashSet(0);
     private Set headmasters = new HashSet(0);
     private Set officestaffs = new HashSet(0);
     private Set teachers = new HashSet(0);

    public Account() {
    }

	
    public Account(Date createddate, Date modifieddate) {
        this.createddate = createddate;
        this.modifieddate = modifieddate;
    }
    public Account(Role role, String username, String password, Boolean isdeleted, Date createddate, String createdby, Date modifieddate, String modifiedby, Set hrstaffs, Set verificationtokens, Set headmasters, Set officestaffs, Set teachers) {
       this.role = role;
       this.username = username;
       this.password = password;
       this.isdeleted = isdeleted;
       this.createddate = createddate;
       this.createdby = createdby;
       this.modifieddate = modifieddate;
       this.modifiedby = modifiedby;
       this.hrstaffs = hrstaffs;
       this.verificationtokens = verificationtokens;
       this.headmasters = headmasters;
       this.officestaffs = officestaffs;
       this.teachers = teachers;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getIsdeleted() {
        return this.isdeleted;
    }
    
    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
    public Date getCreateddate() {
        return this.createddate;
    }
    
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
    public String getCreatedby() {
        return this.createdby;
    }
    
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
    public Date getModifieddate() {
        return this.modifieddate;
    }
    
    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }
    public String getModifiedby() {
        return this.modifiedby;
    }
    
    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }
    public Set getHrstaffs() {
        return this.hrstaffs;
    }
    
    public void setHrstaffs(Set hrstaffs) {
        this.hrstaffs = hrstaffs;
    }
    public Set getVerificationtokens() {
        return this.verificationtokens;
    }
    
    public void setVerificationtokens(Set verificationtokens) {
        this.verificationtokens = verificationtokens;
    }
    public Set getHeadmasters() {
        return this.headmasters;
    }
    
    public void setHeadmasters(Set headmasters) {
        this.headmasters = headmasters;
    }
    public Set getOfficestaffs() {
        return this.officestaffs;
    }
    
    public void setOfficestaffs(Set officestaffs) {
        this.officestaffs = officestaffs;
    }
    public Set getTeachers() {
        return this.teachers;
    }
    
    public void setTeachers(Set teachers) {
        this.teachers = teachers;
    }




}


