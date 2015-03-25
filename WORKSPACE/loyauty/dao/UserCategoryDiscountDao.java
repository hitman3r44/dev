package com.loyauty.dao;


import com.loyauty.model.UserBrandDiscount;
import com.loyauty.model.UserCategoryDiscount;

public interface UserCategoryDiscountDao extends BasicGenericDao<UserCategoryDiscount, Long> {
	
	
	/**
	 * get discount from user brand 
	 * @param userBrandDiscount
	 * @return
	 */
	UserCategoryDiscount getUserCategoryDiscount(UserCategoryDiscount userCatDiscount);
}
