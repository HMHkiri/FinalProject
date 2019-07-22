package com.web.store.service;

import java.util.List;

import com.web.store.model.CellBean;



public interface CellBeanService {
	
	public CellBean getCellphoneById(int productId);
	List<CellBean>  getCellsList(); 
	void  addProduct2(CellBean cell);
	CellBean getProductById(int productId);
	public List<CellBean> getAllCells();
	public void updateCell(int productId) ;
	void  update(CellBean cell);
}
