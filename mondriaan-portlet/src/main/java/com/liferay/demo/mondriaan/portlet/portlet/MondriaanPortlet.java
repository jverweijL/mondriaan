package com.liferay.demo.mondriaan.portlet.portlet;

import com.liferay.demo.mondriaan.portlet.constants.MondriaanPortletKeys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;

/**
 * @author jverweij
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Mondriaan",
			"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MondriaanPortletKeys.MondriaanPortlet,
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MondriaanPortlet extends MVCPortlet {

	@Override
	public void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		super.doView(renderRequest, renderResponse);
	}

}