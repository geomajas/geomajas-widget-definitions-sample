/*
 * This is part of Geomajas, a GIS framework, http://www.geomajas.org/.
 *
 * Copyright 2008-2014 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the GNU Affero
 * General Public License. All contributions in this program are covered
 * by the Geomajas Contributors License Agreement. For full licensing
 * details, see LICENSE.txt in the project root.
 */

package example.client;

import com.google.gwt.core.client.GWT;

import example.client.widget.example.ExampleWidgetResource;

/**
 * Add a createResource methode per widget.
 */
public class ExampleClientBundleFactory {

	public ExampleWidgetResource createExampleWidgetResource() {
		return GWT.create(ExampleWidgetResource.class);
	}

}
