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
package com.liferay.faces.bridge.internal;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.faces.FacesWrapper;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.xml.namespace.QName;


/**
 * @author  Neil Griffin
 */
public abstract class PortletConfigWrapper implements PortletConfig, FacesWrapper<PortletConfig> {

	public abstract PortletConfig getWrapped();

	public Map<String, String[]> getContainerRuntimeOptions() {
		return getWrapped().getContainerRuntimeOptions();
	}

	public String getDefaultNamespace() {
		return getWrapped().getDefaultNamespace();
	}

	public String getInitParameter(String name) {
		return getWrapped().getInitParameter(name);
	}

	public Enumeration<String> getInitParameterNames() {
		return getWrapped().getInitParameterNames();
	}

	public PortletContext getPortletContext() {
		return getWrapped().getPortletContext();
	}

	public String getPortletName() {
		return getWrapped().getPortletName();
	}

	public Enumeration<QName> getProcessingEventQNames() {
		return getWrapped().getProcessingEventQNames();
	}

	public Enumeration<String> getPublicRenderParameterNames() {
		return getWrapped().getPublicRenderParameterNames();
	}

	public Enumeration<QName> getPublishingEventQNames() {
		return getWrapped().getPublishingEventQNames();
	}

	public ResourceBundle getResourceBundle(Locale locale) {
		return getWrapped().getResourceBundle(locale);
	}

	public Enumeration<Locale> getSupportedLocales() {
		return getWrapped().getSupportedLocales();
	}
}
