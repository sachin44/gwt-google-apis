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
package com.google.gwt.ajaxsearch.client;

import com.google.gwt.jsio.client.JSOpaque;

/**
 * Used with Search objects to determine the manner in which the associated
 * results will be displayed.
 * 
 * @see BlogSearch#setResultOrder(ResultOrder)
 * @see NewsSearch#setResultOrder(ResultOrder)
 * @see VideoSearch#setResultOrder(ResultOrder)
 */
public final class ResultOrder extends JSOpaque {

  /**
   * Order results in reverse chronological order.
   */
  public static final ResultOrder DATE = new ResultOrder("DATE");
  
  /**
   * Order results by relevance to the query.
   */
  public static final ResultOrder RELEVANCE = new ResultOrder("RELEVANCE");

  private ResultOrder(String order) {
    super("$wnd.GSearch.ORDER_BY_" + order);
  }
}