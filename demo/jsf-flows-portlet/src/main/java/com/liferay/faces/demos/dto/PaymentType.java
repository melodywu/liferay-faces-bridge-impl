/**
 * Copyright (c) 2000-2019 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.demos.dto;

import java.io.Serializable;


/**
 * @author  Neil Griffin
 */
public class PaymentType implements Serializable {

	// serialVersionUID
	private static final long serialVersionUID = 6008653575825839159L;

	// Private Data Members
	private long paymentTypeId;
	private String name;

	public PaymentType(long paymentTypeId, String name) {
		this.paymentTypeId = paymentTypeId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public long getPaymentTypeId() {
		return paymentTypeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPaymentTypeId(long paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}
}
