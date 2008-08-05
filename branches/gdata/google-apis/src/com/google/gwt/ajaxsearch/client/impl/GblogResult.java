/*
 * Copyright 2007 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.ajaxsearch.client.impl;

import com.google.gwt.ajaxsearch.client.BlogResult;
import com.google.gwt.core.client.GWT;

/**
 * @gwt.beanProperties
 * @see http://code.google.com/apis/ajaxsearch/documentation/reference.html#_class_GblogResult
 */
public interface GblogResult extends GResult {
  public static final GblogResult IMPL =
    (GblogResult)GWT.create(GblogResult.class);

  public String getAuthor(BlogResult obj);
  public String getBlogUrl(BlogResult obj);
  public String getContent(BlogResult obj);
  public String getPostUrl(BlogResult obj);
  public String getPublishedDate(BlogResult obj);
  public String getTitle(BlogResult obj);
  public String getTitleNoFormatting(BlogResult obj);
}