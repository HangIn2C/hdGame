package com.game.hdGame.page;

public class Paging {
	private int totalCount; // 게시물 갯수
	private int curPage; // 현재 페이지
	private int firstPage; // 첫번째 페이지 : 1
	private int lastPage; // 마지막 페이지 = firstPage * displayPage
	private int displayPage; // 화면에 보일 페이지 갯수
	
	private boolean first; // 첫 페이지 확인
	private boolean last; // 마지막 페이지 확인
	
	private String searchType; // 검색 타입
	private String searchKeyword; // 검색 키워드
	
	public Paging() {
		this.displayPage = 5; // 표시 갯수 5개 고정
		this.curPage = 1; // 처음 화면
	}
	
	// 요청 페이지
	public void setCurPage(int curPage) {
		if (curPage > 1) {
			this.curPage = curPage;
		} else {
			this.curPage = 1;
		} // if ~ else
	} // setCurPage
	
	public void calPage() {
		this.firstPage = this.curPage + (int)Math.floor( ((double)this.displayPage / 2) );
		this.lastPage = this.curPage - (int)Math.floor( ((double)this.displayPage / 2) );
		
		this.first = this.firstPage > 1 ? true :  false; 
		this.last = this.lastPage < this.totalCount ? true :  false; 
	}
	
	
	
}
