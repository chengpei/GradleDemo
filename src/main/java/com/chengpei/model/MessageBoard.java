package com.chengpei.model;

import java.util.Date;

public class MessageBoard {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_message_board.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_message_board.CONTENT
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_message_board.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_message_board.CREATE_PERSON
     *
     * @mbggenerated
     */
    private Integer createPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_message_board.ACCEPT_PERSON
     *
     * @mbggenerated
     */
    private Integer acceptPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tf_message_board.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_message_board.ID
     *
     * @return the value of tf_message_board.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_message_board.ID
     *
     * @param id the value for tf_message_board.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_message_board.CONTENT
     *
     * @return the value of tf_message_board.CONTENT
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_message_board.CONTENT
     *
     * @param content the value for tf_message_board.CONTENT
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_message_board.CREATE_TIME
     *
     * @return the value of tf_message_board.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_message_board.CREATE_TIME
     *
     * @param createTime the value for tf_message_board.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_message_board.CREATE_PERSON
     *
     * @return the value of tf_message_board.CREATE_PERSON
     *
     * @mbggenerated
     */
    public Integer getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_message_board.CREATE_PERSON
     *
     * @param createPerson the value for tf_message_board.CREATE_PERSON
     *
     * @mbggenerated
     */
    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_message_board.ACCEPT_PERSON
     *
     * @return the value of tf_message_board.ACCEPT_PERSON
     *
     * @mbggenerated
     */
    public Integer getAcceptPerson() {
        return acceptPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_message_board.ACCEPT_PERSON
     *
     * @param acceptPerson the value for tf_message_board.ACCEPT_PERSON
     *
     * @mbggenerated
     */
    public void setAcceptPerson(Integer acceptPerson) {
        this.acceptPerson = acceptPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tf_message_board.STATUS
     *
     * @return the value of tf_message_board.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tf_message_board.STATUS
     *
     * @param status the value for tf_message_board.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}