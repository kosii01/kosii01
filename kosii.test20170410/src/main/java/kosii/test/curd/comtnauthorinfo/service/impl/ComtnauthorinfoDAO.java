package kosii.test.curd.comtnauthorinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import kosii.test.curd.comtnauthorinfo.service.ComtnauthorinfoVO;
import kosii.test.curd.comtnauthorinfo.service.ComtnauthorinfoDefaultVO;

/**
 * @Class Name : ComtnauthorinfoDAO.java
 * @Description : Comtnauthorinfo DAO Class
 * @Modification Information
 *
 * @author 이학래&lt;sinbb07@naver.com&gt;
 * @since 201704102
 * @version 1.0
 * @see
 *  
 *  Copyright (C)  All right reserved.
 */

@Repository("comtnauthorinfoDAO")
public class ComtnauthorinfoDAO extends EgovAbstractDAO {

	/**
	 * COMTNAUTHORINFO을 등록한다.
	 * @param vo - 등록할 정보가 담긴 ComtnauthorinfoVO
	 * @return 등록 결과
	 * @exception Exception
	 */
    public String insertComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        return (String)insert("comtnauthorinfoDAO.insertComtnauthorinfo_S", vo);
    }

    /**
	 * COMTNAUTHORINFO을 수정한다.
	 * @param vo - 수정할 정보가 담긴 ComtnauthorinfoVO
	 * @return void형
	 * @exception Exception
	 */
    public void updateComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        update("comtnauthorinfoDAO.updateComtnauthorinfo_S", vo);
    }

    /**
	 * COMTNAUTHORINFO을 삭제한다.
	 * @param vo - 삭제할 정보가 담긴 ComtnauthorinfoVO
	 * @return void형 
	 * @exception Exception
	 */
    public void deleteComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        delete("comtnauthorinfoDAO.deleteComtnauthorinfo_S", vo);
    }

    /**
	 * COMTNAUTHORINFO을 조회한다.
	 * @param vo - 조회할 정보가 담긴 ComtnauthorinfoVO
	 * @return 조회한 COMTNAUTHORINFO
	 * @exception Exception
	 */
    public ComtnauthorinfoVO selectComtnauthorinfo(ComtnauthorinfoVO vo) throws Exception {
        return (ComtnauthorinfoVO) select("comtnauthorinfoDAO.selectComtnauthorinfo_S", vo);
    }

    /**
	 * COMTNAUTHORINFO 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNAUTHORINFO 목록
	 * @exception Exception
	 */
    public List<?> selectComtnauthorinfoList(ComtnauthorinfoDefaultVO searchVO) throws Exception {
        return list("comtnauthorinfoDAO.selectComtnauthorinfoList_D", searchVO);
    }

    /**
	 * COMTNAUTHORINFO 총 갯수를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return COMTNAUTHORINFO 총 갯수
	 * @exception
	 */
    public int selectComtnauthorinfoListTotCnt(ComtnauthorinfoDefaultVO searchVO) {
        return (Integer)select("comtnauthorinfoDAO.selectComtnauthorinfoListTotCnt_S", searchVO);
    }

}
