package c231020.testBoard;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import c231020.board.BoardBean;
import c231020.board.BoardDAO;
import c231020.board.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/c231020/dataSource.xml", "applicationContext.xml"})
public class BoardTest {
	@Autowired
	BoardDAO boardDAO;
	@Autowired
	BoardService boardService;
	@Autowired
	BoardTestDAO boardTestDAO;
	
	@Before
	public void initialize() throws Exception {
		boardTestDAO.drop();
		boardTestDAO.create();
		BoardBean board = new BoardBean();
		board.setTitle("확인중1");
		board.setUserId(1);
		board.setContent("확인중인 내용1");
		boardDAO.add(board);
		board.setTitle("확인중2");
		board.setUserId(1);
		board.setContent("확인중인 내용2");
		boardDAO.add(board);
		board.setTitle("확인중3");
		board.setUserId(1);
		board.setContent("확인중인 내용3");
		boardDAO.add(board);
	}
	
	@Test
	public void add() {
		BoardBean board = new BoardBean();
		board.setTitle("확인중");
		board.setUserId(1);
		board.setContent("확인중인 내용");
		boardDAO.add(board);
	}
	
	@Test
	public void get() {
		BoardBean board = boardDAO.get(1);
		assertThat(board.getTitle(), is("확인중"));
		assertThat(board.getUserId(), is(1));
		assertThat(board.getContent(), is("확인중인 내용"));
		
	}
	
	@Test
	public void getAll() {
		List<BoardBean> list = boardDAO.getAll();
		for(int i = 0; i < list.size();++i) {
			
			assertThat(list.get(i).getTitle(), is("확인중" + (i + 1)));
			assertThat(list.get(i).getUserId(), is(1));
			assertThat(list.get(i).getContent(), is("확인중인 내용"+ (i + 1)));
		};		
	}
		
}
