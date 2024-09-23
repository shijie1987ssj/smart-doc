/*
 * Copyright (C) 2018-2024 smart-doc
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.ly.doc.model;

import com.ly.doc.constants.ApiReqParamInTypeEnum;
import com.ly.doc.constants.DocGlobalConstants;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * Description: http request ApiAuthenticationParam info model
 *
 * @author yu 2018/06/18.
 * @author chenqi 2021/07/15
 */
public class ApiAuthenticationParam {

	/**
	 * Request param name
	 */
	private String name;

	/**
	 * Request param type
	 */
	private String type;

	/**
	 * Request param description
	 */
	private String desc;

	public static ApiAuthenticationParam builder() {
		return new ApiAuthenticationParam();
	}

	public static ApiReqParam convertToApiParam(ApiAuthenticationParam param) {
		ApiReqParam apiReqParam = new ApiReqParam();
		apiReqParam.setName(param.getName());
		apiReqParam.setDesc(param.getDesc());
		apiReqParam.setRequired(true);
		apiReqParam.setType(param.getType());
		apiReqParam.setValue("123");
		return apiReqParam;
	}

	public String getName() {
		return name;
	}

	public ApiAuthenticationParam setName(String name) {
		this.name = name;
		return this;
	}

	public String getType() {
		return type;
	}

	public ApiAuthenticationParam setType(String type) {
		this.type = type;
		return this;
	}

	public String getDesc() {
		return desc;
	}

	public ApiAuthenticationParam setDesc(String desc) {
		this.desc = desc;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApiAuthenticationParam that = (ApiAuthenticationParam) o;
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("\"name\":\"").append(name).append('\"');
		sb.append(",\"type\":\"").append(type).append('\"');
		sb.append(",\"desc\":\"").append(desc).append('\"');
		sb.append('}');
		return sb.toString();
	}

}
