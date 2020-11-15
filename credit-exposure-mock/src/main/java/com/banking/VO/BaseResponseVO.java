package com.banking.VO;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public abstract class BaseResponseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1900625296336050879L;

}