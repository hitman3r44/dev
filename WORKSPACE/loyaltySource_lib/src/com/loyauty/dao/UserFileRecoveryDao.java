package com.loyauty.dao;


import com.loyauty.model.UserFileRecovery;


public interface UserFileRecoveryDao extends BasicDao {

	// Part added  for user file recovery
	 boolean insertUserFileRecovery(UserFileRecovery userFileRecovery);
}
