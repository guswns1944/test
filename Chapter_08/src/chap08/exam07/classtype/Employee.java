package chap08.exam07.classtype;

public class Employee <T> { //�븯�굹�쓽 �겢�옒�뒪瑜� 留뚮뱾�뼱 1媛쒖쓽 generic �꽑�뼵

	private T abc; // �꽑�뼵�뻽�뜕 generic �뿉 蹂��닔紐� info �꽑�뼵

	public T getAbc() {//  �젒洹쇱젣�븳 private �젒洹쇱젣�븳�옄濡� getter �� setter �쑝濡� �뀑�똿�쓣 �빐以� 
									//�쇅遺��뿉�꽌 �젒洹쇳븷 �닔 �엳�룄濡� �빐以��떎.
		return abc;
	}

	public void setAbc(T abc) {
		this.abc = abc;
	}
	
	
	
}
