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

import java.util.List;

/**
 * Description:
 * http request param info model
 *
 * @author yu 2018/06/18.
 * @author chenqi  2021/07/15
 */
public class ApiOpenApiCustomParam {

    private String infoDescriptionRefUri;

    private String logo;

    private boolean isBuildTag = true;

    /**
     * list of Authentication Request headers
     */
    private List<ApiAuthenticationParam> authenticationRequestHeaders;

    /**
     * 是否输出curl请求示例
     */
    private boolean requestXExampleCurl = true;

    private List<CustomTag> startCustomTag;

    private List<CustomTag> endCustomTag;

    public boolean isBuildTag() {
        return isBuildTag;
    }

    public List<CustomTag> getStartCustomTag() {
        return startCustomTag;
    }

    public void setStartCustomTag(List<CustomTag> startCustomTag) {
        this.startCustomTag = startCustomTag;
    }

    public void setBuildTag(boolean buildTag) {
        isBuildTag = buildTag;
    }

    public String getInfoDescriptionRefUri() {
        return infoDescriptionRefUri;
    }

    public void setInfoDescriptionRefUri(String infoDescriptionRefUri) {
        this.infoDescriptionRefUri = infoDescriptionRefUri;
    }

    public List<CustomTag> getEndCustomTag() {
        return endCustomTag;
    }

    public void setEndCustomTag(List<CustomTag> endCustomTag) {
        this.endCustomTag = endCustomTag;
    }

    public List<ApiAuthenticationParam> getAuthenticationRequestHeaders() {
        return authenticationRequestHeaders;
    }

    public void setAuthenticationRequestHeaders(List<ApiAuthenticationParam> authenticationRequestHeaders) {
        this.authenticationRequestHeaders = authenticationRequestHeaders;
    }

    public boolean isRequestXExampleCurl() {
        return requestXExampleCurl;
    }

    public void setRequestXExampleCurl(boolean requestXExampleCurl) {
        this.requestXExampleCurl = requestXExampleCurl;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public static ApiOpenApiCustomParam builder() {
        return new ApiOpenApiCustomParam();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"infoDescriptionRefUri\":\"")
                .append(infoDescriptionRefUri).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public static class CustomTag {
        private String name;

        private String descriptionRefUri;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescriptionRefUri() {
            return descriptionRefUri;
        }

        public void setDescriptionRefUri(String descriptionRefUri) {
            this.descriptionRefUri = descriptionRefUri;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("{");
            sb.append("\"tagName\":\"")
                    .append(name).append('\"');
            sb.append(",\"tagDescription\":\"")
                    .append(descriptionRefUri).append('\"');
            sb.append('}');
            return sb.toString();
        }
    }
}
