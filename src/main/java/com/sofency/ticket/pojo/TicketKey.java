package com.sofency.ticket.pojo;

public class TicketKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.stu_id
     *
     * @mbg.generated Sun May 03 08:47:03 CST 2020
     */
    private String stuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticket.grap_id
     *
     * @mbg.generated Sun May 03 08:47:03 CST 2020
     */
    private Integer grapId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.stu_id
     *
     * @return the value of ticket.stu_id
     *
     * @mbg.generated Sun May 03 08:47:03 CST 2020
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.stu_id
     *
     * @param stuId the value for ticket.stu_id
     *
     * @mbg.generated Sun May 03 08:47:03 CST 2020
     */
    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticket.grap_id
     *
     * @return the value of ticket.grap_id
     *
     * @mbg.generated Sun May 03 08:47:03 CST 2020
     */
    public Integer getGrapId() {
        return grapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticket.grap_id
     *
     * @param grapId the value for ticket.grap_id
     *
     * @mbg.generated Sun May 03 08:47:03 CST 2020
     */
    public void setGrapId(Integer grapId) {
        this.grapId = grapId;
    }
}