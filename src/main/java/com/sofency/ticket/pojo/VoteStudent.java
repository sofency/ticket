package com.sofency.ticket.pojo;

import java.util.Date;

public class VoteStudent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column votestudent.id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column votestudent.actor_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    private Integer actorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column votestudent.student_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    private Integer studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column votestudent.activity_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    private Integer activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column votestudent.gmt_create
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    private Date gmtCreate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column votestudent.id
     *
     * @return the value of votestudent.id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column votestudent.id
     *
     * @param id the value for votestudent.id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column votestudent.actor_id
     *
     * @return the value of votestudent.actor_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public Integer getActorId() {
        return actorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column votestudent.actor_id
     *
     * @param actorId the value for votestudent.actor_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column votestudent.student_id
     *
     * @return the value of votestudent.student_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column votestudent.student_id
     *
     * @param studentId the value for votestudent.student_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column votestudent.activity_id
     *
     * @return the value of votestudent.activity_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column votestudent.activity_id
     *
     * @param activityId the value for votestudent.activity_id
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column votestudent.gmt_create
     *
     * @return the value of votestudent.gmt_create
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column votestudent.gmt_create
     *
     * @param gmtCreate the value for votestudent.gmt_create
     *
     * @mbg.generated Sun May 03 11:28:46 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}