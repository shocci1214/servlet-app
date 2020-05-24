/*
 * WebApp_Project
 * model.entity.EmployeeDTO.java
 */
package model.entity;

/**
 * 従業員を表します。
 * m_employeeのDTOです。
 * @author Shohei Yamamoto
 */
public class EmployeeDTO{

    /**
     * 従業員コード
     */
    private String EmployeeCode;

    /**
     * 氏
     */
    private String lastName;

    /**
     * 名
     */
    private String firstName;

    /**
     * 氏かな
     */
    private String lastKanaName;

    /**
     * 名かな
     */
    private String firstKanaName;

    /**
     * 性別
     */
    private int gender;

    /**
     * 生年月日
     */
    private String birthDay;

    /**
     * 部署コード
     */
    private String sectionCode;

    /**
     * 入社日
     */
    private String hireDate;

    /**
    * 更新日時
    */
    private String updateDateTime;

    /**
     * フィールドEmployeeCodeの値を返します。
     * @return EmployeeCode
     */
    public String getEmployeeCode() {
        return EmployeeCode;
    }

    /**
     * フィールドEmployeeCodeの値を設定します。
     * @param EmployeeCode 従業員コード
     */
    public void setEmployeeCode(String EmployeeCode) {
        this.EmployeeCode = EmployeeCode;
    }

    /**
     * フィールドlastNameの値を返します。
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * フィールドlastNameの値を設定します。
     * @param lastName 氏
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * フィールドfirstNameの値を取得します。
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * フィールドfirstNameの値を設定します。
     * @param firstName 名
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * フィールドlastKanaNameの値を取得します。
     * @return lastKanaName
     */
    public String getLastKanaName() {
        return lastKanaName;
    }

    /**
     * フィールドlastKanaNameの値を設定します。
     * @param lastKanaName 氏かな
     */
    public void setLastKanaName(String lastKanaName) {
        this.lastKanaName = lastKanaName;
    }

    /**
     * フィールドfirstKanaNameの値を取得します。
     * @return firstKanaName
     */
    public String getFirstKanaName() {
        return firstKanaName;
    }

    /**
     * フィールドfirstKanaNameの値を設定します。
     * @param firstKanaName 名かな
     */
    public void setFirstKanaName(String firstKanaName) {
        this.firstKanaName = firstKanaName;
    }

    /**
     * フィールドgenderの値を返します。
     * @return gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * フィールドgenderの値を設定します。
     * @param gender 性別
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * フィールドbirthDayの値を取得します。
     * @return birthDay
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * フィールドbirthDayの値を設定します。
     * @param birthDay 生年月日
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * フィールドsectionCodeの値を取得します。
     * @return sectionCode
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * フィールドsectionEmployeeCodeの値を設定します。
     * @param sectionEmployeeCode 部署コード
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    /**
     * フィールドhireDateの値を取得します。
     * @return hireDate
     */
    public String getHireDate() {
        return hireDate;
    }

    /**
     * フィールドhireDateの値を設定します。
     * @param hireDate 入社日
     */
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * フィールドupdateDateTimeの値を取得します。
     * @return updateDateTime
     */
    public String getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * フィールドupdateDateTimeの値を設定します。
     * @param updateDateTime 更新日時
     */
    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

}
