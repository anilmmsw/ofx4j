/*
 * Copyright 2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webcohesion.ofx4j.domain.data.signup;

import com.webcohesion.ofx4j.domain.data.TransactionWrappedResponseMessage;
import com.webcohesion.ofx4j.meta.Aggregate;
import com.webcohesion.ofx4j.meta.ChildAggregate;

/**
 * @author Ryan Heaton
 */
@Aggregate ( "ACCTINFOTRNRS" )
public class AccountInfoResponseTransaction extends TransactionWrappedResponseMessage<AccountInfoResponse> {

  private AccountInfoResponse message;

  /**
   * The wrapped message.
   *
   * @return The wrapped message.
   */
  @ChildAggregate ( required = true, order = 30 )
  public AccountInfoResponse getMessage() {
    return message;
  }

  /**
   * The wrapped message.
   *
   * @param message The wrapped message.
   */
  public void setMessage(AccountInfoResponse message) {
    this.message = message;
  }

  // Inherited.
  public AccountInfoResponse getWrappedMessage() {
    return getMessage();
  }
}