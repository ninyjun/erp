package com.ninyjun.erp.account.acctsdk.model;

public class AccountBankAcctno {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BANK_ACCTNO.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    private Long acctId;

    @Override
    public String toString() {
        return "AccountBankAcctno{" +
                "acctId=" + acctId +
                ", bankAcctno='" + bankAcctno + '\'' +
                ", bankCode=" + bankCode +
                ", bankAcctnoName='" + bankAcctnoName + '\'' +
                '}';
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BANK_ACCTNO.BANK_ACCTNO
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    private String bankAcctno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BANK_ACCTNO.BANK_CODE
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    private Integer bankCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ACCOUNT_BANK_ACCTNO.BANK_ACCTNO_NAME
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    private String bankAcctnoName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BANK_ACCTNO.ACCT_ID
     *
     * @return the value of ACCOUNT_BANK_ACCTNO.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BANK_ACCTNO.ACCT_ID
     *
     * @param acctId the value for ACCOUNT_BANK_ACCTNO.ACCT_ID
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BANK_ACCTNO.BANK_ACCTNO
     *
     * @return the value of ACCOUNT_BANK_ACCTNO.BANK_ACCTNO
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    public String getBankAcctno() {
        return bankAcctno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BANK_ACCTNO.BANK_ACCTNO
     *
     * @param bankAcctno the value for ACCOUNT_BANK_ACCTNO.BANK_ACCTNO
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    public void setBankAcctno(String bankAcctno) {
        this.bankAcctno = bankAcctno == null ? null : bankAcctno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BANK_ACCTNO.BANK_CODE
     *
     * @return the value of ACCOUNT_BANK_ACCTNO.BANK_CODE
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    public Integer getBankCode() {
        return bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BANK_ACCTNO.BANK_CODE
     *
     * @param bankCode the value for ACCOUNT_BANK_ACCTNO.BANK_CODE
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    public void setBankCode(Integer bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ACCOUNT_BANK_ACCTNO.BANK_ACCTNO_NAME
     *
     * @return the value of ACCOUNT_BANK_ACCTNO.BANK_ACCTNO_NAME
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    public String getBankAcctnoName() {
        return bankAcctnoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ACCOUNT_BANK_ACCTNO.BANK_ACCTNO_NAME
     *
     * @param bankAcctnoName the value for ACCOUNT_BANK_ACCTNO.BANK_ACCTNO_NAME
     *
     * @mbg.generated Sat Nov 30 16:56:10 CST 2019
     */
    public void setBankAcctnoName(String bankAcctnoName) {
        this.bankAcctnoName = bankAcctnoName == null ? null : bankAcctnoName.trim();
    }
}