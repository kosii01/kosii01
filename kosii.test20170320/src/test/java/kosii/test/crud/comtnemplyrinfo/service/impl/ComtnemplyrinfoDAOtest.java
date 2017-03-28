package kosii.test.crud.comtnemplyrinfo.service.impl;

import javax.annotation.Resource;

import kosii.test.crud.comtnemplyrinfo.service.ComtnemplyrinfoVO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:egovframework/spring/com/**/context-*.xml" })
public class ComtnemplyrinfoDAOtest {

	@Resource(name = "comtnemplyrinfoDAO")
	private ComtnemplyrinfoDAO comtnemplyrinfoDAO;

	@Test
	public void test() {
		// fail("Not yet implemented");

		ComtnemplyrinfoVO vo = new ComtnemplyrinfoVO();

		vo.setUserNm("이학래");
		vo.setEmplyrId("010");
		vo.setPassword("9844");
		vo.setHouseAdres("만년동");
		vo.setPasswordHint("4099");
		vo.setPasswordCnsr("통계");
		vo.setHouseEndTelno("1");
		vo.setAreaNo("053");
		vo.setZip("a");
		vo.setHouseMiddleTelno("2");
		vo.setEmplyrSttusCode("5");
		vo.setEsntlId("ff");

		try {
			comtnemplyrinfoDAO.insertComtnemplyrinfo(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
	}
}
