/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.gdb.model.v20181129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ResetAccountPasswordRequest extends RpcAcsRequest<ResetAccountPasswordResponse> {
	
	public ResetAccountPasswordRequest() {
		super("gdb", "2018-11-29", "ResetAccountPassword", "gdb");
	}

	private String skipAuth;

	private String accountPassword;

	private String accountName;

	private String dbInstanceId;

	public String getSkipAuth() {
		return this.skipAuth;
	}

	public void setSkipAuth(String skipAuth) {
		this.skipAuth = skipAuth;
		if(skipAuth != null){
			putQueryParameter("skipAuth", skipAuth);
		}
	}

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
		if(accountPassword != null){
			putQueryParameter("AccountPassword", accountPassword);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putQueryParameter("DbInstanceId", dbInstanceId);
		}
	}

	@Override
	public Class<ResetAccountPasswordResponse> getResponseClass() {
		return ResetAccountPasswordResponse.class;
	}

}
