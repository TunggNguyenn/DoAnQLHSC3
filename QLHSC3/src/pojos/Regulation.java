package pojos;
// Generated Aug 5, 2020 4:10:55 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Regulation generated by hbm2java
 */
public class Regulation  implements java.io.Serializable {


     private Long id;
     private Float maximumscore;
     private Integer minimumcapacity;
     private Integer maximumcapacity;
     private Integer minimumage;
     private Integer maximumage;
     private Boolean isdeleted;
     private Date createddate;
     private String createdby;
     private Date modifieddate;
     private String modifiedby;

    public Regulation() {
    }

	
    public Regulation(Date createddate, Date modifieddate) {
        this.createddate = createddate;
        this.modifieddate = modifieddate;
    }
    public Regulation(Float maximumscore, Integer minimumcapacity, Integer maximumcapacity, Integer minimumage, Integer maximumage, Boolean isdeleted, Date createddate, String createdby, Date modifieddate, String modifiedby) {
       this.maximumscore = maximumscore;
       this.minimumcapacity = minimumcapacity;
       this.maximumcapacity = maximumcapacity;
       this.minimumage = minimumage;
       this.maximumage = maximumage;
       this.isdeleted = isdeleted;
       this.createddate = createddate;
       this.createdby = createdby;
       this.modifieddate = modifieddate;
       this.modifiedby = modifiedby;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Float getMaximumscore() {
        return this.maximumscore;
    }
    
    public void setMaximumscore(Float maximumscore) {
        this.maximumscore = maximumscore;
    }
    public Integer getMinimumcapacity() {
        return this.minimumcapacity;
    }
    
    public void setMinimumcapacity(Integer minimumcapacity) {
        this.minimumcapacity = minimumcapacity;
    }
    public Integer getMaximumcapacity() {
        return this.maximumcapacity;
    }
    
    public void setMaximumcapacity(Integer maximumcapacity) {
        this.maximumcapacity = maximumcapacity;
    }
    public Integer getMinimumage() {
        return this.minimumage;
    }
    
    public void setMinimumage(Integer minimumage) {
        this.minimumage = minimumage;
    }
    public Integer getMaximumage() {
        return this.maximumage;
    }
    
    public void setMaximumage(Integer maximumage) {
        this.maximumage = maximumage;
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




}

