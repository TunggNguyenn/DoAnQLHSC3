package pojos;
// Generated Aug 5, 2020 10:41:27 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Studentofclass generated by hbm2java
 */
public class Studentofclass  implements java.io.Serializable {


     private Long id;
     private Schoolclass schoolclass;
     private Schoolyear schoolyear;
     private Semester semester;
     private Student student;
     private Integer absence;
     private Integer absencewithoutleave;
     private Boolean isdeleted;
     private Date createddate;
     private String createdby;
     private Date modifieddate;
     private String modifiedby;

    public Studentofclass() {
    }

	
    public Studentofclass(Date createddate, Date modifieddate) {
        this.createddate = createddate;
        this.modifieddate = modifieddate;
    }
    public Studentofclass(Schoolclass schoolclass, Schoolyear schoolyear, Semester semester, Student student, Integer absence, Integer absencewithoutleave, Boolean isdeleted, Date createddate, String createdby, Date modifieddate, String modifiedby) {
       this.schoolclass = schoolclass;
       this.schoolyear = schoolyear;
       this.semester = semester;
       this.student = student;
       this.absence = absence;
       this.absencewithoutleave = absencewithoutleave;
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
    public Schoolclass getSchoolclass() {
        return this.schoolclass;
    }
    
    public void setSchoolclass(Schoolclass schoolclass) {
        this.schoolclass = schoolclass;
    }
    public Schoolyear getSchoolyear() {
        return this.schoolyear;
    }
    
    public void setSchoolyear(Schoolyear schoolyear) {
        this.schoolyear = schoolyear;
    }
    public Semester getSemester() {
        return this.semester;
    }
    
    public void setSemester(Semester semester) {
        this.semester = semester;
    }
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public Integer getAbsence() {
        return this.absence;
    }
    
    public void setAbsence(Integer absence) {
        this.absence = absence;
    }
    public Integer getAbsencewithoutleave() {
        return this.absencewithoutleave;
    }
    
    public void setAbsencewithoutleave(Integer absencewithoutleave) {
        this.absencewithoutleave = absencewithoutleave;
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


