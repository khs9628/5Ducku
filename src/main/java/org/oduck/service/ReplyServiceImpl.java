package org.oduck.service;

import java.util.List;

import org.oduck.domain.Criteria;
import org.oduck.domain.ReplyPageDTO;
import org.oduck.domain.ReplyVO;
import org.oduck.mapper.BoardMapper;
import org.oduck.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ReplyServiceImpl implements ReplyService{
	@Setter(onMethod_=@Autowired)
	private ReplyMapper mapper;
	
	@Setter(onMethod_=@Autowired)
	private BoardMapper boardMapper;
	
	@Transactional //Ʈ����� ó��
	@Override
	public int register(ReplyVO vo) {
		log.info("register........" + vo);
		boardMapper.updateReplyCnt(vo.getCmt_board(), 1);
		return mapper.insert(vo);
	}
	
	@Override
	public ReplyVO get(Long cmt_id) {
		log.info("get......." + cmt_id);
		return mapper.read(cmt_id);
	}
	
	@Override
	public int modify(ReplyVO vo) {
		log.info("modify......" + vo);
		return mapper.update(vo);
	}
	
	@Transactional // Ʈ����� ó��
	@Override
	public int remove(Long cmt_id) {
		log.info("remove......" + cmt_id);
		ReplyVO vo = mapper.read(cmt_id);
		boardMapper.updateReplyCnt(vo.getCmt_board(), -1);
		return mapper.delete(cmt_id);
	}
	
	@Override
	public List<ReplyVO> getList(Criteria cri, Long cmt_board){
		log.info("get Reply List of a Board " + cmt_board);
		return mapper.getListWithPaging(cri, cmt_board);
	}
	
	@Override
	public ReplyPageDTO getListPage(Criteria cri, Long cmt_board) {
		return new ReplyPageDTO(
				mapper.getCountByCmt_board(cmt_board),
				mapper.getListWithPaging(cri, cmt_board));
	}
	
}
