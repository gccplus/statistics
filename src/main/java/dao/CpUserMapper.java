package dao;

import entity.CpUser;

import java.util.List;

public interface CpUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer cpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp_user
     *
     * @mbggenerated
     */
    int insert(CpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp_user
     *
     * @mbggenerated
     */
    int insertSelective(CpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp_user
     *
     * @mbggenerated
     */
    CpUser selectByPrimaryKey(Integer cpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(CpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cp_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CpUser record);

    List<CpUser> selectAllCpUsers();
}