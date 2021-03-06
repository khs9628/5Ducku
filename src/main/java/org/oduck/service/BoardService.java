package org.oduck.service;

import java.util.List;

import org.oduck.domain.BoardAttachVO;
import org.oduck.domain.BoardVO;
import org.oduck.domain.Criteria;

public interface BoardService {
	
	public void register(BoardVO board);
	
	public void register_N(BoardVO board);
	
	public BoardVO get(Long brd_id);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long brd_id);
	
	public List<BoardVO> getListWithPaging(Criteria cri);

	public List<BoardVO> getListWithPaging_N(Criteria cri);
	
	public void updateViewCnt(Long brd_id);
	
	public int getTotal(Criteria cri);
	
	public int getTotal_N(Criteria cri);
	
	public List<BoardAttachVO> getAttachList(Long brd_id);
}
