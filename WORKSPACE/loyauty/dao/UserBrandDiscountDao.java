package com.loyauty.dao;



import com.loyauty.model.UserBrandDiscount;

public interface UserBrandDiscountDao extends BasicGenericDao<UserBrandDiscount, Long> {
	
	/**
	 * get discount from user brand 
	 * @param userBrandDiscount
	 * @return
	 */
	UserBrandDiscount getUserBrandDiscount(UserBrandDiscount userBrandDiscount);
	
}
