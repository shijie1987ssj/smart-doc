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

    private boolean isBuildTag = true;

    private List<CustomTag> customTag;

    public boolean isBuildTag() {
        return isBuildTag;
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

    public List<CustomTag> getCustomTag() {
        return customTag;
    }

    public void setCustomTag(List<CustomTag> customTag) {
        this.customTag = customTag;
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
